package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.ResetService;

public class LoginSteps {

    @Given("^user is in login page (.*)$")
    public void userIsInLogIn(String url) {
        LoginService.navigateTo(url);
    }

    @Then("^user is in manual login page (.*)$")
    public void userIsInManualLogIn(String url) {
        LoginService.navigateTo(url);
    }
    @When("^user clicks (.*) button to log in manually$")
    public void clickOnLogInManuallyButton(String button) {
        LoginService.clickOnLogInManuallyButton(button);
    }

    @And("^user clicks (.*) button to log in$")
    public void clickOnLogInButton(String button) {
        LoginService.clickOnLogInButton(button);
    }

    @When("^user inputs email (.*)$")
    public void userInputsEmail(String email) {
        LoginService.inputEmail(email);
    }

    @And("^user inputs password (.*)$")
    public void userInputsPassword(String password) {
        LoginService.inputPassword(password);
    }


    @And("^user clicks (.*) button to show password$")
    public void userShowsPassword(String button) {
        LoginService.showPassword(button);
    }

    @And("^user clicks (.*) button to hide password$")
    public void userHidesPassword(String button) {
        LoginService.hidePassword(button);
    }

    @And("^user clicks (.*) button to reset password$")
    public void userClicksOnResetButton(String button) {
        LoginService.clickOnReset(button);
    }

    @Then("^invalid credentials error (.*) is displayed$")
    public void invalidCredentialsErrorIsDisplayed(String error) {
        LoginService.showInvalidCredentialsError(error);
    }

    @Then("input email error ^(.*) is displayed$")
    public void requiredEmailErrorIsDisplayed(String error) {
        LoginService.showRequiredEmailError(error);
    }

    @Then("^required password error (.*) is displayed$")
    public void requiredPasswordErrorIsDisplayed(String error) {
        LoginService.showRequiredPasswordError(error);
    }
    @Then("^invalid password error (.*) is displayed$")
    public void invalidPasswordErrorIsDisplayed(String error) {
        LoginService.showInvalidPasswordError(error);
    }

    @Then("^password (.*) is displayed$")
    public void passwordIsDisplayed(String password) {
        LoginService.passwordIsDisplayed(password);
    }

    @Then("^password (.*) is hidden$")
    public void passwordIsHidden(String password) {
        LoginService.passwordIsHidden(password);
    }

    @Then("^user is in (.*) to Log In$")
    public void userGoesToLogIn(String url) {
        LoginService.navigateTo(url);
    }

    @Then("^(.*) button is (.*)$")
    public void changeLoginButtonState(String locator, String attribute) {
        LoginService.changeLoginButtonState(locator, attribute);
    }
    @Then("^user is in (.*) to reset the password$")
    public void userGoesToReset(String url) {
        ResetService.navigateTo(url);
    }


    @And("^user enables input email")
    public void userEnablesInputEmail() {
        LoginService.enableInputEmail();
    }
    @And("^user enables input password")
    public void userEnablesInputPassword() {
        LoginService.enableInputPassword();
    }

    @And("^user erase password$")
    public void userErasePassword() {
        LoginService.erasePassword();
    }
    @And("^user erase email$")
    public void userEraseEmail() {
        LoginService.eraseEmail();
    }
    @And("^user clicks (.*) to inactive input$")
    public void userClicksElsewhere(String locator) {
        LoginService.clickElsewhere(locator);
    }
    @Given("^user is logged in with email (.*) and password (.*)$")
    public void userIsLoggedIn(String email, String password) {
        LoginService.doLogIn(email, password);
    }

    @Then("^user is in tracker page (.*) to start tracking work$")
    public void userIsInTrackerPage(String url) {
        LoginService.navigateTo(url);
    }
}
