package Views.Personnel;

import Controller.PersonnelMenu.ControlPersonnelMenu;

public class PersonnelMenu {

    public static void Menu(){
        System.out.println("***************** Welcome to Mei Store *****************");
        System.out.println("** (1) Check Order                                    **");        
        System.out.println("** (2) Check Goods                                    **");        
        System.out.println("** (3) Your Information                               **");
        System.out.println("** (4) Logout                                         **");

        ControlPersonnelMenu.SelectOption();        
    }
    

}
