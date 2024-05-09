package com.test.automation.tasks.e2eWeb;

import com.test.automation.model.e2eWeb.ProductoModel;
import com.test.automation.userinterface.e2eWeb.PageLogInUi;
import com.test.automation.userinterface.e2eWeb.PageSignUpUi;
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

public class AgregarProductoTask implements Task {
    private final ProductoModel productoModel;

    public AgregarProductoTask(ProductoModel productoModel) {
        this.productoModel = productoModel;
    }
    public static AgregarProductoTask whitCredentials(ProductoModel productoModel) {
        return Tasks.instrumented(AgregarProductoTask.class, productoModel);
    }

    @Step("{0} Seleccionar y agregar producto")
    @Override
    public <T extends Actor> void performAs(T actor) {
        sleepSeconds(1);
        actor.attemptsTo(
                Click.on(LABEL_CATEGORIA.of(productoModel.getCategoria())),
                Ensure.that(LABEL_CATEGORIA.of(productoModel.getCategoria())).text().contains(productoModel.getCategoria())
                );
        sleepSeconds(1);
        actor.attemptsTo(
                Click.on(LABEL_PRODUCTO.of(productoModel.getProducto())),
                Ensure.that(LABEL_PRODUCTO_PROD.of(productoModel.getProducto())).text().contains(productoModel.getProducto())
                );
        sleepSeconds(1);
        actor.attemptsTo(
                Ensure.that(LABEL_PRODUCTODESCRIPCION.of(productoModel.getProducto())).text().contains("Product description"),
                Click.on(BUTTON_ADDTOCART)
        );
        sleepSeconds(1);
    }
}

