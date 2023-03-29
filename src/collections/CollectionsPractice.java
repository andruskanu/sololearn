package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsPractice {

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");

        Collections.sort(animals);
        System.out.println(animals);

        System.out.println();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(4);
        nums.add(35);
        nums.add(28);
        Collections.sort(nums);
        Collections.reverse(nums);
        System.out.println(nums);
    }
}
