package Controller.InputFromKeyboard;

public class Input implements LibraryInputData, InputException, NotificationInput{
    
    public static int NumberOfChoose(int NumberOfOptions) {
        System.out.print(inputChooseNotify);
        String yourChoose = sc.nextLine();
        try {
            int numberOfChoose = Integer.parseInt(yourChoose);
            if(numberOfChoose < 0){
                System.out.println(eUserChooseLess0);
                return NumberOfChoose(NumberOfOptions);
            } else if(numberOfChoose > NumberOfOptions){
                System.out.println(eUserChooseBigger);
                return NumberOfChoose(NumberOfOptions);
            }
            return numberOfChoose;
        } catch (NumberFormatException e){
            System.out.println(eUserChooseNotNumber);            
        } 
        return NumberOfChoose(NumberOfOptions);
    }

}
