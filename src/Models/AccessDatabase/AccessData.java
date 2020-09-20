package Models.AccessDatabase;

import java.io.FileWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class AccessData {

    private static ArrayList<String> getData(final String PathFile) {
        ArrayList<String> ListAccount = null;
        try (Scanner scFile = new Scanner(Path.of(PathFile))) {
            ListAccount = new ArrayList<>();
            while (scFile.hasNextLine()) {
                ListAccount.add(scFile.nextLine());
            }
        } catch (final Exception e) {
            System.out.println(e.toString());
        }
        return ListAccount;
    }

    private static void setData(final ArrayList<String> listData, final String PathFile) {
        try (FileWriter frFile = new FileWriter(PathFile)) {
            for (final String data : listData) {
                frFile.write(data + "\n");            
            }
        } catch (final Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void getUserAccount() {
        DataProcessing.UsersAccount.clear();
        DataProcessing.UsersAccount.addAll(getData(PathFile.PathUsersAccounts));
    }
    public static void setUserAccountToDatabase() {
        setData(DataProcessing.UsersAccount, PathFile.PathUsersAccounts);
    }

    public static void getPersonnelAccount() {
        DataProcessing.PersonnelAccounts.clear();
        DataProcessing.PersonnelAccounts.addAll(getData(PathFile.PathPersonnelAccounts));
    }

    public static void setPersonnelAccountToDatabase() {
        setData(DataProcessing.PersonnelAccounts, PathFile.PathPersonnelAccounts);
    }

    public static void getAdminAccount() {
        DataProcessing.AdminsAccounts.clear();
        DataProcessing.AdminsAccounts.addAll(getData(PathFile.PathAdminsAccounts));
    }

    public static void setAdminAccountToDatabase() {
        setData(DataProcessing.AdminsAccounts, PathFile.PathAdminsAccounts);
    }

    public static void getAccountID() {
        DataProcessing.AllAccountsID.clear();
        DataProcessing.AllAccountsID.addAll(getData(PathFile.PathAllAccountsID));
    }

    public static void setAccountIDToDatabase() {
        setData(DataProcessing.AllAccountsID, PathFile.PathAllAccountsID);
    }

    public static void getUserInformation(){
        DataProcessing.UserInformation.clear();
        DataProcessing.UserInformation.addAll(getData(PathFile.PathUsersInformation));
    }

    public static void setUserInformationToDatabase(){
        setData(DataProcessing.UserInformation, PathFile.PathUsersInformation);
    }

    public static void getPersonnelInformation(){
        DataProcessing.PersonnelInformation.clear();
        DataProcessing.PersonnelInformation.addAll(getData(PathFile.PathPersonnelInformation));
    }

    public static void setPersonnelInformationToDatabase(){
        setData(DataProcessing.PersonnelInformation, PathFile.PathPersonnelInformation);
    }

    public static void getAdminInformation(){
        DataProcessing.AdminInformation.clear();
        DataProcessing.AdminInformation.addAll(getData(PathFile.PathAdminsInformation));
    }

    public static void setAdminInformationToDatabase(){
        setData(DataProcessing.AdminInformation, PathFile.PathAdminsInformation);
    }

    public static void getAllOrder(){
        DataProcessing.AllOrder.clear();
        DataProcessing.AllOrder.addAll(getData(PathFile.PathOrder));
    }

    public static void setAllOrderToDatabase(){
        setData(DataProcessing.AllOrder, PathFile.PathOrder);
    }

    public static void getAllItem(){
        DataProcessing.AllItem.clear();
        DataProcessing.AllItem.addAll(getData(PathFile.PathItem));
    }

    public static void setAllItem(){
        setData(DataProcessing.AllItem, PathFile.PathItem);
    }

}
