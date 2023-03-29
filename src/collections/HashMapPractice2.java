package collections;

//The program you are given defines and outputs HashMap, where the names of employees are stored as keys, and their ages as values.
//
//It also takes N number from user as age limit. Write code to delete all the employees whom age is less than N number.
//
//The line of code for the output of HashMap object is already provided.

//Sample Input 25
//Sample Output {Robert=32, John=28}
//Hint: Use get() method to access values in the HashMap and remove() to delete them.

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> employees = new HashMap<>();

        employees.put("David", 22);
        employees.put("Tom", 23);
        employees.put("Robert", 16);
        employees.put("Alice", 21);
        employees.put("Sophie", 19);
        employees.put("Maria", 24);
        employees.put("John", 28);

        String[] array = new String[employees.size()];

        array = employees.keySet().toArray(array);

        int ageLimit = sc.nextInt();

        for (String i : array) {
            if (employees.get(i) < ageLimit) {
                employees.remove(i);
            }
        }
        System.out.println(employees);
    }
}
