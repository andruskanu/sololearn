package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (list.size() < 5) {
            System.out.print("input number: ");
            list.add(sc.nextInt());
        }
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
