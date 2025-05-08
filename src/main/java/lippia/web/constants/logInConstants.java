package lippia.web.constants;

public class logInConstants {


    //Manually Log In
    public static final String MANUALLY_LOGIN_BUTTON = "xpath:(//a[normalize-space()='Log in manually'])[1]";
    public static final String ENTER_EMAIL = "xpath://input[@id='email']";
    public static final String ENTER_PASSWORD = "xpath://input[@id='password']";
    public static final String LOG_IN = "xpath://button[normalize-space()='Log In']";

    //Inavlid email message
    public static final String INVALID_EMAIL = "xpath:(//span[@class='cl-invalid-feedback cl-block cl-mt-0 ng-tns-c134-2 ng-star-inserted'])[1]";

    //Click password
    public static final String CLICK_PASSWORD = "xpath://input[@id='password']";



}
