package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LandingPageConstants;
import lippia.web.constants.logInConstants;

import static com.crowdar.core.actions.WebActionManager.click;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class landingPageService extends ActionManager {

    //1. Test case: LogIn

    //Precondition
    public static void navegarWebClockify(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    //Click Log In
    public static void clickLogInButton() {
        Object landingPageConstants;
        WebActionManager.click(LandingPageConstants.LOG_IN_BUTTON);
    }

    //Log in page
    public static void landingPage(){
        navigateTo("https://app.clockify.me/en/login");
    }



}
