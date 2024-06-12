package lippia.web.constants;

public class WorkspaceConstants {
    public static final String WORKSPACE_DROPDOWN_OPTIONS = "xpath://a[@class='cl-d-flex cl-dropdown-toggle cl-no-arrow cl-hover-pointer']";
    public static final String MANAGE_WORKSPACES = "xpath://a[contains(text(),'Manage workspaces')]";
    public static final String WORKSPACE_SETTINGS = "xpath://a[contains(text(),'Workspace settings')]";
    public static final String WORKSPACE_NAME = "xpath://input[@id='workspaceName']";
    public static final String CREATE_NEW_WORKSPACE_BUTTON = "xpath://button[@type='button'][@class='cl-btn cl-btn-outline-primary cl-d-none-print']";
    public static final String CREATE_NEW_WORKSPACE_MODAL = "xpath://div[@class='cl-modal-header ng-star-inserted'][contains(.,'Create new workspace')]";
    public static final String NAME_INPUT = "xpath://input[@type='text'][@formcontrolname='name']";
    public static final String CREATE_BUTTON = "xpath://button[@type='submit'][contains(text(),'Create')]";
    public static final String WORKSPACE = "xpath://span[contains(text(),'%s')]";

}
