package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.WorkspaceConstants;
import org.testng.Assert;

import java.util.Random;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class WorkspaceService {

    //Clockify page
    public static void ClockifyPage() {
        navigateTo("https://app.clockify.me/workspaces");
    }

    //Create new workspace button
    public static void createNewWorkspaceButton() {
        WebActionManager.click(WorkspaceConstants.CREATE_NEW_WORKSPACE);
    }

    //New workspace name
    public static void newWorkspaceName(String name) {
        WebActionManager.setInput(WorkspaceConstants.NEW_WORKSPACE_NAME, name);
    }

    //Create
    public static void createWorkspace() {
        WebActionManager.click(WorkspaceConstants.CREATE_BUTTON);
    }

    //Three points button
    public static void threePointsButton(){
        WebActionManager.click(WorkspaceConstants.THREE_POINTS_BUTTON);
    }

    //Manage workspaces
    public static void manageWorkspaces(){
        WebActionManager.click(WorkspaceConstants.MANAGE_WORKSPACES_BUTTON);
    }

    //Created Verification
    public static void createdWorkspaceNotification() {
        waitVisibility(WorkspaceConstants.CREATED_NOTIFICATION);
        Assert.assertTrue(isVisible(WorkspaceConstants.CREATED_NOTIFICATION));
    }

    // X
    public static void X() {
        WebActionManager.click(WorkspaceConstants.X);
    }

    //Set delete
    public static void setDelete(String delete){
        WebActionManager.setInput(WorkspaceConstants.DELETE_FIELD, delete);
    }

    //Click delete
    public static void clickDelete(){
        WebActionManager.click(WorkspaceConstants.DELETE_WORKSPACE_BUTTON);
    }

    //Deleted workspace
    public static void deletedWorkspace(){
        waitVisibility(WorkspaceConstants.DELETE_MESSAGE);
        Assert.assertTrue(isVisible(WorkspaceConstants.DELETE_MESSAGE));
    }

    public static void randomName(){

    }

}
