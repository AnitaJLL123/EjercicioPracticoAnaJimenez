package com.test.automation.tasks.e2eMobile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.test.automation.userinterface.e2eMobile.PageListDemoUi.*;
import static com.test.automation.util.HelpJavaExcecuter.sleepSeconds;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PageListDemoTask implements Task {
    public static Performable permit() {

        return instrumented(PageListDemoTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        sleepSeconds(3);
        actor.attemptsTo(
                Click.on(BUTTON_LIST_DEMO)
                );
        sleepSeconds(3);
        actor.attemptsTo(
                Click.on(BUTTON_FOG)
        );
        sleepSeconds(3);
        actor.attemptsTo(
                Ensure.that(BUTTON_LEARN_MORE_ABOUT_FOG).text().contains("LEARN MORE ABOUT FOG"),
                Click.on(BUTTON_LEARN_MORE_ABOUT_FOG)
        );
        sleepSeconds(3);
    }
}
