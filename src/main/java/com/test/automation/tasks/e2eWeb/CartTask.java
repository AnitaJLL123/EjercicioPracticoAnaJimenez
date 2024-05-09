package com.test.automation.tasks.e2eWeb;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.test.automation.userinterface.e2eWeb.PageProductoUi.*;
import static com.test.automation.util.HelpJavaExcecuter.sleepSeconds;

public class CartTask implements Task {
    private final String producto;

    public CartTask(String producto) {
        this.producto = producto;

    }
    public static CartTask whitCredentials(String producto) {

        return Tasks.instrumented(CartTask.class, producto);
    }
    @Step("{0} Eliminar producto")
    @Override
    public <T extends Actor> void performAs(T actor) {
        accept(actor);
        sleepSeconds(1);
        actor.attemptsTo(
                Click.on(LABEL_CART),
                Ensure.that(LABEL_PRODUCTOCART.of(producto)).text().contains(producto)
                );
        sleepSeconds(1);
        actor.attemptsTo(
                Click.on(LABEL_DELETE)
        );
    }

    public void accept(Actor actor) {
        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
    }
}

