package Views;

import Controller.MainMenu.ControlMainMenu;

public class MainMenu {
    public static void main(String[] args) {

        System.out.println("***************** Welcome to Mei Store *****************");
        System.out.println("** Mei Store is clothing store.You can order it here  **");
        System.out.println("** How to use?                                        **");
        System.out.println("**   Input a number sentence beginning your choose    **");
        System.out.println("**   - - - - - - - - - - - - - - - - - - - - - - - -  **");
        System.out.println("**  (1) Login                                         **");
        System.out.println("**  (2) Sign up                                       **");
        System.out.println("**  (3) Forgot your password ?                        **");
        System.out.println("**                                                    **");
        
        ControlMainMenu.SelectOption();
    }
}
