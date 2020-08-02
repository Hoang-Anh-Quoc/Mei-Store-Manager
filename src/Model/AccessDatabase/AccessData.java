package Model.AccessDatabase;

import java.io.FileWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class AccessData {

    public static ArrayList<String> getData(final String PathFile) {
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
                frFile.write(data);
            }
        } catch (final Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void getUserAccount() {
        DataProcessing.UsersAccount.clear();
        DataProcessing.UsersAccount.addAll(getData(PathFileInDatabase.PathUsersAccounts));
    }

    public static void setUserAccountToDatabase() {
        setData(DataProcessing.UsersAccount, PathFileInDatabase.PathUsersAccounts);
    }

    public static void getPersonnelAccount() {
        DataProcessing.PersonnelAccounts.clear();
        DataProcessing.PersonnelAccounts.addAll(getData(PathFileInDatabase.PathPersonnelAccounts));
    }

    public static void setPersonnelAccountToDatabase() {
        setData(DataProcessing.PersonnelAccounts, PathFileInDatabase.PathPersonnelAccounts);
    }

    public static void getAdminAccount() {
        DataProcessing.AdminsAccounts.clear();
        DataProcessing.AdminsAccounts.addAll(getData(PathFileInDatabase.PathAdminsAccounts));
    }

    public static void setAdminAccountToDatabase() {
        setData(DataProcessing.AdminsAccounts, PathFileInDatabase.PathAdminsAccounts);
    }

    public static void getAccountID() {
        DataProcessing.AllAccountsID.clear();
        DataProcessing.AllAccountsID.addAll(getData(PathFileInDatabase.PathAllAccountsID));
    }

    public static void setAccountIDToDatabase() {
        setData(DataProcessing.AllAccountsID, PathFileInDatabase.PathAllAccountsID);
    }

}
