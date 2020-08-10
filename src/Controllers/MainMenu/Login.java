package Controllers.MainMenu;

import Controllers.InputFromKeyboard.InputData;
import Models.AccessDatabase.*;
import Models.Accounts.AdminAccount;
import Models.Accounts.PersonnelAccount;
import Views.Users.UserMenu;
import Views.ProgramLog;
import Views.ProgramLogException;
import Views.Admins.AdminMenu;
import Views.Personnel.PersonnelMenu;

public class Login {

    public static void LoginForm() {
        String UserName = InputData.InputUserName();
        String Password = InputData.InputPassword();

        if (!LoginWithUser(UserName, Password)) {
            if (!LoginWithPersonnel(UserName, Password)) {
                if (!LoginWithAdmin(UserName, Password)) {
                    LoginNotSuccess(ProgramLog.LoginNotSuccess);
                }
            }
        }
    }

    private static boolean LoginWithUser(String UserName, String Password) {
        AccessData.getUserAccount();
        for (String UserAccount : DataProcessing.UsersAccount) {
            if (InputData.CutStringFrom(UserAccount, 2).equals(UserName)) {
                if (InputData.CutStringFrom(UserAccount, 3).equals(Password)) {
                    UserMenu.Menu(InputData.CutStringFrom(UserAccount, 1));
                } else {
                    LoginNotSuccess(ProgramLog.LoginNotSuccess);
                }
                return true;
            }
        }
        return false;
    }

    private static boolean LoginWithPersonnel(String UserName, String Password) {
        AccessData.getPersonnelAccount();
        for (String account : DataProcessing.PersonnelAccounts) {
            PersonnelAccount personnelAccount = new PersonnelAccount(account);
            if (personnelAccount.getUsername().equals(UserName)) {
                if (personnelAccount.getPassword().equals(Password)) {                    
                    if(personnelAccount.getAccountActivated()){
                        PersonnelMenu.Menu();
                    } else {
                        LoginNotSuccess(ProgramLogException.eAccountNotActivated);
                    }
                } else {
                    LoginNotSuccess(ProgramLog.LoginNotSuccess);
                }
                return true;
            }
        }
        return false;
    }

    private static boolean LoginWithAdmin(String UserName, String Password) {
        AccessData.getAdminAccount();
        for (String account : DataProcessing.AdminsAccounts) {
            AdminAccount adminAccount = new AdminAccount(account); 
            if (adminAccount.getUsername().equals(UserName)) {
                if (adminAccount.getPassword().equals(Password)) {
                    AdminMenu.Menu();
                } else {
                    LoginNotSuccess(ProgramLog.LoginNotSuccess);
                }
                return true;
            }
        }
        return false;
    }

    private static void LoginNotSuccess(String exception) {
        System.out.println(exception);
        if(InputData.ContinueOrExit()){
            LoginForm();
        }
    }
}
