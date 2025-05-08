package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import lippia.web.services.WorkspaceService;
import lippia.web.services.logInService;

public class WorkspaceSteps extends PageSteps {



    @When("The client click on three points button")
    public void clickOnThreePointsButton (){
        WorkspaceService.threePointsButton();
    }


    @And("The client click on 'Manage workspaces'")
        public void clickOnManageWorkspaces(){
            WorkspaceService.manageWorkspaces();
    }

    @And("The client click on 'CREATE NEW WORKSPACE'")
        public void clickCreateNewWorkspace() {
            WorkspaceService.createNewWorkspaceButton();
        }

    @And("^The client set the new workspace name '(.*)'$")
        public void  setNewWorkspaceName(String name) {
            WorkspaceService.newWorkspaceName( name );

        }

    @And("The client click on 'Create'")
        public void createClick(){
            WorkspaceService.createWorkspace();
        }

    @Then ("The system shown the new workspace created")
        public void createdWorkspaceNotification(){
            WorkspaceService.createdWorkspaceNotification();
        }

    @And("The client click on 'X'")
    public void theClientClickOnX() {
        WorkspaceService.X();
    }


    @And("^The client set '(.*)'$")
    public void theClientSetDELETE(String DELETE) {
        WorkspaceService.setDelete( DELETE );
    }

    @And("The client click on 'DELETE WORKSPACE'")
    public void theClientClickOnDELETEWORKSPACE() {
        WorkspaceService.clickDelete();
    }

    @Then("The system shown the new workspace deleted")
    public void theSystemShownTheNewWorkspaceDeleted() {
        WorkspaceService.deletedWorkspace();
    }
}
