package AccessDatabase;

import java.util.ArrayList;

public interface DataProcessing {
    // Admin
    ArrayList<String> AdminsAccounts = new ArrayList<>();
    ArrayList<String> AdminInformation = new ArrayList<>();

    // Goods
    ArrayList<String> IDOfGoods = new ArrayList<>();

    ArrayList<String> OrdersBeingTransported = new ArrayList<>();
    ArrayList<String> OrdersDeliveryHistory = new ArrayList<>();
    ArrayList<String> OrdersForm = new ArrayList<>();
    ArrayList<String> OrdersPreparingToDelivery = new ArrayList<>();

    // Personnel
    ArrayList<String> PersonnelAccounts = new ArrayList<>();
    ArrayList<String> PersonnelInformation = new ArrayList<>();

    // Users
    ArrayList<String> UsersAccount = new ArrayList<>();
    ArrayList<String> UserInformation = new ArrayList<>();

    //
    ArrayList<String> AllAccountsID = new ArrayList<>();
}
