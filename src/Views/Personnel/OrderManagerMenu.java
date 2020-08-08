package Views.Personnel;

import Controllers.PersonnelMenu.ControlOrderManager;

public class OrderManagerMenu {
    public static void Menu(){
        do{
            System.out.println();
            System.out.println();
            System.out.println();
        } while(ControlOrderManager.SelectOption(3));
    }

}