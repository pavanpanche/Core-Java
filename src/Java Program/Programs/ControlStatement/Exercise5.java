package JavaDemo.Programs.ControlStatement;

public class Exercise5 {
    public static void main(String[] args) {
        // Prime Number
        int n=9;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count=count+1;
            }
        }
        if(count==2)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("Not prime");

        }

    }
}
