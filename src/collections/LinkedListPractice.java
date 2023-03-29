package collections;

// The program you are given declares LinkedList "words".
//
// Write a program to take words as input and add them to LinkedList untill its size isn't equal to 5,
// then output only those words whose length is more than 4 characters.

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<String> words = new LinkedList<>();

        while (words.size() < 5) {
            String word = sc.nextLine();
            words.add(word);
        }
        for (String i : words) {
            if (i.length() > 4) {
                System.out.println(i);
            }
        }
    }
}
