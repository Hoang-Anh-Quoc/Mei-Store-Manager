package Views;

public interface ProgramLogException {
    String eUserChooseNotNumber = "Please enter only one digit !";
    String eUserChooseLength = "Please enter number at the beginning of the choose!";

    String eLengthMobilNumber = "Your phone number not enough 10 number! Please import again";
    String eUserNameIsNumber = "Your username not a mobile phone number! Please import again";        
    String eUserNameDelicate = "Your username is available! Please import again";
    String ePasswordLength = "Your password length less 12 and bigger 6";
    String eAccountNotActivated = "Your account not activated!";
    String ePasswordIsNumberAndLetter = "Your password is only number and letter! Please import again";
    String eStringAllNotLetter = "Your input must be string with all is letter. Please import again!";
    String eAdminCode = "Admin code is all number! Please import again.";    
    String eAdminCodeIncorrect = "Admin code incorrect!";    
    String eInputInfoName = "Please enter your real name!";
    String eInputInfoAge = "Please enter your real age!";
    String eInputInfoAddress = "Please enter your real address!";

    String eAnswerNotCorrect = "The answer is not correct!";
    String eAccountNotFound = "Username not found!";;
}