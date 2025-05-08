package JavaDemo.Programs.javabasic;

public class OperatorExample {
    public static void main(String[] args) {

        // Simple Arithmetic operation inside print statement
        System.out.println(6+10);  // output 16
        System.out.println(5-7);   // output -2
        System.out.println(2*6);   // output 12
        System.out.println(6/3);   // output 2
        System.out.println(16%4);  // output 0


        // Arithmetic operation with two variable
        int a = 20;
        int b = 10;
        System.out.println(a+b);  // output 30
        System.out.println(a-b);  // output 10
        System.out.println(a*b);  // output 200
        System.out.println(a/b);  // output 2
        System.out.println(a%b);  // output 0

        // Advance Arithmetic operation with variable expression
        int c = 25;
        int d = 15;
        int e1 = c+d;
        int e2 = c-d;
        int e3 = c*d;
        int e4 = c/d;
        int e5 = c%d;

        System.out.println(e1);   // 40
        System.out.println(e2);   // 10
        System.out.println(e3);   // 375
        System.out.println(e4);   // 1
        System.out.println(e5);   // output: reminder 10
        System.out.println(e1+e2+e3+e4+e5); // sum = 436


    }
}
