package Controllers.InputFromKeyboard;

import Models.AccessDatabase.AccessData;
import Models.AccessDatabase.DataProcessing;
import Views.ProgramLog;
import Views.ProgramLogException;

public class InputData implements LibraryInputData, ProgramLogException, ProgramLog {

    public static int InputUserChoose(int NumberOfOptions) {
        System.out.print(inputChooseNotify);
        String yourChoose = sc.nextLine();
        try {
            int numberOfChoose = Integer.parseInt(yourChoose);
            if (numberOfChoose < 0 || numberOfChoose > NumberOfOptions) {
                System.out.println(eUserChooseLength + "\n");
                return InputUserChoose(NumberOfOptions);
            }

            System.out.println("");
            return numberOfChoose;
        } catch (NumberFormatException e) {
            System.out.println(eUserChooseNotNumber);
        }
        System.out.println("");
        return InputUserChoose(NumberOfOptions);
    }

    // UserName is mobile number
    public static String InputUserName() {
        System.out.print(inputUserName);
        String UserName = sc.nextLine();
        if (CheckStringAllIsNumber(UserName)) {
            if (UserName.length() == 10) {
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

    // Password is letter and number
    public static String InputPassword() {
        System.out.print(inputPassword);
        String Password = sc.nextLine();
        if (CheckStringIsNumberAndLetter(Password)) {
            if (Password.length() >= 6 && Password.length() <= 12) {
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

    public static String InputSecurityQuestion() {

        System.out.println(SecurityQuestion);
        System.out.println("(1)" + SecurityQuestion1);
        System.out.println("(2)" + SecurityQuestion2);
        System.out.println("(3)" + SecurityQuestion3);

        switch (InputUserChoose(3)) {
            case 1:
                return SecurityQuestion1;
            case 2:
                return SecurityQuestion2;
            case 3:
                return SecurityQuestion3;
        }
        return "";
    }

    public static String InputSecurityAnswer() {
        System.out.print(inputSecurityAnswer);
        String answer = sc.nextLine();
        if (CheckStringAllIsLetter(answer)) {
            return answer;
        } else {
            System.out.println(eStringAllNotLetter);
            return InputSecurityQuestion();
        }
    }

    public static String InputAdminCode() {
        System.out.print(inputAdminCode);
        String AdminCode = sc.nextLine();
        if (CheckStringAllIsNumber(AdminCode)) {
            return AdminCode;
        } else {
            System.out.println(eAdminCode);
            return InputAdminCode();
        }
    }

    public static String InputInfoName() {
        System.out.print(inputInfoName);
        String name = sc.nextLine();
        if (CheckStringAllIsLetter(name)) {
            return name;
        } else {
            System.out.println(eInputInfoName);
            return InputInfoName();
        }
    }

    public static String InputInfoAge() {
        System.out.print(inputInfoAge);
        String age = sc.nextLine();
        if (CheckStringAllIsNumber(age)) {
            return age;
        } else {
            System.out.println(eInputInfoAge);
            return InputInfoAge();
        }
    }

    public static String InputInfoAddress() {
        System.out.print(inputInfoAddress);
        String address = sc.nextLine();
        if (CheckAddress(address)) {
            return address;
        } else {
            System.out.println(eInputInfoAddress);
            return InputInfoAddress();
        }
    }


    public static String InputIDItemForUser(){
        System.out.print(inputIDItem);
        return sc.nextLine();        
    }

    public static String InputNameItem(){
        System.out.print(inputNameItem);
        String nameItem = sc.nextLine();
        if(CheckStringIsNumberAndLetter(nameItem)){
            return nameItem;
        } else {
            System.out.println(eNameItemNotCorrect);
            return InputNameItem();
        }
    }
    public static String InputAmountItem(){
        System.out.print(inputAmountItem);
        String amountItem = sc.nextLine();
        if(CheckStringAllIsNumber(amountItem)){
            return amountItem;
        } else {
            System.out.println(eAmountItemNotCorrect);
            return InputAmountItem();
        }
    }
    public static String InputPriceItem(){
        System.out.print(inputPriceItem);
        String priceItem = sc.nextLine();
        if(CheckPriceItem(priceItem)){
            return priceItem;
        } else {
            System.out.println(ePriceItemNotCorrect);
            return InputPriceItem();
        }
    }
    private static boolean CheckPriceItem(String priceItem){
        try{
            Double.parseDouble(priceItem);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public static boolean ContinueOrExit() {
        System.out.println(ContinueOrExitMenu);
        switch (InputUserChoose(2)) {
            case 1:
                return true;
            case 2:
                return false;
        }
        return false;
    }

    public static boolean CheckAddress(String address) {
        address = address.replaceAll(" ", "");
        address = address.replaceAll("-", "");
        return CheckStringIsNumberAndLetter(address);
    }

    public static boolean CheckStringAllIsLetter(String StringNeedCheck) {
        for (int i = 0; i < StringNeedCheck.length(); ++i) {
            if (!Character.isLetter(StringNeedCheck.charAt(i)) && StringNeedCheck.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean CheckStringAllIsNumber(String StringNeedCheck) {
        String StringForm = "0123456789";
        for (int i = 0; i < StringNeedCheck.length(); ++i) {
            if (!StringForm.contains(String.valueOf(StringNeedCheck.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean CheckStringIsNumberAndLetter(String StringNeedCheck) {
        String StringForm = "qwertyuioplkjhgfdsazxcvbnm0123456789QWERTYUIOPLKJHGFDSAZXCVBNM";
        for (int i = 0; i < StringNeedCheck.length(); ++i) {
            if (!StringForm.contains(String.valueOf(StringNeedCheck.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean CheckUserNameIsOnly(String Username) {
        AccessData.getUserAccount();
        AccessData.getPersonnelAccount();
        AccessData.getAdminAccount();
        for (String account : DataProcessing.UsersAccount) {
            if (InputData.CutStringFrom(account, 2).equals(Username)) {
                return false;
            }
        }
        for (String account : DataProcessing.PersonnelAccounts) {
            if (InputData.CutStringFrom(account, 2).equals(Username)) {
                return false;
            }
        }
        for (String account : DataProcessing.AdminsAccounts) {
            if (InputData.CutStringFrom(account, 2).equals(Username)) {
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
