package Controller.MainMenu;

import Controller.InputFromKeyboard.InputData;
import Model.AccessDatabase.AccessData;
import Model.AccessDatabase.DataProcessing;
import Model.Accounts.*;
import Model.Information.AdminInformation;
import Model.Information.PersonnelInformation;
import Model.Information.UserInformation;
import Views.ProgramLog;
import Views.ProgramLogException;

public class SignUp {

    public static void ControlSignUp() {
        int UserChoose = InputData.InputUserChoose(4);
        
        switch (UserChoose) {
            case 1:
                CreateUserAccount();
                break;
            case 2:
                CreatePersonnelAccount();
                break;
            case 3:
                CreateAdminAccount();
                break;
            case 4:

                break;
            default:                
            
        }
    }

    private static void CreateUserAccount() {
        UserAccount newAccount = new UserAccount();
        DataProcessing.UsersAccount.add(newAccount.toString());

        System.out.println(ProgramLog.CreateAccountSuccess);

        AccessData.getUserInformation();
        UserInformation newUserInformation = new UserInformation(Integer.parseInt(newAccount.getID()));
        DataProcessing.UserInformation.add(newUserInformation.toString());

        AccessData.setUserInformationToDatabase();
        AccessData.setUserAccountToDatabase();
    }

    private static void CreatePersonnelAccount() {
        PersonnelAccount newAccount = new PersonnelAccount();
        DataProcessing.PersonnelAccounts.add(newAccount.toString());

        
        System.out.println(ProgramLog.CreatePersonnelAccountSuccess);

        AccessData.getPersonnelInformation();
        PersonnelInformation newInformation = new PersonnelInformation(Integer.parseInt(newAccount.getID()));
        DataProcessing.PersonnelInformation.add(newInformation.toString());

        AccessData.setPersonnelInformationToDatabase();
        AccessData.setPersonnelAccountToDatabase();
    }

    private static void CreateAdminAccount() {

        if(InputData.InputAdminCode().equals("1234")){
            AdminAccount newAccount = new AdminAccount();
            DataProcessing.AdminsAccounts.add(newAccount.toString());


            System.out.println(ProgramLog.CreateAccountSuccess);

            AccessData.getAdminInformation();
            AdminInformation newAdminInformation = new AdminInformation(Integer.parseInt(newAccount.getID()));
            DataProcessing.AdminInformation.add(newAdminInformation.toString());

            AccessData.setAdminAccountToDatabase();
            AccessData.setAdminInformationToDatabase();
        } else {
            System.out.println(ProgramLogException.eAdminCodeIncorrect);
            if(InputData.ContinueOrExit()){
                CreateAdminAccount();
            }
        }

    }

}
