package lippia.web.constants;

public class LoginConstants {

    public static final String LOGIN_URL = "https://app.clockify.me/en/login";
    public static final String EMAIL_INPUT = "id:email";
    public static final String PASSWORD_INPUT = "xpath://input[@class='cl-form-control'][@id='password']";
    public static final String LOG_IN_BUTTON = "xpath://button[@data-test-id='login-button'][contains(text(),'Log In')]";
    public static final String LOG_IN_MANUALLY_BUTTON = "xpath://a[@data-test-id='login-manual'][@class='cl-d-block cl-text-center ng-tns-c129-2 ng-star-inserted'][contains(.,'Log in manually')]";
    public static final String REQUIRED_EMAIL_ERROR = "xpath://span[@data-test-id='invalid-email'][contains(text(),'Email is required ')]";
    public static final String REQUIRED_PASSWORD_ERROR = "xpath://span[contains(text(),'Password is required')]";
    public static final String INVALID_PASSWORD_ERROR = "xpath://span[contains(text(),'Password is not valid')]";
    public static final String INVALID_EMAIL_PASSWORD_ERROR = "xpath://span[@class='ng-tns-c129-2'][@data-cy='error'][contains(text(),'Invalid email or password')]";
    public static final String INACTIVE_EYE_BUTTON = "xpath://img[@src='/assets/ui-icons/password-toggle.svg']";
    public static final String ACTIVE_EYE_BUTTON = "xpath://img[@src='/assets/ui-icons/password-toggle-active.svg']";
    public static final String PASSWORD = "xpath://input[@id='password'][@type='text']";
    public static final String HIDDEN_PASSWORD = "xpath://input[@id='password'][@type='password']";
    public static final String FORGOT_PASSWORD_BUTTON = "xpath://a[contains(text(),'Forgot password?')]";
    public static final String FORM = "xpath://div[@class='cl-sign-up-form ng-tns-c129-2']";

}
