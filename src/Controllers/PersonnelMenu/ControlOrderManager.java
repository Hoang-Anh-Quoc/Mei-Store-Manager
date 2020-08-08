package Controllers.PersonnelMenu;

import Controllers.InputFromKeyboard.InputData;

public class ControlOrderManager {
    public static boolean SelectOption(int option) {

        int UserInput = InputData.InputUserChoose(option);

        switch (UserInput) {
            case 1:
                
                return true;
            case 2:
                return true;
            case 3:
                break;
        }
        return false;
    }
}