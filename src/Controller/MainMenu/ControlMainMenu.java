package Controller.MainMenu;

import Controller.InputFromKeyboard.InputData;

import Views.Main.LoginMenu;
import Views.Main.SignUpMenu;

public class ControlMainMenu {

    public static void SelectOption() {
        int UserChoose = InputData.InputUserChoose(3);

        switch (UserChoose) {
            case 1:
                LoginMenu.Menu();
                break;
            case 2:
                SignUpMenu.Menu();
                break;
            case 3:
                ForgotPassword.resetPassword();
                break;
        }
    }

}