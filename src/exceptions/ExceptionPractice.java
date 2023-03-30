package exceptions;

public class ExceptionPractice {

    public static void main(String[] args) {

        int a[] = new int[2];
        int d = 0;

        try {
            System.out.println(a[5]);
            System.out.println(d + a[6]);
            d = a[6];

        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }

    void myFunc(int arg) throws IllegalArgumentException{
        if(arg < 0)
            throw new IllegalArgumentException();
    }
}

