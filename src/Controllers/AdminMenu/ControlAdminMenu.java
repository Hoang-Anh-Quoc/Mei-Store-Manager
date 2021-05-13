package Controllers.AdminMenu;

import Controllers.InputFromKeyboard.InputData;
import Views.Admins.GoodsManagerMenu;
import Views.Admins.PersonnelManagementMenu;

public class ControlAdminMenu {

    public static boolean SelectOption(int option) {
        int UserInput = InputData.InputUserChoose(option);

        switch (UserInput) {
        case 1:
            GoodsManagerMenu.Menu();
            break;
        case 2:
            PersonnelManagementMenu.Menu();
            break;
        case 3: // Your information

            break;
        case 4:
            return false;
        }
        return true;
    }
}