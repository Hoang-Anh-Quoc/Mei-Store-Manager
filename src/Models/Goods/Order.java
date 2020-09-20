package Models.Goods;

import Controllers.InputFromKeyboard.InputData;
import Models.AccessDatabase.AccessData;
import Models.AccessDatabase.DataProcessing;
import Views.ProgramLog;
import Views.ProgramLogException;

import java.util.ArrayList;

public class Order {
    
    private String IDOrder;
    private String IDUser;
    private String Status = "";
    private ArrayList<String> order = new ArrayList<>();

    public Order(int IDUser){        
        setIDOrder();
        setItem();
        setIDUser(IDUser);
    }

    public Order(String order){
        setIDUser(order);
    }

    public void setIDUser(int IDUser){
        this.IDUser = String.valueOf(IDUser);
    }
    public void setIDUser(String order){
        this.IDUser =  InputData.CutStringFrom(order,2);
    }
    public String getIDUser(){
        return this.IDUser;
    }
    public void setItem(){
        do{
            ItemUserBuy newItem = new ItemUserBuy();
            if(newItem.getStatus()){
                order.add(newItem.toString());
                System.out.println(ProgramLog.BuyItemSuccess);
            } else {
                System.out.println(ProgramLogException.eBuyItemNotSuccess);
            }
        } while(InputData.ContinueOrExit());   
    }

    public void setIDOrder() {
        AccessData.getAllOrder();
        String lastOrder = DataProcessing.AllOrder.get(DataProcessing.AllOrder.size() - 1);
        int lastID = Integer.parseInt(InputData.CutStringFrom(lastOrder,1));
        this.IDOrder = String.valueOf(lastID + 1);
    }

    public String getIDOrder() {
        return IDOrder;
    }

    public String toString() {
        StringBuilder listItem = new StringBuilder();
        for(String item : order){
            listItem.append(item);
        }        
        return "|" + getIDOrder() + "|" + IDUser + "|" + listItem;
    }

    public void printOrder(){
        
    }
}
