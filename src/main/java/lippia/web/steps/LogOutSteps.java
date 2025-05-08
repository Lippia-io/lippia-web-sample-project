package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogOutService;

public class LogOutSteps {

    //Click on user button
    @When("The client click on 'user button'")
        public void clickOnUserButton(){
            LogOutService.userButton();
    }

    @And("The client click on 'Log out' button")
        public void clickLogOut(){
            LogOutService.logOutButton();
    }

    @Then("The system get you out from clockify")
        public void logOut(){
            LogOutService.logOutVerification();
    }


}
