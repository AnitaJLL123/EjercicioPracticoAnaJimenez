package com.test.automation.model;

import io.cucumber.java.Scenario;
import lombok.Getter;

import static com.test.automation.util.constants.Messages.ST_UTILITY_CLASS;

public class ModelScenario {

    @Getter
    private static Scenario scenario;

    private ModelScenario() {
        throw new IllegalStateException(ST_UTILITY_CLASS);
    }

    public static void setScenario(Scenario scenario) {
        ModelScenario.scenario = scenario;
    }
}
