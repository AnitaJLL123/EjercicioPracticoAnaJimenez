package com.test.automation.tasks.e2eMobile;

import com.test.automation.model.e2eMobile.ClipBoardModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.test.automation.userinterface.e2eMobile.PageClipBoardTextoUi.*;
import static com.test.automation.userinterface.e2eMobile.PageLoginUi.*;
import static com.test.automation.util.HelpJavaExcecuter.sleepSeconds;

public class PageClipBoardTextoTask implements Task {
    private final String nombre;

    public PageClipBoardTextoTask(ClipBoardModel data) {
        this.nombre = data.getNombre();
    }
    public static PageClipBoardTextoTask whitCredentials(ClipBoardModel data) {
        return Tasks.instrumented(PageClipBoardTextoTask.class, data);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        sleepSeconds(3);
        actor.attemptsTo(
                Enter.keyValues(nombre).into(INPUT_TEXT_CLIPBOARD)
        );
        sleepSeconds(3);
        actor.attemptsTo(
                Click.on(BUTTON_SET_CLIPBOARD)
        );
        sleepSeconds(3);
        actor.attemptsTo(
                Click.on(BUTTON_REFRESH_CLIPBOARD)
        );
        sleepSeconds(3);
    }
}
