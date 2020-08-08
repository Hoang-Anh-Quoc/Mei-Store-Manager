package Controllers.MainMenu;

import Controllers.InputFromKeyboard.InputData;
import Views.Main.LoginMenu;
import Views.Main.SignUpMenu;

public class ControlMainMenu {

    public static boolean SelectOption(int option) {
        int UserInput = InputData.InputUserChoose(option);

        switch (UserInput) {
            case 1:
                LoginMenu.Menu();
                break;
            case 2:
                SignUpMenu.Menu();
                break;
            case 3:
                ForgotPassword.resetPassword();
                break;
            case 4:
                return false;
        }
        return true;
    }
}