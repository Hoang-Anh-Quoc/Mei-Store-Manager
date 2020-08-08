package Controllers.UserMenu;

import Controllers.InputFromKeyboard.InputData;

public class ControlUserMenu {

    public static boolean SelectOption(int option) {
        int UserInput = InputData.InputUserChoose(option);

        switch (UserInput) {
            case 1: 
                OrderManager.MakeOrder();
                break;
            case 2: 
                OrderManager.YourOrder();
                break;
            case 3: // Your Information

                break;
            case 4: // Logout
                return false;
        }
        return true;
    }

}