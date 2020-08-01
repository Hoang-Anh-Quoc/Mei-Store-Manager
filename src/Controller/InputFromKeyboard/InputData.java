package Controller.InputFromKeyboard;

public class InputData implements LibraryInputData, InputException, NotificationInput{
    
    public static int InputUserChoose(int NumberOfOptions) {
        System.out.print(inputChooseNotify);
        String yourChoose = sc.nextLine();
        try {
            int numberOfChoose = Integer.parseInt(yourChoose);
            if(numberOfChoose < 0 || numberOfChoose > NumberOfOptions) {
                System.out.println(eUserChooseLength);
                return InputUserChoose(NumberOfOptions);
            }
            return numberOfChoose;
        } catch (NumberFormatException e){
            System.out.println(eUserChooseNotNumber);            
        } 
        return InputUserChoose(NumberOfOptions);
    }

    // UserName is mobile number
    public static String InputUserName(){
        System.out.print(inputUserName);
        String UserName = sc.nextLine();
        if(CheckStringAllIsNumber(UserName)){
            if(UserName.length() == 10) {
                return UserName;
            } else {
                System.out.println(eLengthMobilNumber);
                return InputUserName();
            }
        } else {
            System.out.println(eUserNameIsNumber);
            return InputUserName();
        }
    }

    // Password is string
    public static String InputPassword(){
        System.out.print(inputPassword);
        String Password = sc.nextLine();
        if(CheckStringIsOnlyNumberAndLetter(Password)){
            if(Password.length() >= 6 && Password.length() <= 12){
                return Password;
            } else {
                System.out.println(ePasswordLength);
                return InputPassword();
            }
        } else {
            System.out.println(ePasswordIsNumberAndLetter);
            return InputPassword();
        }
    }

//    public static boolean CheckStringAllIsLetter(String StringNeedCheck){
//        for(int i = 0 ; i < StringNeedCheck.length() ; ++i){
//            if(!Character.isLetter(StringNeedCheck.charAt(i)) && StringNeedCheck.charAt(i) != ' '){
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean CheckStringAllIsNumber(String StringNeedCheck){
        String StringForm = "0123456789";
        for(int i = 0 ; i < StringNeedCheck.length() ; ++i){
            if(!StringForm.contains(String.valueOf(StringNeedCheck.charAt(i)))){
                return false;
            }
        }
        return true;
    }

    public static boolean CheckStringIsOnlyNumberAndLetter(String StringNeedCheck){
        String StringForm = "qwertyuioplkjhgfdsazxcvbnm0123456789";
        for(int i = 0 ; i < StringNeedCheck.length() ; ++i){
            if(!StringForm.contains(String.valueOf(StringNeedCheck.charAt(i)))){
                return false;
            }
        }
        return true;
    }

    
    public static String CutStringFrom(String StringNeedCut, int Start) {
        // Datatype is "|...|...|" so start is number of "|"
        int count = 0;
        while (count != Start) {
            StringNeedCut = StringNeedCut.substring(StringNeedCut.indexOf("|") + 1);
            ++count;
        }
        return StringNeedCut.substring(0, StringNeedCut.indexOf("|"));
    }

}
