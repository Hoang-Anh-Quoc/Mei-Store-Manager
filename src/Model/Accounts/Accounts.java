package Model.Accounts;

import Controller.InputFromKeyboard.InputData;
import Model.AccessDatabase.AccessData;
import Model.AccessDatabase.DataProcessing;

public class Accounts {
    private int ID;
    private String Username;
    private String Password;
    private String SecurityQuestion;
    private String SecurityAnswer;

    public Accounts() {
        setID();
        setUsername();
        setPassword();
    }

    public int getID() {
        return ID;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getSecurityQuestion() {
        return SecurityQuestion;
    }

    public String getSecurityAnswer() {
        return SecurityAnswer;
    }

    public void setID() {
        AccessData.getAccountID();
        if (DataProcessing.AllAccountsID.isEmpty()) {
            this.ID = 0;
        } else {
            this.ID = Integer.parseInt(DataProcessing.AllAccountsID.get(DataProcessing.AllAccountsID.size() - 1)) + 1;
        }

        DataProcessing.AllAccountsID.add(String.valueOf(ID));
        AccessData.setAccountIDToDatabase();
    }

    public void setUsername() {
        Username = InputData.InputUserName();
    }

    public void setPassword() {
        Password = InputData.InputPassword();
    }

    public void setSecurityQuestion() {
        this.SecurityQuestion = InputData.InputSecurityQuestion();
    }

    public void setSecurityAnswer() {
        this.SecurityAnswer = InputData.InputSecurityAnswer();
    }

    public String toString() {
        return "|" + getID() + "|" + getUsername() + "|" + getPassword() + "|" + getSecurityQuestion() + "|"
                + getSecurityAnswer() + "|";
    }
}
