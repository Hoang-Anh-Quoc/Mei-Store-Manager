package Controllers.AdminMenu;

import Controllers.InputFromKeyboard.InputData;

public class ControlGoodManager {

    public static boolean SelectOption(int option) {
        int UserInput = InputData.InputUserChoose(option);
        switch (UserInput) {
            case 1: // print list item
                GoodManager.PrintListGood();
                return true;
            case 2: // add item
                GoodManager.AddGood();
                return true;
            case 3: // remove item
                GoodManager.RemoveGood();
                return true;
            case 4: // edit item
                GoodManager.EditGood();
                return true;
            case 5: // back
                break;
        }

        return false;
    }

}