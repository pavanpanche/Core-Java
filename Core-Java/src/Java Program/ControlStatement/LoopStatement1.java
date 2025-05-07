package JavaDemo.ControlStatement;

public class LoopStatement1 {

    //while loop statement

    public static void main(String[] args) {

        // count digit
        int num=123;
        int cd=0;
        while(num>0)
        {
            int rem=num%10;
            cd=cd+1;

            num=num/10;
        }
        System.out.println(cd);

    }

}

