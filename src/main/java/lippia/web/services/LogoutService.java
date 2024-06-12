package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogoutConstants;

public class LogoutService extends ActionManager {

    public static void clickOnAvatar(String button) {
        WebActionManager.click(LogoutConstants.AVATAR);
    }

    public static void clickOnLogOutButton(String button) {
        WebActionManager.click(LogoutConstants.LOG_OUT_BUTTON);
    }
}
