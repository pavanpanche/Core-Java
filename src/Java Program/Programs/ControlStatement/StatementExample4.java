package JavaDemo.Programs.ControlStatement;

public class StatementExample4 {
    public static void main(String[] args) {
        if(15>22)   // false
        {
            if(6>11)
            {
                System.out.println("Nested if");
            }
            else
            {
                System.out.println("else in nested if");
            }
        }


    }
}
