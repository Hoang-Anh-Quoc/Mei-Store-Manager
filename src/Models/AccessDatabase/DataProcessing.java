package Models.AccessDatabase;

import java.util.ArrayList;

public interface DataProcessing {
    // Admin
    ArrayList<String> AdminsAccounts = new ArrayList<>();
    ArrayList<String> AdminInformation = new ArrayList<>();

    // Warehouse
    ArrayList<String> AllItem = new ArrayList<>();

    // Personnel
    ArrayList<String> PersonnelAccounts = new ArrayList<>();
    ArrayList<String> PersonnelInformation = new ArrayList<>();

    // Users
    ArrayList<String> UsersAccount = new ArrayList<>();
    ArrayList<String> UserInformation = new ArrayList<>();
    ArrayList<String> AllOrder = new ArrayList<>();

    //
    ArrayList<String> AllAccountsID = new ArrayList<>();
}
