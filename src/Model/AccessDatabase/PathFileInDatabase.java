package Model.AccessDatabase;

public interface PathFileInDatabase {
    // Admin
    public final String PathAdminsAccounts = "Database\\Admins\\Accounts.txt";
    public final String PathAdminsInformation = "Database\\Admins\\Information.txt";

    // Goods
    public final String PathListIDOfGoods = "Database\\Goods\\List Of Goods\\ListIDOfGoods.txt";

    public final String PathOrderBeingTransported = "Database\\Goods\\Orders\\BeingTransported.txt";
    public final String PathDeliveryHistory = "Database\\Goods\\Orders\\DeliveryHistory.txt";
    public final String PathOrderForm = "Database\\Goods\\Orders\\OrderForm.txt";
    public final String PathPreparingToDelivery = "Database\\Goods\\Orders\\PreparingToDelivery.txt";

    // Personnel
    public final String PathPersonnelAccounts = "Database\\Personnel\\Accounts.txt";
    public final String PathPersonnelInformation = "Database\\Personnel\\Information.txt";

    // Users
    public final String PathUsersAccounts = "Database\\Users\\Accounts.txt";
    public final String PathUsersInformation = "Database\\Users\\Information.txt";

    //
    public final String PathAllAccountsID = "Database\\AllAccountsID.txt";
}
