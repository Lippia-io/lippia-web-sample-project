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
    @Given("^The client is on clockify log in page$")
    public void LogInPage() {
        logInService.logInPage();
    }

    @When("The client click on 'Log in manually'")
    public void theClientClickOnLogInManually(String arg0) {
        logInService.logInManually();
    }

    @And("the client set the email '(.*)'")
    public void theClientSetTheEmail(String email) {
        logInService.setEmail( email );
    }

    @And("the client set the password (.*)")
    public void theClientSetThePassword(String password) {
        logInService.setPassword( password );
    }

    @And("the client click on LogIn button")
    public void theClientClickOnLogInButton() {
        logInService.clickLogIn();
    }


}
