package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;


public class ResetService extends ActionManager {

    public static void navigateTo(String url) {
        WebActionManager.navigateTo(url);
    }

}
