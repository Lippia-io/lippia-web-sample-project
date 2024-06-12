package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.TrackerService;

public class TrackerSteps {

    private Object ProjectService;

    @Given("^user is logged in Clockify with email (.*) and password (.*)$")
    public void userIsLoggedIn(String email, String password) {
        LoginService.doLogIn(email, password);
    }

    @When("^user clicks option (.*) from the menu$")
    public void userClicksOptionFromTheMenu(String button) {
        TrackerService.click(button);
    }


    @When("^user clicks (.*) in the side menu$")
    public void userClicksProjectsInTheSideMenu(String button) {
        TrackerService.clickOnProjects(button);
    }

    @When("^user inputs (.*) time entry to indicate the start of the period$")
    public void userInputsStartTimeEntry(String startTime) {
        TrackerService.inputStartTimeEntry(startTime);
    }

    @And("^user inputs (.*) time entry to indicate the end of the period$")
    public void userInputsEndsTimeEntry(String endTime) {
        TrackerService.inputEndTimeEntry(endTime);
    }

    @And("^user clicks (.*) button to add a new time entry$")
    public void userClicksAddButtonToAddANewTimeEntry(String button) {
        TrackerService.clickOnAddTimeEntry(button);
    }

    @When("^user inputs a description (.*)$")
    public void userInputsADescription(String description) {
        TrackerService.inputDescription(description);
    }


    @And("^user had set a time entry with description (.*), start time (.*) and end time (.*)$")
    public void userHadSetATimeEntry(String description, String startTime, String endTime) {
        TrackerService.setTimeEntry(description, startTime, endTime);
    }


    @When("^user updates the description to (.*)$")
    public void userUpdatesTheDescription(String newDescription) {
        TrackerService.updateTimeEntryDescription(newDescription);
    }

    @When("^user updates the start time to (.*)$")
    public void userUpdatesTheStartTime(String newStartTime) {
        TrackerService.updateTimeEntryStartTime(newStartTime);
    }
    @When("^user updates the end time to (.*)$")
    public void userUpdatesTheEndTime(String newEndTime) {
        TrackerService.updateTimeEntryEndTime(newEndTime);
    }


    @Then("^time entry with description (.*) has been created$")
    public void timeEntryHasBeenCreated(String description) {
        TrackerService.checkTimeEntry(description);
    }

    @Then("^time entry with description (.*) has been updated$")
    public void timeEntryDescriptionHasBeenUpdated(String newDescription) {
        TrackerService.checkTimeEntryUpdatedDescription(newDescription);
    }


     @Then("^time entry with start time (.*) has been updated$")
     public void timeEntryStartTimeHasBeenUpdated(String newStartTime) {
         TrackerService.checkTimeEntryUpdatedStartTime(newStartTime);
     }
    @Then("^time entry with end time (.*) has been updated$")
    public void timeEntryEndTimeHasBeenUpdated(String newEndTime) {
        TrackerService.checkTimeEntryUpdatedEndTime(newEndTime);
    }
}
