package Views.Main;

import Controller.InputFromKeyboard.InputData;
import Model.AccessDatabase.*;

public class mainTest {
    public static void main(String[] args) {
        String UserName = "0338696957";
        String Password = "1234567";
        System.out.print(LoginWithAdmin(UserName, Password));
    }
    private static boolean LoginWithAdmin(String UserName , String Password){
        AccessData.getAdminAccount();                

        for(String AdminAccount : DataProcessing.AdminsAccounts){
            // System.out.println(AdminAccount);
            // System.out.println(InputData.CutStringFrom(AdminAccount, 2));
            // System.out.println(InputData.CutStringFrom(AdminAccount, 3));
            if(InputData.CutStringFrom(AdminAccount, 2).equals(UserName)) {
                if(InputData.CutStringFrom(AdminAccount, 3).equals(Password)){
                    System.out.println("Success!");
                    return true;
                } else {
                    System.out.println("Not Success!");
                }
            }
        }        
        return false;
    }
}