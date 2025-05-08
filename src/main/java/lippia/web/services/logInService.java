package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.logInConstants;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class logInService {

    //Click Manually Log In Button
    public static void logInManually(){
        WebActionManager.click(logInConstants.MANUALLY_LOGIN_BUTTON);
    }

    //Set Email
    public static void setEmail( String email ){
        WebActionManager.setInput(logInConstants.ENTER_EMAIL, email );
    }

    //Clockify Log In Page
    public static void logInPage(){
        navigateTo("https://app.clockify.me/en/login");
    }

    //Set Password
    public static void setPassword(String password){
        WebActionManager.setInput(logInConstants.ENTER_PASSWORD, password);
    }

    //Click Log In
    public static void clickLogIn(){
        WebActionManager.click(logInConstants.LOG_IN);
    }

    //Navigate to Clockify Time Tracker
    public static void timeTrackerPage(){
        navigateTo("https://app.clockify.me/workspaces");
    }

    //Click password
    public static void passwordClick(){
        waitVisibility(logInConstants.CLICK_PASSWORD);
        WebActionManager.click(logInConstants.CLICK_PASSWORD);
    }

    //Verify error notification
    public static void ErrorVerification(){
        waitVisibility(logInConstants.INVALID_EMAIL);
        Assert.assertTrue(isVisible(logInConstants.INVALID_EMAIL));

    }


}
