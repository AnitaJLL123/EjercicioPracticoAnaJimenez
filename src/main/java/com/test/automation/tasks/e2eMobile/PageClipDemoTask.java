package com.test.automation.tasks.e2eMobile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.test.automation.userinterface.e2eMobile.PageClipDemoUi.*;
import static com.test.automation.util.HelpJavaExcecuter.sleepSeconds;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PageClipDemoTask implements Task {
    public static Performable permit() {

        return instrumented(PageClipDemoTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        sleepSeconds(3);
        actor.attemptsTo(
                Click.on(BUTTON_CLIPBOARD_DEMO)
                );
        sleepSeconds(3);
    }
}
