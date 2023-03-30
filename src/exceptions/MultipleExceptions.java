package exceptions;

import java.util.Scanner;

public class MultipleExceptions extends Throwable{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println(result);

        } catch(ArithmeticException e) {

            System.out.println("Error: division by zero");

        } catch(Exception e) {

            System.out.println("Error: wrong value type");
        }
    }
}
