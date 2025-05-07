package JavaDemo;

// 8 type of primitive/predefine datatype is present in java and this are developed by java developer(oracle).
// Primitive datatypes stores 1 value at a time
// byte, short, int, long, float, double, char, boolean
// byte, short, int, long are store only integer +, - value without decimal.
// float, double store both +, - with decimal and without decimal

public class DataTypeExample {

    public static void main(String[] args) {
         // byte first example with integer value/ without decimal
         byte b = 10;
         System.out.println(b);  //output 10

        // We can not store decimal value in any integer datatype.
        // if we want store decimal value type casting is required but always return in form of integer value only.

        // byte second example with decimal / floating point value
        byte ba  = (byte) 7.2;
        System.out.println(ba);  // output 7

        // short example
        short s = 35;
        System.out.println(s);

        // int example
        int i = 12;
        System.out.println();

        //In Long data type we want to store more than int value always end with l or L after value
        // long example
        long l = 34;
        System.out.println(l);

        long la = 2147483647L;   // int size is - 2,147,483,648  to 2,147,483,647
        System.out.println(la);



        // Floating point datatype example
        // float Store both +, - with decimal without decimal and always end with f or F

        float f = 14.7f;
        System.out.println(f);

        float fa = 17.49F;
        System.out.println(fa);


        //double store both +, - with decimal without decimal no need to use d or D
        double d = 346567.98;
        System.out.println(d);
    }
}
