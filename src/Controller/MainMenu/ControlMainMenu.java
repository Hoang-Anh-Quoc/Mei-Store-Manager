package Controller.MainMenu;

import Controller.InputFromKeyboard.InputData;

import Views.Main.LoginMenu;

public class ControlMainMenu {

    public static void SelectOption(){
        int UserChoose = InputData.InputUserChoose(3);
        
        switch(UserChoose){
            case 1 :
                LoginMenu.Menu();                
                break;
            case 2 : 
                SignUp.ControlSignUp();
                break;
            case 3 : // Forgot password

                break;
            default :

        }
    }

}