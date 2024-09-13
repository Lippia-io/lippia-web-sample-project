package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lippia.web.services.LogoutService;

public class LogoutSteps {


    @When("^user clicks (.*) button$")
    public void userClicksOnAvatarButton(String button) {
        LogoutService.clickOnAvatar(button);
    }

    @And("^user clicks (.*) button to log out$")
    public void userClicksOnLogoutButton(String button) {
        LogoutService.clickOnLogOutButton(button);
    }

}
