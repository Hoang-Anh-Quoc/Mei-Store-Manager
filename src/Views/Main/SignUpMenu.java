package Views.Main;

import Controllers.MainMenu.SignUp;

public class SignUpMenu {
    public static void Menu() {
        System.out.println("***************** Welcome to Mei Store *****************");
        System.out.println("** What account do you want to create ?               **");
        System.out.println("** (1) Users Account                                  **");
        System.out.println("** (2) Personnel Account                              **");
        System.out.println("** (3) Admin Account                                  **");
        System.out.println("** (4) Back                                           **");

        SignUp.ControlSignUp(4);
    }
}
