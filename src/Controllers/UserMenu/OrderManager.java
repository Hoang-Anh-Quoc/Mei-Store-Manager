package Controllers.UserMenu;

import Models.AccessDatabase.AccessData;
import Models.AccessDatabase.DataProcessing;
import Models.Goods.Item;
import Models.Goods.Order;


public class OrderManager {

    private static void printAllItem(){
        AccessData.getAllItem();
        System.out.printf("%1$-8s%2$-15s%3$-13s%4$-10s\n","ID","Name","Amount","Price");
        for(String stringItem : DataProcessing.AllItem){
            Item item = new Item(stringItem);
            item.printItemForUser();
        }
    }

    public static void MakeOrder(String IDUser) {
        printAllItem();
        Order newOrder = new Order(Integer.parseInt(IDUser));
        if(newOrder.CheckOrderSuccess()) {
            DataProcessing.AllOrder.add(newOrder.toString());
            AccessData.setAllOrderToDatabase();
        }
    }

    public static void YourOrder(String IDUser){
       
        AccessData.getAllOrder();

        for(String orderInList : DataProcessing.AllOrder){
            Order OrderInDatabase = new Order(orderInList);
            if(IDUser.equals(OrderInDatabase.getIDUser())){
                OrderInDatabase.printOrder();
            }
        }

    }
}