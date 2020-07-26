package Views.Admins;

import Controller.AdminMenu.ControlAdminMenu;

public class AdminMenu {

    public static void Menu(){
        System.out.println("***************** Welcome to Mei Store *****************");
        System.out.println("** (1) Check Goods                                    **");        
        System.out.println("** (2) Check Personnel                                **");
        System.out.println("** (3) Your Information                               **");
        System.out.println("** (4) Logout                                         **");

        ControlAdminMenu.SelectOption();
    }
}
