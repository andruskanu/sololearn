package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class IteratorPractice2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> nums = new LinkedList<>();

        while (nums.size() < 5) {
            System.out.print("Add elem: ");
            nums.add(sc.nextInt());
        }

        int sum = 0;

        for (Integer s : nums) {
            sum += s;
        }
        System.out.println("Sum = " + sum);
    }
}
