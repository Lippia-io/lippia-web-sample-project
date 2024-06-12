package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectsConstants;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ProjectService extends ActionManager {

    public static void navigateTo(String option) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.isVisible(ProjectsConstants.CREATE_NEW_PROJECT_BUTTON);
    }
    public static void clickOnCreateNewProjectButton(String button) {
        WebActionManager.click(ProjectsConstants.CREATE_NEW_PROJECT_BUTTON, false);
        WebActionManager.waitVisibility(ProjectsConstants.CREATE_NEW_PROJECT_MODAL);
    }

    public static void inputProjectName(String name) {
        String uniqueProjectName = name + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        WebActionManager.setInput(ProjectsConstants.INPUT_NAME, uniqueProjectName);
    }


    public static void clickOnCreateButton(String button) {
        WebActionManager.click(ProjectsConstants.CREATE_BUTTON);
    }

    public static void checkProject(String uniqueProjectName) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.isVisible(ProjectsConstants.PROJECT, uniqueProjectName);
    }


}
