package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import lippia.web.services.PracticeHomeService;

public class PracticeSteps {

    @Given("^The client is on automation practice page$")
    public void home() {
        PracticeHomeService.navigateWeb();
    }

    @And("^user clicks on \"My Account Menu\"$")
    public void userClicksOnMyAccountMenu() {
        PracticeHomeService.clickMyAccountMenu();
    }

    @And("^user enters as email(.*)$")
    public void userEntersAsEmail(String email) {
        PracticeHomeService.enterEmail(email);
    }

    @And("^user enters as registration password(.*)$")
    public void userEntersAsRegPassword(String password) {
        PracticeHomeService.enterRegPassword(password);
    }

    @And("^user enters as login password(.*)$")
    public void userEntersAsLogPassword(String password) {
        PracticeHomeService.enterLogPassword(password);
    }

    @And("^user clicks on \"Register\" button$")
    public void userClicksOnRegisterButton() {
        PracticeHomeService.clickRegisterButton();
    }

    @Then("^user will be registered successfully$")
    public void userWillBeRegisteredSuccessfully() {
        PracticeHomeService.verifySuccessfulRegistration();
    }

    @And("^user will be navigated to the Home Page$")
    public void userWillBeNavigatedToTheHomePage() {
        PracticeHomeService.verifyNavigationToHomePage();
    }

    @Then("^registration must fail with a warning message (.*)$")
    public void registrationMustFailWithAWarningMessage(String error) {
        PracticeHomeService.verifyFailedRegistration(error);
    }

    @Given("^user enters as username (.*)$")
    public void userEntersAsUsername(String username) {
        PracticeHomeService.enterUsername(username);
    }

    @And("^user clicks on \"Login\" button$")
    public void userClicksOnLoginButton() {
        PracticeHomeService.clickLoginButton();
    }

    @Then("^user will login successfully$")
    public void userWillLoginSuccessfully() {
        PracticeHomeService.verifySuccessfulLogin();
    }

    @Then("^login must fail with a warning message (.*)$")
    public void loginMustFailWithAWarningMessage(String error) {
        PracticeHomeService.verifyFailedLogin(error);
    }

    @And("^user clicks on \"Shop\"$")
    public void userClicksOnShop() {
        PracticeHomeService.clickShopMenu();
    }

    @And("^user selects (.*)$")
    public void userSelectsSorting(String sorting) {
        PracticeHomeService.selectSorting(sorting);
    }

    @Then("^user must see the top element (.*)$")
    public void userMustSeeTheTopElement(String expectedTitle) {
        PracticeHomeService.verifyTopElement(expectedTitle);
    }
}