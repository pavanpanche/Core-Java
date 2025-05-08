package JavaDemo;

public class TypeConversionExample {
    public static void main(String[] args) {
        // boolean a = true;
        // int b =a;
        // System.out.println(b);  // java: incompatible types: boolean cannot be converted to int

        //  int c = 10;
        // boolean d = c;
        //  System.out.println(d);  // java: incompatible types: boolean cannot be converted to int

        // note:  any data type can not be converted into boolean
        // 56 type conversion is allowed in java excluding boolean


        // remaining datatype conversion is possible
        // note: Always perform type conversion small size data type to big size of data type

         // implicitly type conversion or widening
         byte by = 35;
         short s = by;
         System.out.println(s);  // output: 35


         byte byt = 24;
         int i = byt;
         System.out.println(i);   // output: 24


         long l = 34;
         float f = l;
         System.out.println(f);   // output : 34.0

         float f1 = 35.9f;
         double d = f1;
         System.out.println(d); //output: 35.9

         char ch = 97;
         int a2 = ch;
         System.out.println(a2); // 97

         char che = 65;
         long l2 = che;
         System.out.println(l2); // 65

         // explicitly type conversion / narrowing

         char cha = 66;
         byte l3 = (byte) cha;
         System.out.println(l3);  // 66

         char chr = 9;
         short s4 = (short) chr;
         System.out.println(s4);  //  9


         // Ascii Value with char
         // 0-9 digit  : 48 to 57
         // A-Z Alphabet:  65 to 90
         // a-z alphabet:  97 to 122

         char chs = 97;
         System.out.println(chs);  // this is ascii value of : a

         char chf = 'a' ;
         System.out.println(chf); // a

         char chg = 57;
         System.out.println(chg); // 9


    }


}
