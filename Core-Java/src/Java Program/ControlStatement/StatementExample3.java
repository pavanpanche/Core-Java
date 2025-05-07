package JavaDemo.ControlStatement;

public class StatementExample3 {
    public static void main(String[] args) {

        //Multiple if statement

        int marks=87;
        if(marks>90)
        {
            System.out.println("A grade");
        }
        if((marks>80) && (marks<90))
        {
            System.out.println("B grade");
        }
        if((marks>70) && (marks<80))
        {
            System.out.println("C grade");
        }
        else
        {
            System.out.println("Fail");
        }

    }
}
