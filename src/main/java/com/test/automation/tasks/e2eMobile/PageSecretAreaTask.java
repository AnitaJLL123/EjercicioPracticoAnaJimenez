package com.test.automation.tasks.e2eMobile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.test.automation.userinterface.e2eMobile.PageSecretAreaUi.*;
import static com.test.automation.util.HelpJavaExcecuter.sleepSeconds;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PageSecretAreaTask implements Task {
    public static Performable permit() {

        return instrumented(PageSecretAreaTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        sleepSeconds(3);
        actor.attemptsTo(
                Ensure.that(LABEL_SECRET_AREA).text().contains("Secret Area"),
                Click.on(BUTTON_LOGOUT)
        );
        sleepSeconds(3);
    }
}
