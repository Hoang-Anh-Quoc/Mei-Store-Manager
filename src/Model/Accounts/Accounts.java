package Model.Accounts;

import Controller.InputFromKeyboard.InputData;
import Model.AccessDatabase.AccessData;
import Model.AccessDatabase.DataProcessing;
import Views.ProgramLogException;

public class Accounts {
    private String ID;
    private String Username;
    private String Password;
    private String SecurityQuestion;
    private String SecurityAnswer;

    public Accounts() {
        setID();
        setUsername();
        setPassword();
        setSecurityQuestion();
        setSecurityAnswer();
    }

    public Accounts(String newAccount){
        setID(newAccount);
        setUsername(newAccount);
        setPassword(newAccount);
        setSecurityQuestion(newAccount);
        setSecurityAnswer(newAccount);            
    }    

    public String getID() {
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
            this.ID = "0";
        } else {
            String lastID = DataProcessing.AllAccountsID.get(DataProcessing.AllAccountsID.size() - 1);
            this.ID = String.valueOf(Integer.parseInt(lastID)+ 1);
        }

        DataProcessing.AllAccountsID.add(ID);
        AccessData.setAccountIDToDatabase();
    }

    public void setID(String newAccount){
        this.ID = InputData.CutStringFrom(newAccount, 1);
    }

    public void setUsername() {        
        String Username = InputData.InputUserName();
        if(InputData.CheckUserNameIsOnly(Username)){
            this.Username = Username;
        } else {
            System.out.println(ProgramLogException.eUserNameDelicate);
            setUsername();
        }
    }

    public void setUsername(String newAccount){
        this.Username = InputData.CutStringFrom(newAccount, 2);
    }

    public void setPassword() {
        Password = InputData.InputPassword();
    }

    public void setPassword(String newAccount){

        this.Password = InputData.CutStringFrom(newAccount, 3);
    }

    public void setSecurityQuestion() {
        
        this.SecurityQuestion = InputData.InputSecurityQuestion();
    }

    public void setSecurityQuestion(String newAccount){
        this.SecurityQuestion = InputData.CutStringFrom(newAccount, 4);
    }

    public void setSecurityAnswer() {
        this.SecurityAnswer = InputData.InputSecurityAnswer();
    }

    public void setSecurityAnswer(String newAccount){
        this.SecurityAnswer = InputData.CutStringFrom(newAccount, 5);
    }

    public String toString() {
        return "|" + getID() + "|" + getUsername() + "|" + getPassword() + "|" + getSecurityQuestion() + "|"
                + getSecurityAnswer() + "|";
    }

}
