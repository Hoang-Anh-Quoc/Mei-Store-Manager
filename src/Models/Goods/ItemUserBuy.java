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
    }

    public boolean SeachItem(String IDItem){
        for(String StringItem : DataProcessing.AllItem){
            Item item = new Item(StringItem);
            if(item.getID().equals(IDItem)) {
                setNameItem(item.getName());
                setAmountItem(item);
                return true;
            }
        }
        return false;
    }

    public void setIDItem() {
        String id = InputData.InputIDItemForUser();
        if(SeachItem(id)){
            this.IDItem = id;            
        } else {            
            System.out.println(ProgramLogException.eIDItemNotFound);
            Status = false;
        }
    }

    public void setNameItem(String nameItem) {
        this.NameItem = nameItem;
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

    public void upDateAmountItem(Item item , String amountItem){
        DataProcessing.AllItem.remove(item.toString());
        item.setAmount(Integer.parseInt(item.getAmount()) - Integer.parseInt(amountItem));
        DataProcessing.AllItem.add(item.toString());            
        AccessData.setAllItem();
    }

    public String getIDItem() {
        return IDItem;
    }
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
}