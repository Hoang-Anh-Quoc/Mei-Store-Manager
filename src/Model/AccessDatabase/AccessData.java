package Model.AccessDatabase;

import java.io.FileWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;


public class AccessData {

    public static ArrayList<String> getData(String PathFile) {
        ArrayList<String> ListAccount = null;
        try (Scanner scFile = new Scanner(Path.of(PathFile))) {
            ListAccount = new ArrayList<>();
            while (scFile.hasNextLine()) {
                ListAccount.add(scFile.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return ListAccount;
    }

    public static void setData(ArrayList<String> listData , String PathFile) {
        try(FileWriter frFile = new FileWriter(PathFile)){
            for(String data : listData){
                frFile.write(data);
            }
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }

    public static void getUserAccount(){
        DataProcessing.UsersAccount.clear();
        DataProcessing.UsersAccount.addAll(getData(PathFileInDatabase.PathUsersAccounts));
    }

    public static void getPersonnelAccount(){
        DataProcessing.PersonnelAccounts.clear();
        DataProcessing.PersonnelAccounts.addAll(getData(PathFileInDatabase.PathPersonnelAccounts));
    }

    public static void getAdminAccount(){
        DataProcessing.AdminsAccounts.clear();
        DataProcessing.AdminsAccounts.addAll(getData(PathFileInDatabase.PathAdminsAccounts));
    }
}
