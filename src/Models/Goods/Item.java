package Models.Goods;

import Controllers.InputFromKeyboard.InputData;
import Models.AccessDatabase.AccessData;
import Models.AccessDatabase.DataProcessing;

public class Item {

    private String ID;
    private String Name;
    private String Amount;
    private String Price;

    public Item(){
        setID();
        setName();
        setAmount();
        setPrice();
    }

    public Item(String item){
        setID(item);
        setName(item);
        setAmount(item);
        setPrice(item);
    }

    public void setID() {
        AccessData.getAllItem();
        String lastItem = DataProcessing.AllItem.get(DataProcessing.AllItem.size() - 1);
        int lastID = Integer.parseInt(InputData.CutStringFrom(lastItem,1));
        this.ID = String.valueOf(lastID + 1);
    }

    private void setID(String item){
        this.ID = InputData.CutStringFrom(item,1);
    }

    private void setName() {
        this.Name = InputData.InputNameItem();
    }

    private void setName(String item) {
        this.Name = InputData.CutStringFrom(item,2);
    }

    private void setAmount() {
        this.Amount = InputData.InputAmountItem();
    }

    private void setAmount(String item) {
        this.Amount = InputData.CutStringFrom(item,3);
    }

    public void setAmount(int amount){
        this.Amount = String.valueOf(amount);
    }

    private void setPrice() {
        this.Price = InputData.InputPriceItem();
    }

    private void setPrice(String item) {
        this.Price = InputData.CutStringFrom(item,4);
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getAmount() {
        return Amount;
    }

    public String getPrice() {
        return Price;
    }

    public String toString(){
        return "|" + getID() +"|" + getName() + "|" + getAmount() + "|" + getPrice() + "|";
    }

    public void printItemForUser() {
        //"%1$-8s%2$-15s%3$-13s%4$-20s\n" - This is format line when print
        if(Integer.parseInt(getAmount()) > 0){
            System.out.printf("%1$-8s%2$-15s%3$-13s%4$-20s\n",getID(),getName(),"Stoking",getPrice());
        } else {
            System.out.printf("%1s%12s%12s%12s\n",getID(),getName(),"Out of stock",getPrice());
        }
    }

    public void printItemForManager(){
        System.out.printf("%1s%12s%12s%12s\n",getID(),getName(),getAmount(),getPrice());
    }

}
