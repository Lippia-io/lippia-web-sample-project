package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.ClockifyConstants;
import lippia.web.services.ClockifyService;
import lippia.web.services.LandingPageClockifyService;

import static lippia.web.services.ClockifyService.*;

public class ClockifyLoguinSteps extends PageSteps {


    @Given("el usuario abrió la URL https:\\/\\/app.clockify.me\\/es\\/login")
    public void elUsuarioAbrióLaURL() {
        LandingPageClockifyService.navegarWeb();
    }

    @Given("^The client isn't on Clockify page$")
    public void isNotHome() {
        LandingPageClockifyService.navegarWeb();
        throw new RuntimeException("the client is not on Clockify page");
    }


    @And("el usuaio se registró en clockify")
    public void elUsuaioSeRegistróEnClockify() {
    }

    @When("el usuario hace click en el link Iniciar sesión manualmente")
    public void iniciarSesiónManualmente() {

        ClockifyService.clickIniciarManual();
    }

    @And("el usuario hace click en campo input email e ingresa el correo electronico valido (.*)$")
    public void ingresoMailValido(String mail) {

        ClockifyService.ingresarMail(mail);

    }

    @And("el usuario hace click en campo input password e ingresa el pass valido (.*)$")
    public void ingresaPassValido(String pass) {

        ClockifyService.ingresarPass(pass);
    }

    @And("el usuario hace click en botón submit INICIAR SESIÓN")
    public void clickButtonSubmit() {

        ClockifyService.clickButton();
    }

    @Then("el usuario inicia sesion correctamente posisicionandose en el modulo RASTREADOR")
    public void elUsuarioIniciaSesionCorrectamentePosisicionandoseEnElModuloRASTREADOR() {
    }



}



