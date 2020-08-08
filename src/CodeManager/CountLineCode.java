package CodeManager;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CountLineCode {
    public static void main(String[] args) throws IOException {
        Scanner scPathFileCode = new Scanner(Paths.get("src\\CodeManager\\PathFileCode.txt"));

        ArrayList<String> ListPathFileCode = new ArrayList<>();
        while (scPathFileCode.hasNextLine()){
            ListPathFileCode.add(scPathFileCode.nextLine());
            System.out.println(ListPathFileCode.get(ListPathFileCode.size() - 1));
        }
            
        scPathFileCode.close();

        FileWriter frCode = new FileWriter("src\\CodeManager\\Code.txt");

        int LineCode = 0;
        for(String FileCode : ListPathFileCode){
            Scanner scFileCode = new Scanner(Paths.get(FileCode));
            while (scFileCode.hasNextLine()){
                ++LineCode;
                frCode.write(scFileCode.nextLine() + "\n");
            }                        
            scFileCode.close();
        }        
        frCode.close();
        System.out.println("Line of code in project: " + LineCode);
    }
}
