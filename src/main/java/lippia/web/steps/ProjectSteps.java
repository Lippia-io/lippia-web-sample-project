package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ProjectService;
import lippia.web.services.logInService;

public class ProjectSteps extends PageSteps {

    @Given("The client is on clockify page")
    public void clockifyHomePage() {
        logInService.timeTrackerPage();
    }

    @When("The client click on 'Project'")
    public void clickOnProject(){
        ProjectService.projectButton();
    }

    @And("The client click on 'Create new project'")
    public void createNewProject(){
        ProjectService.createNewProject();
    }

    @And("^The client set the project name '(.*)'$")
    public void setProjectName(String name){
        ProjectService.setNewProjectName( name );
    }

    @And("The client click on 'Create Project'")
    public void clickOnCreateProject(){
        ProjectService.clickCreate();
    }

    @Then("The system show success message")
    public void createdMessage(){
        ProjectService.createdProject();
    }

}
