package Models.Information;

import Controllers.InputFromKeyboard.InputData;

public class Information {

    private String ID;
    private String Name;
    private String Age;
    private String Address;

    public Information(int ID){
        setID(ID);
        setName();
        setAge();
        setAddress();
    }

    public Information(String info){
        setName(info);
        setAge(info);
        setAddress(info);
    }

    public void setID(int ID){
        this.ID = String.valueOf(ID);
    }

    public void setName() {
        Name = InputData.InputInfoName();
    }
    public void setAge() {
        Age = InputData.InputInfoAge();
    }    
    public void setAddress() {
        Address = InputData.InputInfoAddress();
    }

    public void setID(String info) {
        ID = InputData.CutStringFrom(info, 1);
    }

    public void setName(String info){
        this.Name = InputData.CutStringFrom(info, 2);
    }
    public void setAge(String info){
        this.Age = InputData.CutStringFrom(info, 3);
    }
    public void setAddress(String info){
        this.Address = InputData.CutStringFrom(info, 4);
    }

    public String getID(){
        return ID;
    }

    public String getName() {
        return Name;
    }
    public String getAge() {
        return Age;
    }
    public String getAddress() {
        return Address;
    }

    public String toString(){
        return "|" + getID() + "|" + getName() + "|" + getAge() + "|" + getAddress() + "|";
    }

}
