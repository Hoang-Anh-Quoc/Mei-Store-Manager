package Controller.InputFromKeyboard;

public interface InputException {
    String eUserChooseNotNumber = "Please enter only one digit !";
    String eUserChooseLength = "Please enter number at the beginning of the choose!";

    String eLengthMobilNumber = "Your phone number not enough 10 number! Please import again";
    String eUserNameIsNumber = "Your username not a mobile phone number! Please import again";
    String ePasswordLength = "Your password length less 12 and bigger 6";
    String ePasswordIsNumberAndLetter = "Your password is only number and letter! Please import again";
    String eStringAllNotLetter = "Your input must be string with all is letter. Please import again!";
    String eAdminCode = "";
}