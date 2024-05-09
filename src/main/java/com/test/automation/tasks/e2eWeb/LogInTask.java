package com.test.automation.tasks.e2eWeb;

import com.test.automation.model.e2eWeb.SingUpModel;
import com.test.automation.userinterface.e2eWeb.PageLogInUi;
import com.test.automation.userinterface.e2eWeb.PageSignUpUi;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.test.automation.util.HelpJavaExcecuter.sleepSeconds;

public class LogInTask implements Task{
    private final String username;
    private final String password;

    public LogInTask(SingUpModel data) {
        this.username = data.getUsername();
        this.password = data.getPassword();
    }
    public static LogInTask whitCredentials(SingUpModel data) {
        return Tasks.instrumented(LogInTask.class, data);
    }

    @Step("{0} iniciar sesion")
    @Override
    public <T extends Actor> void performAs(T actor) {
        sleepSeconds(1);
        actor.attemptsTo(
                Click.on(PageLogInUi.LABEL_LOGIN),
                Enter.keyValues(username).into(PageLogInUi.INPUT_LOGINUSERNAME),
                Enter.keyValues(password).into(PageLogInUi.INPUT_LOGINPASSWORD)
                );
        sleepSeconds(1);
        actor.attemptsTo(
                Click.on(PageLogInUi.BUTTON_LOGIN)
        );
    }
}
