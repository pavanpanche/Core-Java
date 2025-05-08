package com.example.interfaces;
 class LoanUser {

     public static void main(String[] args) {
         Loan loan = new HomeLoanImpl();
         loan.getLoan();
         Loan Hemanth=new EducationLoanImpl();
         Hemanth.getLoan();
         Loan venky=new GoldLoanImpl();
         venky.getLoan();
     }

}
