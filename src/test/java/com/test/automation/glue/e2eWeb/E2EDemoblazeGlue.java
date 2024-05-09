package com.test.automation.glue.e2eWeb;

import com.test.automation.model.e2eWeb.ProductoModel;
import com.test.automation.model.e2eWeb.SingUpModel;
import com.test.automation.tasks.NavigateTo;
import com.test.automation.tasks.e2eWeb.*;
import com.test.automation.userinterface.e2eWeb.PageLogInUi;
import com.test.automation.userinterface.e2eWeb.PageSignUpUi;
import com.test.automation.util.EnvironmentConfig;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class E2EDemoblazeGlue {
    EnvironmentConfig environmentConfig = new EnvironmentConfig();

    @Given("que el {actor} ingresa a la pagina Demoblaze")
    public void queElClienteIngresaALaPaginaDemoblaze(Actor actor) {
        givenThat(actor).attemptsTo(
                NavigateTo.page(PageSignUpUi.class)
        );
    }
    @When("el ingresa sus credenciales para crear una cuenta {string},{string}")
    public void elIngresaSusCredencialesParaCrearUnaCuenta(String username,String password) {
        when(theActorInTheSpotlight()).wasAbleTo(
                SingUpTask.whitCredentials(new SingUpModel(username, password))
        );
    }

    @Then("visualiza la pagina inicio {string}")
    public void visualizaLaPaginaInicio(String mensaje) {
        then(theActorInTheSpotlight()).should(
                seeThat(the(PageSignUpUi.LABEL_MENSAJE), containsText(mensaje))
        );
    }

    @When("el ingresa sus credenciales para acceder a la pagina {string},{string}")
    public void elIngresaSusCredencialesParaAccederALaPagina(String username,String password) {
        when(theActorInTheSpotlight()).wasAbleTo(
                LogInTask.whitCredentials(new SingUpModel(username, password))
        );
    }

    @Then("visualiza la pagina inicio y tambien confimamos que apareca el nombre de usuario en la esquina superior derecha {string},{string}")
    public void visualizaLaPaginaInicioYTambienConfimamosQueAparecaElNombreDeUsuarioEnLaEsquinaSuperiorDerecha(String mensaje, String username) {
        then(theActorInTheSpotlight()).should(
                seeThat(the(PageSignUpUi.LABEL_MENSAJE), containsText(mensaje)),
                seeThat(the(PageLogInUi.LABEL_MENSAJEWELCOME),containsText("Welcome"+" "+ username))
        );
    }

    @Given("que el {actor} ingresa a la pagina Demoblaze con sus credenciales {string},{string} consulta una categoria {string} y selecciona un producto {string}")
    public void queElClienteIngresaALaPaginaDemoblazeConSusCredencialesYConsultaUnaCategoriaYSeleccionaUnProducto(Actor actor, String username, String password, String categoria, String producto) {
        givenThat(actor).attemptsTo(
                NavigateTo.page(PageSignUpUi.class),
                LogInTask.whitCredentials(new SingUpModel(username, password)),
                AgregarProductoTask.whitCredentials(new ProductoModel(categoria,producto))
        );
    }

    @When("el selecciona un producto y agrega el carrito de compras, eliminamos el producto seleccionado {string}")
    public void elSeleccionaUnProductoYAgregaElCarritoDeComprasEliminamosElProductoSeleccionado(String producto) {
        when(theActorInTheSpotlight()).attemptsTo(
                CartTask.whitCredentials(producto)
        );
    }

    @Then("realizamos un Log Out y regresamos a la pagina principal")
    public void realizamosUnLogOutYRegresamosALaPaginaPrincipal() {
        then(theActorInTheSpotlight()).attemptsTo(
                LogoutTask.logoutTask(),
                Ensure.that(PageSignUpUi.LABEL_MENSAJE).text().contains("PRODUCT STORE")

        );
    }
}
