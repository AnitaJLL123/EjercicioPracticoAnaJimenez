package com.test.automation.tasks.e2eMobile;

import com.test.automation.model.e2eMobile.LoginModel;
import com.test.automation.model.e2eWeb.SingUpModel;
import com.test.automation.tasks.e2eWeb.SingUpTask;
import com.test.automation.userinterface.e2eWeb.PageSignUpUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.test.automation.userinterface.e2eMobile.PageLoginUi.*;
import static com.test.automation.util.HelpJavaExcecuter.sleepSeconds;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PageLoginTask implements Task {
    private final String usuario;
    private final String password;

    public PageLoginTask(LoginModel data) {
        this.usuario = data.getUsuario();
        this.password = data.getPassword();
    }
    public static PageLoginTask whitCredentials(LoginModel data) {
        return Tasks.instrumented(PageLoginTask.class, data);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        sleepSeconds(3);
        actor.attemptsTo(
                Ensure.that(LABEL_LOGIN).text().contains("Login"),
                Enter.keyValues(usuario).into(INPUT_TEXT_USERNAME),
                Enter.keyValues(password).into(INPUT_TEXT_PASSSWORD)
        );
        sleepSeconds(3);
        actor.attemptsTo(
                Click.on(BUTTON_LOGIN)
        );
    }
}
