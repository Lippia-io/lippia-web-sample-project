package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ClockifyConstants;

public class ClockifyService extends ActionManager {



    public static void clickIniciarManual() {
        click(ClockifyConstants.INICIAR_SESION_MANUALMENTE);
    }


    public static void ingresarMail(String mail) {
        setInput(ClockifyConstants.CAMPO_MAIL,mail);
    }

    public static void ingresarPass(String pass) {
        setInput(ClockifyConstants.CAMPO_PASS,pass);
    }

    public static void clickButton() {
        click(ClockifyConstants.BUTTON_SUBMITE);
    }




}
