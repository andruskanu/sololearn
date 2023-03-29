package collections;

public class ArrayListPractice {

    public static void main(String[] args) {

        java.util.ArrayList<String> colors = new java.util.ArrayList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");

        System.out.println(colors);
        System.out.println();

        System.out.println(colors.contains("Green"));
        System.out.println(colors.contains("Black"));

        System.out.println(colors.get(3));

        System.out.println(colors.size());

        colors.clear();
        System.out.println(colors);
    }
}

