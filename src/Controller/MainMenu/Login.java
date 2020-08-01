package Controller.MainMenu;

import Controller.InputFromKeyboard.InputData;
import Model.AccessDatabase.*;
import Views.Users.UserMenu;
import Views.Admins.AdminMenu;
import Views.Main.LoginNotSuccessMenu;
import Views.Personnel.PersonnelMenu;

public class Login {

    public static void LoginForm(){
        String UserName = InputData.InputUserName();
        String Password = InputData.InputPassword();

        if(!LoginWithUser(UserName, Password)){
            if(!LoginWithPersonnel(UserName, Password)){
                if(!LoginWithAdmin(UserName, Password)){                                        
                    LoginNotSuccess();
                }
            }
        }
    }

    private static boolean LoginWithUser(String UserName , String Password){
        AccessData.getUserAccount();        
        for(String UserAccount : DataProcessing.UsersAccount){
            if(InputData.CutStringFrom(UserAccount, 2).equals(UserName)){
                if(InputData.CutStringFrom(UserAccount, 3).equals(Password)){
                    UserMenu.Menu();
                    return true;
                } else {
                    LoginNotSuccess();                                    
                }
            }
        }
        return false;
    }

    private static boolean LoginWithPersonnel(String UserName , String Password){
        AccessData.getPersonnelAccount();        
        for(String PersonnelAccount : DataProcessing.PersonnelAccounts){
            if(InputData.CutStringFrom(PersonnelAccount, 2).equals(UserName)){
                if(InputData.CutStringFrom(PersonnelAccount, 3).equals(Password)){
                    PersonnelMenu.Menu();
                    return true;
                } else {
                    LoginNotSuccess();                                                  
                }
            }
        }        
        return false;
    }

    private static boolean LoginWithAdmin(String UserName , String Password){
        AccessData.getAdminAccount();                
        for(String AdminAccount : DataProcessing.AdminsAccounts){
            if(InputData.CutStringFrom(AdminAccount, 2).equals(UserName)) {
                if(InputData.CutStringFrom(AdminAccount, 3).equals(Password)){
                    AdminMenu.Menu();
                    return true;
                } else {
                    LoginNotSuccess();
                }
            }
        }        
        return false;
    }

    private static void LoginNotSuccess(){       
       
        int Userchoose = LoginNotSuccessMenu.Menu();

        switch(Userchoose){
            case 1 :
                LoginForm();
                break;
            case 2 :                
                break;
        }
    }
}
