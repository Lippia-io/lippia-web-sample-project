package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.LogOutConstants;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class LogOutService {

    //Click on user button
    public static void userButton(){
        WebActionManager.click(LogOutConstants.USER_BUTTON);
    }

    //Click log out button
    public static void logOutButton(){
        WebActionManager.click(LogOutConstants.LOG_OUT_BUTTON);
    }

    //Log out verification
    public static void logOutVerification(){
        waitVisibility(LogOutConstants.CONTINUE_WITH_EMAIL_BUTTON);
        Assert.assertTrue(isVisible(LogOutConstants.CONTINUE_WITH_EMAIL_BUTTON));

    }

}
