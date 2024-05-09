package com.test.automation.tasks.e2eMobile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.test.automation.userinterface.e2eMobile.PageLogInicioUi.*;
import static com.test.automation.util.HelpJavaExcecuter.sleepSeconds;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PageLoginAInicioTask implements Task {
    public static Performable permit() {

        return instrumented(PageLoginAInicioTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        sleepSeconds(3);
        actor.attemptsTo(
                Click.on(BUTTON_ATRAS),
                Click.on(BUTTON_ATRAS)
        );
        sleepSeconds(3);
    }
}
