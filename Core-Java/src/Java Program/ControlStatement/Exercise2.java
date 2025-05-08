package JavaDemo.ControlStatement;

public class Exercise2 {

    // check big number among 4 number

    public static void main(String[] args) {
        int first=12;
        int second=16;
        int third=11;
        int four=17;
        if((first>second) && (first>third) && (first>four))
        {
            System.out.println(first+" is a big num");
        }
        else if((second>first) && (second>third) && (second>four))
        {
            System.out.println(second+" is a big num");

        }
        else if((third>first) && (third>second) && (third>four))
        {
            System.out.println(third+" is a big num");

        }
        else
        {
            System.out.println(four+" is a big num");

        }


    }
}
