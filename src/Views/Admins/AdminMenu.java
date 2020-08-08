package Views.Admins;

import Controllers.AdminMenu.ControlAdminMenu;

public class AdminMenu {

    public static void Menu() {

        do {
           System.out.println("\n***************** Welcome to Mei Store *****************");
           System.out.println("** (1) Goods Manager                                    **");
           System.out.println("** (2) Personnel Manager                                **");
           System.out.println("** (3) Your Information                                 **");
           System.out.println("** (4) Logout                                           **");
       } while (ControlAdminMenu.SelectOption(4));

    }
}
