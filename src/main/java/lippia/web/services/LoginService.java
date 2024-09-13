package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.TrackerConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginService extends ActionManager {

    public static void navigateTo(String url) {
        WebActionManager.navigateTo(url);
    }

    public static void validateLoginButtonInputIsVisible() {
        WebActionManager.isVisible(LoginConstants.LOG_IN_BUTTON);
    }

    public static void inputEmail(String email) {
        WebActionManager.setInput(LoginConstants.EMAIL_INPUT, email);
    }

    public static void inputPassword(String password) {
        WebActionManager.setInput(LoginConstants.PASSWORD_INPUT, password);
    }
    public static void erasePassword() {
        WebElement input = WebActionManager.getElement(LoginConstants.PASSWORD_INPUT);
        input.clear();
    }
    public static void clickElsewhere(String locator) {
        WebActionManager.click(LoginConstants.FORM);
    }

    public static void clickOnLogInManuallyButton(String button) {
        WebActionManager.click(LoginConstants.LOG_IN_MANUALLY_BUTTON);
    }

    public static void clickOnLogInButton(String button) {
        WebActionManager.click(LoginConstants.LOG_IN_BUTTON);
    }

    public static void showInvalidCredentialsError(String error) {
        Assert.assertEquals(WebActionManager.getText(LoginConstants.INVALID_EMAIL_PASSWORD_ERROR), error);
    }

    public static void showPassword(String button) {
        WebActionManager.click(LoginConstants.INACTIVE_EYE_BUTTON);
    }

    public static void hidePassword(String button) {
        WebActionManager.click(LoginConstants.ACTIVE_EYE_BUTTON);
    }

    public static void passwordIsHidden(String password) {
        WebActionManager.waitVisibility(LoginConstants.HIDDEN_PASSWORD);
    }

    public static void passwordIsDisplayed(String password) {
        WebActionManager.waitVisibility(LoginConstants.PASSWORD);
    }

    public static void clickOnReset(String button) {
        WebActionManager.click(LoginConstants.FORGOT_PASSWORD_BUTTON);
    }


    public static void showRequiredEmailError(String error) {
        WebActionManager.getText(LoginConstants.REQUIRED_EMAIL_ERROR);
    }

    public static void showRequiredPasswordError(String error) {
        WebActionManager.getText(LoginConstants.REQUIRED_PASSWORD_ERROR);
    }

    public static void showInvalidPasswordError(String error) {
        WebActionManager.getText(LoginConstants.INVALID_PASSWORD_ERROR);
    }


    public static void changeLoginButtonState(String locator, String attribute) {
        WebActionManager.getAttribute(LoginConstants.LOG_IN_BUTTON, attribute);
    }


    public static void enableInputEmail() {
        WebActionManager.click(LoginConstants.EMAIL_INPUT);
    }
    public static void enableInputPassword() {
        WebActionManager.click(LoginConstants.PASSWORD_INPUT);
    }

    public static void doLogIn(String email, String password){
        WebActionManager.navigateTo(LoginConstants.LOGIN_URL);
        WebActionManager.click(LoginConstants.LOG_IN_MANUALLY_BUTTON);
        WebActionManager.setInput(LoginConstants.EMAIL_INPUT, email);
        WebActionManager.setInput(LoginConstants.PASSWORD_INPUT, password);
        WebActionManager.click(LoginConstants.LOG_IN_BUTTON);
    }


    public static void eraseEmail() {
        WebElement input = WebActionManager.getElement(LoginConstants.EMAIL_INPUT);
        input.clear();
    }

}
