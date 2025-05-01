package lippia.web.steps;

import io.cucumber.java.en.Then;
import lippia.web.services.landingPageService;
import lippia.web.services.logInService;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class timeTrackerSteps {

    @Then("The client is on the time tracker page")
    public void TheClientIsOnTheDashboard(){

        logInService.timeTrackerPage();

        }

    }


