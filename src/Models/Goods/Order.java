package Models.Goods;

import Controllers.InputFromKeyboard.InputData;
import Models.AccessDatabase.AccessData;
import Models.AccessDatabase.DataProcessing;

import java.util.ArrayList;

public class Order {

    private String IDOrder;
    private String IDItem;
    private String NameItem;
    private String AmountItem;
    private ArrayList<String> order = new ArrayList<>();

    public Order(){

    }

    public void setID() {
        AccessData.getAllOrder();
        String lastOrder = DataProcessing.AllOrder.get(DataProcessing.AllOrder.size() - 1);
        int lastID = Integer.parseInt(InputData.CutStringFrom(lastOrder,1));
        this.IDOrder = String.valueOf(lastID + 1);
    }

    public void setIDItem(){

    }

    public void setNameItem() {

    }

    public String getID() {
        return IDOrder;
    }
}
