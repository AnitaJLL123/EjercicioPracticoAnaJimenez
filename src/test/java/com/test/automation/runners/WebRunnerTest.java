package com.test.automation.runners;

import com.test.automation.util.constants.Paths;
import com.test.automation.util.execution.AfterSuite;
import com.test.automation.util.execution.BeforeSuite;
import com.test.automation.util.execution.ControlExecution;
import com.test.automation.util.execution.CustomCucumberWithSerenityRunner;
import com.test.automation.util.overwritedata.FeatureOverwrite;
import io.cucumber.junit.CucumberOptions;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static com.test.automation.util.constants.Constants.EXT_FEATURE;

@Slf4j
@RunWith(CustomCucumberWithSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.test.automation.hooks", "com.test.automation.glue"},
        plugin = {"json:build/cucumber-reports/json/cucumber.json", "summary"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        //tags = "@demoblaze"  //Pruebas E2E Web
        tags = "@mobileTheApp" //Activar para ejecutar pruebas mobiles y Comentar @tags = "@demoblaze"
)

public class WebRunnerTest {

    private WebRunnerTest() {
    }

    @BeforeSuite
    public static void init() throws IOException {
        ControlExecution.featuresSegmentation();
        List<String> features = FeatureOverwrite.listFilesByFolder(new File(Paths.featuresPath()));
        for (String feature : features) {
            if (feature.contains(EXT_FEATURE)) {
                FeatureOverwrite.overwriteFeatureFileAdd(feature);
            }
        }
        FeatureOverwrite.clearListFilesByFolder();
    }

    @AfterSuite
    public static void after() {
        log.info("=====> End Execution SerenityBDD");
    }
}