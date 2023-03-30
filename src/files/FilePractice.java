package files;

import java.io.File;
import java.util.Formatter;

public class FilePractice {

    public static void main(String[] args) {

        //check if the file exists
        File myFile = new File("C:\\sololearn\\test.txt");
        if (myFile.exists()) {
            System.out.println(myFile.getName() + "exists!");
        } else {
            System.out.println("The file does not exist");
        }


        //creating & writing file
        try {
            Formatter f = new Formatter("C:\\sololearn\\test.txt");
            f.format("%s %s %s", "1", "John", "Smith \r\n");
            f.format("%s %s %s", "2", "Amy", "Brown");
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}