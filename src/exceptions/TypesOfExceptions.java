package exceptions;

public class TypesOfExceptions{

    public static void main(String[] args) {

        try {
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Test");
        }
    }
}
