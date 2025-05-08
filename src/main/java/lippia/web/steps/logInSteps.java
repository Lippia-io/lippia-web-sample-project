package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.landingPageService;
import lippia.web.services.logInService;

public class logInSteps extends PageSteps {


    //Manually log In
    @Given("The client is on clockify log in page")
        public void LogInPage() {
            logInService.logInPage();
    }

    @When("The client click on 'Log in manually'")
        public void theClientClickOnLogInManually() {
            logInService.logInManually();
    }

    @And("^The client set the email (.*)$")
        public void theClientSetTheEmail(String email) {
            logInService.setEmail( email );
    }

    @And("^The client set the password (.*)$")
        public void theClientSetThePassword(String password) {
            logInService.setPassword( password );
    }

    @And("The client click on Login button")
        public void theClientClickOnLogInButton() {
            logInService.clickLogIn();
    }

    @And("The client click on password")
        public void PasswordClick() {
            logInService.passwordClick();
    }

    @Then ("The system notified error message")
        public void InvalidEmail() {
            logInService.ErrorVerification();
    }
}
