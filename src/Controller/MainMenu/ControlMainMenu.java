package Controller.MainMenu;

import Controller.InputFromKeyboard.Input;

import Views.Main.LoginMenu;

public class ControlMainMenu {

    public static void SelectOption(){
        int UserChoose = Input.InputUserChoose(3);
        
        switch(UserChoose){
            case 1 : // Login
                LoginMenu.Menu();
                Login.LoginForm();
                break;
            case 2 : // Sign up

                break;
            case 3 : // Forgot password

                break;
            default :

        }
    }

}