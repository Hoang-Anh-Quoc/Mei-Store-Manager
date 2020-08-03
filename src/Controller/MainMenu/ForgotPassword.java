package Controller.MainMenu;

import Controller.InputFromKeyboard.InputData;
import Model.AccessDatabase.AccessData;
import Model.AccessDatabase.DataProcessing;
import Model.Accounts.Accounts;
import Model.Accounts.AdminAccount;
import Model.Accounts.PersonnelAccount;
import Views.ProgramLog;
import Views.ProgramLogException;

public class ForgotPassword {
    public static void resetPassword(){
        String UserName = InputData.InputUserName();

        if(!setPasswordForUserAccount(UserName) && !setPasswordForPersonnelAccount(UserName)){
            setPasswordForAdminAccount(UserName);
        }
    }

    private static boolean setPasswordForUserAccount(String UserName){
        AccessData.getUserAccount();
        for(int i = 0 ; i < DataProcessing.UsersAccount.size() ; ++i){
            Accounts newAccount = new Accounts(DataProcessing.UsersAccount.get(i));
            if(CheckForUserName(newAccount, UserName)) {
                if(CheckSecurityQuestion(newAccount)){
                    DataProcessing.UsersAccount.set(i,setNewPassword(newAccount));
                    AccessData.setUserAccountToDatabase();
                    return true;
                } else {
                    System.out.println(ProgramLogException.eAnswerNotCorrect);
                    return false;
                }
            }
        }
        return false;
    }

    private static boolean setPasswordForPersonnelAccount(String UserName){
        AccessData.getPersonnelAccount();
        for(int i = 0 ; i < DataProcessing.PersonnelAccounts.size() ; ++i){
            PersonnelAccount account = new PersonnelAccount(DataProcessing.PersonnelAccounts.get(i));
            if(CheckForUserName(account, UserName)){
                if(CheckSecurityQuestion(account)){
                    DataProcessing.PersonnelAccounts.set(i,setNewPassword(account));
                    AccessData.setPersonnelAccountToDatabase();
                    return true;
                } else {
                    System.out.println(ProgramLogException.eAnswerNotCorrect);
                    return false;
                }
            }
        }
        return false;
    }

    private static void setPasswordForAdminAccount(String UserName){
        AccessData.getAdminAccount();
        for(int i = 0 ; i < DataProcessing.AdminsAccounts.size() ; ++i){
            AdminAccount account = new AdminAccount(DataProcessing.AdminsAccounts.get(i));
            if(CheckForUserName(account, UserName)){
                if(CheckSecurityQuestion(account)){
                    DataProcessing.AdminsAccounts.set(i,setNewPassword(account));
                    AccessData.setAdminAccountToDatabase();
                    return;
                } else {
                    System.out.println(ProgramLogException.eAnswerNotCorrect);
                }
                return;
            }
        }
        System.out.println(ProgramLogException.eAccountNotFound);
    }

    private static boolean CheckForUserName(Accounts account, String UserName){
        return account.getUsername().equals(UserName);
    }

    private static boolean CheckSecurityQuestion(Accounts account){
        System.out.println(ProgramLog.SecurityQuestion);
        System.out.println(account.getSecurityQuestion());
        String answer = InputData.InputSecurityAnswer();

        return account.getSecurityAnswer().equals(answer);
    }

    private static String setNewPassword(Accounts account){
        String newPassword = InputData.InputPassword();
        String lastPassword = account.getPassword();
        return account.toString().replace(lastPassword,newPassword);
    }
}
