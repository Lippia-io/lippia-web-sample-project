package lippia.web.constants;

public class PracticeConstants {

    // For Registration
    public static final String MY_ACCOUNT_MENU_XPATH = "xpath://*[@id=\"menu-item-50\"]/a";
    public static final String EMAIL_REG_INPUT_XPATH = "xpath://*[@id=\"reg_email\"]";
    public static final String PASSWORD_REG_INPUT_XPATH = "xpath://*[@id=\"reg_password\"]";
    public static final String REGISTER_BUTTON_XPATH = "xpath://input[@name='register']";
    public static final String REGISTRATION_SUCCESS_XPATH = "xpath://div[contains(@class,'woocommerce-MyAccount-content')]//p[contains(text(),'Hello')]";
    public static final String ERROR_MESSAGE_XPATH = "xpath://ul[@class='woocommerce-error']/li";

    // For Login
    public static final String LOGIN_USERNAME_INPUT_XPATH = "xpath://input[@id='username']";
    public static final String PASSWORD_LOG_INPUT_XPATH = "xpath://*[@id=\"password\"]";
    public static final String LOGIN_BUTTON_XPATH = "xpath://input[@name='login']";
    public static final String LOGIN_SUCCESS_XPATH = "xpath://div[contains(@class,'woocommerce-MyAccount-content')]//p[contains(text(),'Hello')]";
    public static final String LOGIN_ERROR_XPATH = "xpath://ul[@class='woocommerce-error']/li";

    // For Shop
    public static final String SHOP_MENU_XPATH = "xpath://a[contains(text(),'Shop')]";
    public static final String SORT_DROPDOWN_XPATH = "xpath://select[@name='orderby']";
    public static final String PRODUCT_GRID_XPATH = "xpath://ul[@class='products masonry-done']/li";
    public static final String PRODUCT_TITLE_XPATH = "xpath:.//h3";

    // For Shop → Sorting
    public static final String SORT_POPULARITY_VALUE = "popularity";
    public static final String SORT_AVG_RATING_VALUE = "rating";
    public static final String SORT_NEWNESS_VALUE = "date";
    public static final String SORT_PRICE_LOW_TO_HIGH_VALUE = "price";

}

