package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TrackerConstants;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TrackerService extends ActionManager {


    public static void clickOnProjects(String button) {
        WebActionManager.click(TrackerConstants.MENU_PROJECTS);

    }

    public static void inputDescription(String description) {
        description = description + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        WebActionManager.getElement(TrackerConstants.INPUT_DESCRIPTION).click();
        WebActionManager.setInput(TrackerConstants.INPUT_DESCRIPTION, description);
    }

    public static void inputStartTimeEntry(String startTime) {
        WebActionManager.waitVisibility(TrackerConstants.INPUT_START);
        WebActionManager.getElement(TrackerConstants.INPUT_START).click();
        WebActionManager.setInput(TrackerConstants.INPUT_START, startTime);
    }

    public static void inputEndTimeEntry(String endTime) {
        WebActionManager.waitVisibility(TrackerConstants.INPUT_END);
        WebActionManager.getElement(TrackerConstants.INPUT_END).click();
        WebActionManager.setInput(TrackerConstants.INPUT_END, endTime);
    }

    public static void clickOnAddTimeEntry(String button) {
        WebActionManager.waitPresence(TrackerConstants.ADD_BUTTON);
        WebActionManager.click(TrackerConstants.ADD_BUTTON);
    }

    public static void setTimeEntry(String description, String startTime, String endTime) {
        WebActionManager.waitVisibility(TrackerConstants.INPUT_START);
        WebActionManager.getElement(TrackerConstants.INPUT_START).click();
        WebActionManager.setInput(TrackerConstants.INPUT_START, startTime);
        WebActionManager.waitVisibility(TrackerConstants.INPUT_END);
        WebActionManager.getElement(TrackerConstants.INPUT_END).click();
        WebActionManager.setInput(TrackerConstants.INPUT_END, endTime);
        WebActionManager.getElement(TrackerConstants.INPUT_DESCRIPTION).click();
        description = description + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        WebActionManager.setInput(TrackerConstants.INPUT_DESCRIPTION, description);
        WebActionManager.waitPresence(TrackerConstants.ADD_BUTTON);
        WebActionManager.click(TrackerConstants.ADD_BUTTON);
        WebActionManager.clean();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.getElement(TrackerConstants.TIME_ENTRY_DESCRIPTION, description);
    }

    public static void checkTimeEntry(String description) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.getElement(TrackerConstants.TIME_ENTRY_DESCRIPTION_CHECKER, description);
    }

    public static void updateTimeEntryDescription(String newDescription) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.getElement(TrackerConstants.TIME_ENTRY_DESCRIPTION_UPDATE).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebActionManager.getElement(TrackerConstants.TIME_ENTRY_DESCRIPTION_UPDATE).clear();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        newDescription = newDescription + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        WebActionManager.setInput(TrackerConstants.TIME_ENTRY_DESCRIPTION_UPDATE, newDescription);
        WebActionManager.getElement(TrackerConstants.LOGO).click();
    }


    public static void checkTimeEntryUpdatedDescription(String newDescription) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.getElement(TrackerConstants.TIME_ENTRY_DESCRIPTION_CHECKER, newDescription);
    }


    public static void updateTimeEntryStartTime(String newStartTime) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.getElement(TrackerConstants.TIME_ENTRY_START_TIME).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.setInput(TrackerConstants.TIME_ENTRY_START_TIME, newStartTime);
        WebActionManager.getElement(TrackerConstants.LOGO).click();
    }
    public static void updateTimeEntryEndTime(String newEndTime) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.getElement(TrackerConstants.TIME_ENTRY_END_TIME).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.setInput(TrackerConstants.TIME_ENTRY_END_TIME, newEndTime);
        WebActionManager.getElement(TrackerConstants.LOGO).click();
    }



    public static void checkTimeEntryUpdatedStartTime(String newStartTime) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.getElement(TrackerConstants.TIME_ENTRY_START_TIME, newStartTime);
    }
    public static void checkTimeEntryUpdatedEndTime(String newEndTime) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.getElement(TrackerConstants.TIME_ENTRY_END_TIME, newEndTime);
    }

}