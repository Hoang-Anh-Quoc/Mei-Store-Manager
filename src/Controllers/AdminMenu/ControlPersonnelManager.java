package Controllers.AdminMenu;

import Controllers.InputFromKeyboard.InputData;


public class ControlPersonnelManager {
    
    public static boolean SelectOption(int option) {
        int UserInput = InputData.InputUserChoose(option);
        switch (UserInput) {
            case 1: 
                PersonnelManager.AcceptPersonnelAccount();                
                return true;
            case 2: 
                PersonnelManager.StatisticsWorkingTime();
                return true;
            case 3:
                PersonnelManager.RemovePersonnelAccount();
                return true;
            case 4: // Back
                break;
        }
        return false;
    }
}