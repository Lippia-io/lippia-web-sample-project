package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.ProjectService;

public class ProjectSteps {
    @Then("^user is in (.*) to start creating projects$")
    public void userGoesToProjects(String option) {
        ProjectService.navigateTo(option);
    }

    @And("^user clicks (.*) button to go to create new project$")
    public void userClicksCreateNewProjectButton(String button) {
        ProjectService.clickOnCreateNewProjectButton(button);
    }

    @And("^user inputs project name (.*)$")
    public void userInputsProjectName(String name) {
        ProjectService.inputProjectName(name);
    }

    @And("^user clicks (.*) to create the project$")
    public void userClicksCreateToCreateTheProject(String button) {
        ProjectService.clickOnCreateButton(button);
    }


    @Then("^project with name (.*) has been created$")
    public void projectHasBeenCreated(String name) {
        ProjectService.checkProject(name);
    }
}
