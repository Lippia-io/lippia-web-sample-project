package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.UpdateService;

public class UpdateSteps {

    @And("The client click on 'SETTINGS'")
        public void theClientClickOnSettings() throws InterruptedException {
        UpdateService.clickOnSettings();
    }

    @And("^The client set the new name '(.*)'$")
        public void setTheNewNameCrowdar(String name) {
            UpdateService.updateNewWorkspaceName( name );
    }


    @And("The client click on 'PROJECTS'")
        public void clickOnPROJECTS() {
            UpdateService.clickOnProjects();
    }

    @Then("The system shows a successfully updated info notification")
        public void updatedInfoNotification() {
            UpdateService.updateNotification();
    }
}
