package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class WorkspaceService extends ActionManager {

    public static void clickOnWorkspaceDropdownOptions(String button) {
        WebActionManager.click(WorkspaceConstants.WORKSPACE_DROPDOWN_OPTIONS);
    }
    public static void clickOnManageWorkspaces(String button) {
        WebActionManager.click(WorkspaceConstants.MANAGE_WORKSPACES);
    }
    public static void clickWorkspaceSettings(String button) {
        WebActionManager.click(WorkspaceConstants.WORKSPACE_SETTINGS);
    }

    public static void clickOnCreateNewWorkspaceButton(String button) {
        WebActionManager.click(WorkspaceConstants.CREATE_NEW_WORKSPACE_BUTTON,false);
        WebActionManager.waitVisibility(WorkspaceConstants.CREATE_NEW_WORKSPACE_MODAL);
    }

    public static void inputWorkspaceName(String name) {
        String uniqueWorkspaceName = name + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        WebActionManager.setInput(WorkspaceConstants.NAME_INPUT, uniqueWorkspaceName);
    }
    public static void updateWorkspaceName(String newName) {
        WebActionManager.setInput(WorkspaceConstants.WORKSPACE_NAME, newName);
    }
    public static void clickOnCreateButton(String button) {
        WebActionManager.click(WorkspaceConstants.CREATE_BUTTON);
    }
    public static void checkWorkspace(String uniqueWorkspaceName) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.getElement(WorkspaceConstants.WORKSPACE, uniqueWorkspaceName);
    }
    public static void checkWorkspaceUpdate(String newName) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.getElement(WorkspaceConstants.WORKSPACE_NAME, newName);
    }

    public static void navigateToWorkspaces(String url) {
        WebActionManager.navigateTo(url);
    }


}
