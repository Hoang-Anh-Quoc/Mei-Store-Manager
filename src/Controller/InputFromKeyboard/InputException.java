package Controller.InputFromKeyboard;

public interface InputException {
    String eUserChooseNotNumber = "Please enter only one digit !";    
    String eUserChooseLength = "Please enter number at the beginning of the choose!";

    String eLengthMobilNumber = "Your phone number not enough 11 number! Please import again";
    String eUserNameIsNumber = "Your username not a mobile phone number! Please import again";
    String ePasswordLength = "Your password length less 12 and bigger 6";
    String ePasswordIsNumberAndLetter = "Your password is only number and letter! Please import again";
}