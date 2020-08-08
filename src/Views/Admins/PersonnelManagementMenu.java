package Views.Admins;

import Controllers.AdminMenu.ControlPersonnelManager;

public class PersonnelManagementMenu {
    public static void Menu(){
        // Accept Personnel Account
        // Time for word
        // Remove Personnel Account
        do {
            System.out.println();
            System.out.println();
            System.out.println();
        } while(ControlPersonnelManager.SelectOption(3));
    }
}
