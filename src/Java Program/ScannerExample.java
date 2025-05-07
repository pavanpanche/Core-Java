package JavaDemo;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter char value=");
        char ch=sc.next().charAt(0);
        System.out.println(ch);

    }
}
