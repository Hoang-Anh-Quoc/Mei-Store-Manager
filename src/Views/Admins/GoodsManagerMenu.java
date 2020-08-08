package Views.Admins;

import Controllers.AdminMenu.ControlGoodManager;

public class GoodsManagerMenu {
    public static void Menu() {

        do{
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        } while(ControlGoodManager.SelectOption(5));
    }
}
