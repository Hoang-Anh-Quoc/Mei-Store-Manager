package Controllers.UserMenu;

import Models.AccessDatabase.AccessData;
import Models.AccessDatabase.DataProcessing;
import Models.Goods.Item;


public class OrderManager {

    private static void printAllItem(){
        AccessData.getAllItem();
        System.out.printf("%1$-8s%2$-15s%3$-13s%4$-10s\n","ID","Name","Amount","Price");
        for(String stringItem : DataProcessing.AllItem){
            Item item = new Item(stringItem);
            item.printItemForUser();
        }
    }

    public static void MakeOrder(){
        printAllItem();
        AccessData.getAllOrder();

    }
    public static void YourOrder(){
        
    }
}