package Model.Accounts;

public class PersonnelAccount extends Accounts {

    private boolean AccountActivated = false;

    public PersonnelAccount() {
        super();
    }

    public PersonnelAccount(String newAccount){
        super(newAccount);
    }

    public void setAccountActivated(){
        AccountActivated = true;
    }

    public boolean getAccountActivated(){
        return AccountActivated;
    }

    @Override
    public String toString(){
        return super.toString() + AccountActivated + "|";
    }
}
