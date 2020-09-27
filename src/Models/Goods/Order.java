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
    private final ArrayList<String> order = new ArrayList<>();

    public Order(int IDUser){        
        setIDOrder();
        setItemToOrder();
        setIDUser(IDUser);
    }

    public Order(String order){
        setIDOrder(order);
        setItemToOrder(order);
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

    public void setItemToOrder(){
        do {
            ItemUserBuy newItem = new ItemUserBuy();
            if(newItem.getStatus()){
                order.add(newItem.toString());
                Status = "Delivering";
                System.out.println(ProgramLog.BuyItemSuccess);
            } else {
                System.out.println(ProgramLogException.eBuyItemNotSuccess);
                Status = "False";
            }
        } while(InputData.ContinueOrExit());   
    }

    public void setItemToOrder(String order){
        int AmountOfItem = 0;
        for(int i = 0 ; i < order.length() -1 ; ++i){
            if(order.startsWith("|", i)){
                ++AmountOfItem;
            }
        }

        for(int i = 3 ; i < AmountOfItem ; ++i) {
            this.order.add("|" + InputData.CutStringFrom(order,i) + "|" + InputData.CutStringFrom(order, i + 1) + "|");
        }
    }

    public void setIDOrder() {
        AccessData.getAllOrder();
        String lastOrder = DataProcessing.AllOrder.get(DataProcessing.AllOrder.size() - 1);
        int lastID = Integer.parseInt(InputData.CutStringFrom(lastOrder,1));
        this.IDOrder = String.valueOf(lastID + 1);
    }

    public void setIDOrder(String order){
        this.IDOrder = InputData.CutStringFrom(order,1);
    }

    public String getIDOrder() {
        return IDOrder;
    }

    public String toString() {
        StringBuilder listItem = new StringBuilder();
        for(String item : order){
            listItem.append(item);
        }        
        return "|" + getIDOrder() + "|" + IDUser + "|" + listItem.toString();
    }

    public void printOrder(){
        for(String item : order) {
            ItemUserBuy ItemInListOrder = new ItemUserBuy(item);
            ItemInListOrder.printItemUserBuy();
        }
    }

    public boolean CheckOrderSuccess(){
        return !Status.equals("False");
    }
}
