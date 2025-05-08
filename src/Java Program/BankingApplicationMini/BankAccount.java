package JavaDemo.BankingApplicationMini;

import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;


    }

    void deposite(int amount) {
        if(amount != 0) {
            balance = balance+amount;
            previousTransaction = amount;
        }

    }
    void withdrawn(int amount ) {
        if(amount!=0) {
            balance = balance-amount;
            previousTransaction = -amount;
        }

    }
    void getPreviousTransaction() {
        if (previousTransaction >0) {
            System.out.println("Deposited :"+previousTransaction);
        }

        else if (previousTransaction <0) {
            System.out.println("Withdrawn: "+ Math.abs(previousTransaction));
        }
        else {
            System.out.println("No Transaction is occured");
        }
    }
    void showMenu() {
        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome Dear: "+customerName);
        System.out.println("Your id is : "+customerId);
        System.out.println();
        System.out.println("1: Check Balance ");
        System.out.println("2: Deposited ");
        System.out.println("3: Withdrawn ");
        System.out.println("4: Previous Transacation ");
        System.out.println("5: Exit ");

        do{

            System.out.println("========================");
            System.out.println("Enter the option: ");
            //	    	System.out.println("========================");
            option = sc.next().charAt(0);

            switch(option) {
                case '1':
                    System.out.println("========================");
                    System.out.println("Balance is: "+balance);
                    //	    		  System.out.println("========================");
                    System.out.println();
                    break;

                case '2' :
                    System.out.println("========================");
                    System.out.println("Enter the amount to deposited:");
                    //	    		  System.out.println("========================");
                    int amount = sc.nextInt();
                    deposite(amount);
                    System.out.println();
                    break;

                case '3' :
                    System.out.println("========================");
                    System.out.println("Enter the amount to withdraw");
                    //	    	      System.out.println("========================");
                    int amount2 = sc.nextInt();
                    withdrawn(amount2);
                    System.out.println();
                    break;

                case '4' :
                    System.out.println("========================");
                    getPreviousTransaction();
                    //	    	      System.out.println("========================");
                    System.out.println();
                    break;

                case '5' :
                    System.out.println("========================");
                    break;

                default:
                    System.out.println("Invalid Option: please try again");
                    break;

            }

        }while (option != '5');


    }

}
