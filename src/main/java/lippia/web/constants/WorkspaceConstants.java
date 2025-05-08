package lippia.web.constants;

public class WorkspaceConstants {

    //Create new workspace button
    public static final String CREATE_NEW_WORKSPACE = "xpath://*[@class='cl-btn cl-btn-outline-primary cl-d-none-print']";

    //New workspace name
    public static final String NEW_WORKSPACE_NAME = "xpath:(//input[@type='text'])[1]";

    //Create button
    public static final String CREATE_BUTTON = "xpath://*[@class='cl-btn cl-btn-primary']";

    //Created notification
    public static final String CREATED_NOTIFICATION = "xpath://*[@class='toast-bottom-right toast-container']";

    //3 points button
    public static final String THREE_POINTS_BUTTON = "xpath://*[@class='cl-rotate-90 cl-topbar-options-toggler']";

    //Manage workspaces
    public static final String MANAGE_WORKSPACES_BUTTON = "xpath://*[@routerlink='/workspaces']";

    // X
    public static final String X = "xpath:(//img)[27]";

    // Delete field
    public static final String DELETE_FIELD = "xpath:(//input[@type='text'])[1]";

    //Delete workspace button
    public static final String DELETE_WORKSPACE_BUTTON = "xpath://button[@type='submit']";

    //Delete message
    public static final String DELETE_MESSAGE = "xpath://div[@id='toast-container']";

}
