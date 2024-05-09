package com.test.automation.tasks.e2eWeb;

import com.test.automation.userinterface.e2eWeb.PageSignUpUi;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.test.automation.userinterface.e2eWeb.PageProductoUi.*;
import static com.test.automation.util.HelpJavaExcecuter.sleepSeconds;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class LogoutTask implements Task {
    public static Performable logoutTask() {
        return instrumented(LogoutTask.class);
    }
    @Step("{0} Seleccionar y agregar producto")
    @Override
    public <T extends Actor> void performAs(T actor) {
        sleepSeconds(1);
        actor.attemptsTo(
                Click.on(BUTTON_LOGOUT)
        );
        sleepSeconds(1);
    }

}

