package exceptions;

import java.util.Scanner;

public class ExceptionPractice2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pick a number and press enter: ");
        int choice = scanner.nextInt();

        String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};

        try {
            System.out.println(categories[choice]);
        } catch (Exception e) {
            System.out.println("Wrong Option");
        }
    }
}
