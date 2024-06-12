package lippia.web.constants;

public class ProjectsConstants {
    public static final String CREATE_NEW_PROJECT_BUTTON = "xpath://button[@type='button'][@data-cy='create-new-project']";
    public static final String CREATE_NEW_PROJECT_MODAL = "xpath://div[@class='cl-modal-header ng-star-inserted'][contains(.,'Create new project')]";
    public static final String INPUT_NAME = "xpath://input[contains(@placeholder,'Enter project name')]";
    public static final String CREATE_BUTTON = "xpath://button[@type='button'][@data-cy='create-project'][contains(text(),'Create')]";
    public static final String PROJECT = "xpath://span[contains(text(), '%s')]";

}