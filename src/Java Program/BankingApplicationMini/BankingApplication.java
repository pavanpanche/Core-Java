package JavaDemo.BankingApplicationMini;

import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount bank1 = new BankAccount("AryanChepa", "AcNum8889382036");
        bank1.showMenu();
    }


}
