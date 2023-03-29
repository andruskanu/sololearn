package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        int sum = 0;

        while (evenNumbers.size() < 3) {
            int num = sc.nextInt();
            evenNumbers.add(num);
            sum = sum + num;
        }
        System.out.println(sum / evenNumbers.size());
    }
}
