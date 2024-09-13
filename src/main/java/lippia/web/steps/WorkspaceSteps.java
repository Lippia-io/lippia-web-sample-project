package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.WorkspaceService;

public class WorkspaceSteps {
    @When("^user clicks (.*) to see workspace options$")
    public void userClicksWorkspaceDropdownOptions(String button) {
        WorkspaceService.clickOnWorkspaceDropdownOptions(button);
    }

    @And("^user clicks (.*) to go to workspaces$")
    public void userClicksManageWorkspaces(String button) {
        WorkspaceService.clickOnManageWorkspaces(button);
    }
    @And("^user clicks (.*) to go to workspace settings$")
    public void userClicksWorkspaceSettings(String button) {
        WorkspaceService.clickWorkspaceSettings(button);
    }

    @And("^user clicks (.*) to go to create new workspace$")
    public void userClicksCreateNewWorkspaceButton(String button) {
        WorkspaceService.clickOnCreateNewWorkspaceButton(button);
    }

    @And("^user inputs workspace name (.*)$")
    public void userInputsWorkspaceName(String name) {
        WorkspaceService.inputWorkspaceName(name);
    }


    @And("^user clicks (.*) to create the workspace$")
    public void userClicksCreateButton(String button) {
        WorkspaceService.clickOnCreateButton(button);
    }



    @Then("^user is in workspaces page (.*)$")
    public void userIsInWorkspacesPage(String url) {
        WorkspaceService.navigateToWorkspaces(url);
    }

    @And("^user updates the workspace name to (.*)$")
    public void userUpdatesTheWorkspaceName(String newName) {
        WorkspaceService.updateWorkspaceName(newName);
    }
    @Then("^workspace with name (.*) has been created$")
    public void workspaceHasBeenCreated(String name) {
        WorkspaceService.checkWorkspace(name);
    }
    @Then("^workspace with name (.*) has been updated$")
    public void workspaceWithNameNameHasBeenUpdated(String newName) {
        WorkspaceService.checkWorkspaceUpdate(newName);
    }
}
