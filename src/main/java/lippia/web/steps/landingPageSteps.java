package lippia.web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.landingPageService;

public class landingPageSteps {

    //Get Access to log In From Clockify Home Page
    @Given("^The client is on landing page$")
    public void TheClientIsOnLandingPage() {
        landingPageService.navegarWebClockify();
    }

    @When("^The client click on LogIn button(.*)$")
    public void TheClientClickOnLogIn(String criteria) {
        landingPageService.clickLogInButton();
    }

    @Then("The client get access to clockify LogIn page")
    public void TheClientGetAccessToClockifyLogIn() {
        landingPageService.landingPage();
    }

}
