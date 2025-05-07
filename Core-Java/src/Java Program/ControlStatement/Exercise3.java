package JavaDemo.ControlStatement;

public class Exercise3 {

    // Swap logic without third variable
    public static void main(String[] args) {
        int first=10;
        int second=20;

        System.out.println("Before Swapping");
        System.out.println("first is"+first);
        System.out.println("second is"+second);
        System.out.println("===================");
        System.out.println("After Swapping");
        first=  first+second;
        second= first-second;
        first=  first-second;
        System.out.println(first);
        System.out.println(second);


    }
}
