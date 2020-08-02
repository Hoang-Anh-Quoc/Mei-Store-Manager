package Controller.MainMenu;

import Controller.InputFromKeyboard.InputData;
import Model.AccessDatabase.AccessData;
import Model.AccessDatabase.DataProcessing;
import Model.Accounts.*;

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
        AccessData.setUserAccountToDatabase();
    }

    private static void CreatePersonnelAccount() {
        PersonnelAccount newAccount = new PersonnelAccount();
        DataProcessing.PersonnelAccounts.add(newAccount.toString());
        AccessData.setPersonnelAccountToDatabase();
    }

    private static void CreateAdminAccount() {

    }
}
