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
}
