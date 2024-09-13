package lippia.web.constants;

public class TrackerConstants {
    public static final String MENU_PROJECTS = "xpath://ul/li/div/a[@href='/projects']";
    public static final String INPUT_START = "xpath://div[1]/input-time-ampm[1]/input";
    public static final String INPUT_END = "xpath://div[1]/input-time-ampm[2]/input";
    public static final String ADD_BUTTON = "xpath://button[@type='button'][contains(text(),'Add')]";
    public static final String INPUT_DESCRIPTION = "xpath://input[contains(@placeholder,'What have you worked on?')]";
    public static final String TIME_ENTRY_DESCRIPTION_UPDATE = "xpath://input[@placeholder='Add description']";
    public static final String TIME_ENTRY_DESCRIPTION_CHECKER = "xpath://div[@data-cy='time-entry-description'][contains(text(),'%s')]/preceding-sibling::input[@placeholder='Add description']";
    public static final String TIME_ENTRY_START_TIME = "xpath://div[4]/div/single-date-picker2/div/input-time-ampm[1]/input[@type='text']";
    public static final String TIME_ENTRY_END_TIME = "xpath://div[4]/div/single-date-picker2/div/input-time-ampm[2]/input[@type='text']";
    public static final String LOGO = "xpath://img[@alt='Clockify logo']";
    public static final String TIME_ENTRY_DESCRIPTION = "xpath://input[@placeholder='Add description']/following-sibling::div[@data-cy='time-entry-description'][contains(text(),' ')]";

}
