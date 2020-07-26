package Views.Users;

import Controller.UserMenu.ControlUserMenu;

public class UserMainMenu {

    public static void Menu(){
        System.out.println("***************** Welcome to Mei Store *****************");
        System.out.println("** (1) Order                                          **");
        System.out.println("** (2) Your Order                                     **");
        System.out.println("** (3) Your Information                               **");
        System.out.println("** (4) Logout                                         **");
        
        ControlUserMenu.SelectOption();
    }
}
