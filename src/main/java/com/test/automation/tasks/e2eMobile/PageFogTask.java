package com.test.automation.tasks.e2eMobile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.test.automation.userinterface.e2eMobile.PageFogUi.*;

import static com.test.automation.util.HelpJavaExcecuter.sleepSeconds;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PageFogTask implements Task {
    public static Performable permit() {

        return instrumented(PageFogTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        sleepSeconds(3);
        actor.attemptsTo(
                Click.on(LABEL_FOG)
                );
        sleepSeconds(3);
        actor.attemptsTo(
                Click.on(BUTTON_OK)
        );
    }
}
