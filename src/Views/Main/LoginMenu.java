package Views.Main;

import Controller.MainMenu.Login;

public class LoginMenu {
    public static void Menu(){
        System.out.println();
        System.out.println("***************** Welcome to Mei Store *****************");
        System.out.println("** You can login with your UserName and your Password **");
        System.out.println("** ************************************************** **");        
       
        Login.LoginForm();
    }
}
