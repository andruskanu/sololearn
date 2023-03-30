package files;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class FilePractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("tasks.txt");
            int count = 0;
            while (count < 3) {
                String x = input.nextLine();
                f.format(x + "\n");

                count++;
            }
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        readFile();
    }

    public static void readFile() {
        try {
            File x = new File("tasks.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

