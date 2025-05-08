package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.UpdateConstants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class UpdateService {

    //Click on SETTINGS
    public static void clickOnSettings() throws InterruptedException {
        WebActionManager.waitTabOpening();
        WebActionManager.waitPresences(UpdateConstants.SETTINGS_BUTTON);
        WebActionManager.waitVisibility(UpdateConstants.SETTINGS_BUTTON);
        WebActionManager.click(UpdateConstants.SETTINGS_BUTTON);
    }

    //Set new workspace name
    public static void updateNewWorkspaceName(String name){
        WebActionManager.waitVisibility(UpdateConstants.INPUT_WORKSPACE_NAME);
        WebElement delete = WebActionManager.getElement(UpdateConstants.INPUT_WORKSPACE_NAME);
        delete.sendKeys(Keys.CONTROL + "a");
        delete.sendKeys(Keys.DELETE);
        WebActionManager.setInput(UpdateConstants.INPUT_WORKSPACE_NAME, name);
    }

    //Click on PROJECTS
    public static void clickOnProjects(){
        WebActionManager.click(UpdateConstants.PROJECT_CLICK);
    }

    //Update verification
    public static void updateNotification(){
        waitVisibility(UpdateConstants.UPDATE_NOTIFICATION);
        Assert.assertTrue(isVisible(UpdateConstants.UPDATE_NOTIFICATION));
    }

}
