package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class ProjectService {

    //Project button
    public static void projectButton(){
        WebActionManager.click(ProjectConstants.PROJECT_BUTTON);
    }

    //Create new project
    public static void createNewProject(){
        WebActionManager.click(ProjectConstants.CREATE_NEW_PROJECT_BUTTON);
    }

    //Set new project name
    public static void setNewProjectName(String name){
        WebActionManager.setInput(ProjectConstants.ENTER_PROJECT_NAME, name);
    }

    //Click create
    public static void clickCreate(){
        WebActionManager.click(ProjectConstants.CREATE_PROJECT_BUTTON);
    }

    //Created project
    public static void createdProject(){
        waitVisibility(ProjectConstants.SUCCESS_MESSAGE);
        Assert.assertTrue(isVisible(ProjectConstants.SUCCESS_MESSAGE));
    }


}
