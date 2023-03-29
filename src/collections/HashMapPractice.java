package collections;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Amy", 154);
        map.put("Dave", 42);
        map.put("Rob", 733);

        System.out.println(map.size());
        System.out.println(map.get("Rob"));
        System.out.println(map.get("Dinu"));
    }
}
