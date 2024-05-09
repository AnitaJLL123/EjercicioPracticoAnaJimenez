package com.test.automation.glue.e2eMobile;

import com.test.automation.model.e2eMobile.ClipBoardModel;
import com.test.automation.model.e2eMobile.LoginModel;
import com.test.automation.tasks.e2eMobile.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;

import static com.test.automation.userinterface.e2eMobile.PageLogInicioUi.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TheAppGlue {

    @Given("que el {actor} de la aplicacion ingresa y visualiza los textos The App y Choose An Awesome View")
    public void queElUsuarioDeLaAplicacionIngresaYVisualizaLosTextosTheAppYChooseAnAwesomeView(Actor actor) {
        givenThat(actor).attemptsTo(
                PageInicioTask.permit()
        );
    }
    @When("el usuario hace click en Login Screen se abrira la pantalla del login donde se ingresa {string} y {string}")
    public void elUsuarioHaceClickEnLoginScreenSeAbriraLaPantallaDelLoginDondeSeIngresaY(String usuario, String password) {
        when(theActorInTheSpotlight()).wasAbleTo(
                PageLoginTask.whitCredentials(new LoginModel(usuario, password))
        );
    }
    @Then("se muestra la pantalla de Login con el boton Logout y el text Secret Area")
    public void seMuestraLaPantallaDeLoginConElBotonYElTextSecretArea(){
        then(theActorInTheSpotlight()).attemptsTo(
                PageSecretAreaTask.permit()
        );
    }
    @Then("hacemos click en el boton Logout y nos direcciona a la pantalla del login.")
    public void hacemosClickEnElBotonLogoutYNosDireccionaALaPantallaDelLogin() {
        then(theActorInTheSpotlight()).attemptsTo(
                PageLoginAInicioTask.permit()
        );
    }
    @Then("hace click en la flecha de atras y redirecciona al home de la apk")
    public void haceClickEnLaFlechaDeAtrasYRedireccionaAlHomeDeLaApk() {
        then(theActorInTheSpotlight()).attemptsTo(
                Click.on(BUTTON_ATRAS)

        );
    }

    @Given("el {actor} hace clic en el link List DemoFog y luego en Learn More AboutFog")
    public void elUsuarioHaceClicEnElLinkListDemoFogYLuegoEnLearnMoreAboutFog(Actor actor) {
        givenThat(actor).attemptsTo(
                PageListDemoTask.permit()
        );
    }
    @When("se muestra una pantalla con el texto Fog")
    public void seMuestraUnaPantallaConElTextoFog() {
        when(theActorInTheSpotlight()).attemptsTo(
                PageFogTask.permit()
        );
    }
    @Given("el {actor} que hace clic en el link ClipBoard Demo")
    public void elUsuarioQueHaceClicEnElLinkClipBoardDemo(Actor actor) {
        givenThat(actor).attemptsTo(
                PageClipDemoTask.permit()
        );
    }
    @When("el ingrese el texto {string} en el campo, haga clic en el boton Refresh ClipBoard Text")
    public void elIngreseElTextoEnElCampoHagaClicEnElBotonRefreshClipBoardText(String nombre) {
        when(theActorInTheSpotlight()).wasAbleTo(
                PageClipBoardTextoTask.whitCredentials(new ClipBoardModel(nombre))
        );
    }
    @Then("se replicara el texto ingresado en la pantalla")
    public void seReplicaraElTextoIngresadoEnLaPantalla() {
        then(theActorInTheSpotlight()).attemptsTo(
                PageValidacionTextoClipTask.permit()
        );
    }
}
