package Controller.MainMenu;

import Controller.InputFromKeyboard.InputData;

public class SignUp {

    public static void ControlSignUp(){
        int UserChoose = InputData.InputUserChoose(4);

        switch (UserChoose){
            case 1 :
                CreateUserAccount();
                break;
            case 2 :
                CreatePersonnelAccount();
                break;
            case 3 :
                CreateAdminAccount();
                break;
            case 4 :

                break;
            default :

        }
    }

    private static void CreateUserAccount(){

    }
    private static void CreatePersonnelAccount(){

    }
    private static void CreateAdminAccount(){

    }
}
