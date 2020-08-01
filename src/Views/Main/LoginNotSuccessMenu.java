package Views.Main;

import Controller.InputFromKeyboard.InputData;

public class LoginNotSuccessMenu {
    public static int Menu(){
        System.out.println("******************* Welcome to Mei Store *******************");
        System.out.println("** Username or password incorrect! Do you want try again? **");
        System.out.println("** (1) Yes                                                **");
        System.out.println("** (2) No                                                 **");        

        return InputData.InputUserChoose(2);
    }    
}