package Models.Goods;

import Controllers.InputFromKeyboard.InputData;
import Models.AccessDatabase.AccessData;
import Models.AccessDatabase.DataProcessing;
import Views.ProgramLogException;

public class ItemUserBuy {
    
    private String IDItem;
    private String NameItem;
    private String AmountItem;
    private boolean Status = true;

    public ItemUserBuy() {
        setIDItem();
        setNameItem(SearchItemWithID(this.IDItem));
        setAmountItem(SearchItemWithID(this.IDItem));
    }

    public ItemUserBuy(String item){
        setNameItem(item);
        setAmountItem(item);
    }

    public Item SearchItemWithID(String IDItem){
        for(String StringItem : DataProcessing.AllItem){
            Item item = new Item(StringItem);
            if(item.getID().equals(IDItem)) {
                return item;
            }
        }
        return null;
    }

    public void setIDItem() {
        String id = InputData.InputIDItemForUser();
        this.IDItem = SearchItemWithID(id).getID();
        if(this.IDItem == null) {
            System.out.println(ProgramLogException.eIDItemNotFound);
            Status = false;
        }
    }

    public void setNameItem(Item item) {
        this.NameItem = item.getName();
    }

    public void setNameItem(String item){
        this.NameItem = InputData.CutStringFrom(item,1);
    }

    public void setAmountItem(Item item) {        
        String amountItem = InputData.InputAmountItem();
        
        if(Integer.parseInt(amountItem) <= Integer.parseInt(item.getAmount())) {
            this.AmountItem = amountItem;
            upDateAmountItem(item , amountItem);
        } else {
            System.out.println(ProgramLogException.eAmountItemTooMuch);            
            Status = false;
        }
    }
    public void setAmountItem(String item){
        this.AmountItem = InputData.CutStringFrom(item,2);
    }

    public void upDateAmountItem(Item item , String amountItem){
        DataProcessing.AllItem.remove(item.toString());
        item.setAmount(Integer.parseInt(item.getAmount()) - Integer.parseInt(amountItem));
        DataProcessing.AllItem.add(item.toString());            
        AccessData.setAllItem();
    }

//    public String getIDItem() {
//        return IDItem;
//    }

    public String getNameItem() {
        return NameItem;
    }
    public String getAmountItem() {
        return AmountItem;
    }
    public Boolean getStatus(){
        return Status;
    }

    public String toString(){
        return getNameItem() + "|" + getAmountItem() + "|";
    }

    public void printItemUserBuy() {
//        System.out.printf("%1s%12s\n",getNameItem(),getAmountItem());
        System.out.println(getNameItem() + "   " + getAmountItem());
    }
}