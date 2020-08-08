package Controllers.PersonnelMenu;

import Controllers.InputFromKeyboard.InputData;

public class ControlPersonnelMenu {

    public static boolean SelectOption(int option) {
        int UserInput = InputData.InputUserChoose(option);

        switch (UserInput) {
            case 1:
                OrderManager.PrintListOrder();
                break;
            case 2:
                CheckGood.PrintListGood();
                break;
            case 3: // Your information

                break;
            case 4:
                return false;
        }
        return true;
    }
}