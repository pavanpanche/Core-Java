package JavaDemo.Programs.ControlStatement;

public class LoopStatement4 {
    public static void main(String[] args) {
        for(int j=1;j<=2;j++)       // ====>outer forloop
        {
            for(int i=1;i<=3;i++)   // ====>inner forloop
            {
                System.out.println(i);
            }
        }

    }
}
