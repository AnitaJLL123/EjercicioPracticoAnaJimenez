package com.test.automation.tasks.e2eMobile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.test.automation.userinterface.e2eMobile.PageChoseAnAwesomeViewUi.*;
import static com.test.automation.util.HelpJavaExcecuter.sleepSeconds;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PageInicioTask implements Task {
    public static Performable permit() {

        return instrumented(PageInicioTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        sleepSeconds(3);
        actor.attemptsTo(
                Ensure.that(LABEL_TEXT_THEAPP).text().contains("The App"),
                Ensure.that(LABEL_TEXT_CHOOSE).text().contains("Choose An Awesome View"),
                Click.on(BUTTON_LOGIN_SCREEN)
        );
        sleepSeconds(3);
    }
}
