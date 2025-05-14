package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class PracticeHomeService {

    public static void navigateWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickMyAccountMenu() {
        WebActionManager.click(PracticeConstants.MY_ACCOUNT_MENU_XPATH);
    }

    public static void enterEmail(String email) {
        WebActionManager.setInput(PracticeConstants.EMAIL_REG_INPUT_XPATH, email);
    }

    public static void enterRegPassword(String password) {
        WebActionManager.setInput(PracticeConstants.PASSWORD_REG_INPUT_XPATH, password);
    }

    public static void enterLogPassword(String password) {
        WebActionManager.setInput(PracticeConstants.PASSWORD_LOG_INPUT_XPATH, password);
    }

    public static void clickRegisterButton() {
        WebActionManager.click(PracticeConstants.REGISTER_BUTTON_XPATH);
    }

    public static void verifySuccessfulRegistration() {
        WebActionManager.waitVisibility(PracticeConstants.REGISTRATION_SUCCESS_XPATH);
        WebElement successElement = WebActionManager.getElement(PracticeConstants.REGISTRATION_SUCCESS_XPATH);
        Assert.assertTrue(successElement.isDisplayed(), "Registration was not successful");
    }

    public static void verifyNavigationToHomePage() {
        WebDriver driver = DriverManager.getDriverInstance();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("practice.automationtesting.in"), "Not on home page");
    }

    public static void verifyFailedRegistration(String expectedError) {
        WebActionManager.waitVisibility(PracticeConstants.ERROR_MESSAGE_XPATH);
        WebElement errorElement = WebActionManager.getElement(PracticeConstants.ERROR_MESSAGE_XPATH);
        Assert.assertEquals(errorElement.getText(), expectedError, "Error message does not match");
    }

    public static void enterUsername(String username) {
        WebActionManager.setInput(PracticeConstants.LOGIN_USERNAME_INPUT_XPATH, username);
    }

    public static void clickLoginButton() {
        WebActionManager.click(PracticeConstants.LOGIN_BUTTON_XPATH);
    }

    public static void verifySuccessfulLogin() {
        WebActionManager.waitVisibility(PracticeConstants.LOGIN_SUCCESS_XPATH);
        WebElement successElement = WebActionManager.getElement(PracticeConstants.LOGIN_SUCCESS_XPATH);
        Assert.assertTrue(successElement.isDisplayed(), "Login was not successful");
    }

    public static void verifyFailedLogin(String expectedError) {
        WebActionManager.waitVisibility(PracticeConstants.LOGIN_ERROR_XPATH);
        WebElement errorElement = WebActionManager.getElement(PracticeConstants.LOGIN_ERROR_XPATH);
        Assert.assertEquals(errorElement.getText(), expectedError, "Error message does not match");
    }

    public static void clickShopMenu() {
        WebActionManager.click(PracticeConstants.SHOP_MENU_XPATH);
    }

    public static void selectSorting(String sorting) {
        String sortValue = "";
        switch(sorting.toLowerCase()) {
            case "popularity":
                sortValue = PracticeConstants.SORT_POPULARITY_VALUE;
                break;
            case "average rating":
                sortValue = PracticeConstants.SORT_AVG_RATING_VALUE;
                break;
            case "newness":
                sortValue = PracticeConstants.SORT_NEWNESS_VALUE;
                break;
            case "price: low to high":
                sortValue = PracticeConstants.SORT_PRICE_LOW_TO_HIGH_VALUE;
                break;
            default:
                throw new IllegalArgumentException("Invalid sorting option: " + sorting);
        }
        WebActionManager.setDropdownByValue(PracticeConstants.SORT_DROPDOWN_XPATH, sortValue);
        WebActionManager.waitVisibility(PracticeConstants.PRODUCT_GRID_XPATH);
        // Por las dudas agregué un tiempo de espera para que se carguen los elementos
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void verifyTopElement(String expectedTitle) {
        // Acá obtengo todos los productos
        List<WebElement> products = WebActionManager.getElements(PracticeConstants.PRODUCT_GRID_XPATH);
        Assert.assertFalse(products.isEmpty(), "No products found in the grid");

        // Acá me traigo el título del primer producto
        WebElement firstProduct = products.get(0);
        WebElement titleElement = firstProduct.findElement(
                By.xpath(PracticeConstants.PRODUCT_TITLE_XPATH.replace("xpath:", "")));

        String actualTitle = titleElement.getText();

        // Hago un log para verificar las pruebas en consola
        System.out.println("=== VERIFICACIÓN DE SORTING ===");
        System.out.println("Valor esperado (Gherkin): '" + expectedTitle + "'");
        System.out.println("Valor encontrado (página): '" + actualTitle + "'");
        System.out.println("Coinciden? " + actualTitle.equals(expectedTitle));

        Assert.assertEquals(actualTitle, expectedTitle,
                String.format("El primer producto debería ser '%s' pero es '%s'",
                        expectedTitle, actualTitle));
    }

}
