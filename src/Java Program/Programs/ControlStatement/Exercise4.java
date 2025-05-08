package JavaDemo.Programs.ControlStatement;

public class Exercise4 {

    // Palindrome problem
    public static void main(String[] args) {
        int num=1221;
        int ori=num;
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;

            num=num/10;
        }
        if(ori==rev)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome");

        }


    }
}
