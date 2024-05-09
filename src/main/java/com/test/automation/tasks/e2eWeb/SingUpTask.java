package com.test.automation.tasks.e2eWeb;

import com.test.automation.model.e2eWeb.SingUpModel;
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

public class SingUpTask implements Task{
    private final String username;
    private final String password;

    public SingUpTask(SingUpModel data) {
        this.username = data.getUsername();
        this.password = data.getPassword();
    }
    public static SingUpTask whitCredentials(SingUpModel data) {
        return Tasks.instrumented(SingUpTask.class, data);
    }

    @Step("{0} crear cuenta")
    @Override
    public <T extends Actor> void performAs(T actor) {
        sleepSeconds(1);
        actor.attemptsTo(
                Click.on(PageSignUpUi.LABEL_SINGUP),
                Enter.keyValues(username).into(PageSignUpUi.INPUT_USERNAME),
                Enter.keyValues(password).into(PageSignUpUi.INPUT_PASSWORD)
                );
        sleepSeconds(1);
        actor.attemptsTo(
                Click.on(PageSignUpUi.BUTTON_SINGUP)
        );
        accept(actor);
        sleepSeconds(1);
        actor.attemptsTo(
                Click.on(PageSignUpUi.BUTTON_CLOSE)
        );
    }
    public void accept(Actor actor) {
        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
    }
}
