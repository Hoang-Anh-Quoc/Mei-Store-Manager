package Views.Users;

import Controllers.UserMenu.ControlUserMenu;

public class UserMenu {

    public static void Menu(String IDUser) {

        do {
            System.out.println("***************** Welcome to Mei Store *****************");
            System.out.println("** (1) Order                                          **");
            System.out.println("** (2) Your Order                                     **");
            System.out.println("** (3) Your Information                               **");
            System.out.println("** (4) Logout                                         **");
        } while (ControlUserMenu.SelectOption(4 , IDUser));

    }
}
