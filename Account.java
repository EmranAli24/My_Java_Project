package com.java.Emran_Ali.ATM_Project;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new  Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    /* set the customer number  */

    /*int customerNumber*/
    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;

    }

    /* get the customer number */
    public int getCustomerNumber(){
        return customerNumber;
    }

    /* set the pin number */
   /* int pinNumber;*/
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber ;
        return pinNumber ;
    }

    /* get the pin number */
    public int getPinNumber(){
        return pinNumber;
    }

    /* get Checking account balance */
    public double getCheckingBalance(){
        return checkingBalance ;
    }


    /* get saving  account balance */

    public double getSavingBalance (){
        return savingBalance ;
    }

    /* Calculate checking Account withdrawal */

    public double calcCheckingWithdraw(double amount ){
        checkingBalance -= amount;
        return checkingBalance ;
    }

    /* Calculate saving Account withdrawal */

    public double calcSavingWithdraw(double amount){
         savingBalance -= amount ;
         return savingBalance ;
    }

    /* Calculate checking Account deposit  */

    public double calcCheckingDeposit(double amount)
    {
        checkingBalance += amount;
        return checkingBalance ;
    }

    /* calculate saving account deposit  */
    public double calcSavingDeposit(double amount){
        savingBalance += amount;
        return savingBalance ;
    }

    /* Customer Checking Account withdraw input */
    public void getCheckingWithdrawInput(){

        System.out.println("Checking Account Balance : "+ moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to Withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance : " + moneyFormat.format(checkingBalance));
        }
        else {
            System.out.println("Insufficient Balance.");
        }
    }

    /* Customer saving Account withdraw  input */
    public void  getSavingWithdrawInput(){
        System.out.println("Saving Account Balance : " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from saving Account : ");
        double amount = input.nextDouble();

        if((savingBalance - amount) >=0 ){
            calcSavingWithdraw(amount);
            System.out.println("New saving Account balance : " + savingBalance);
        }
        else {
            System.out.println("Insufficient Balance.");

        }
    }

    /* Customer checking Account Deposit input */
    public void getCheckingDepositInput(){

        System.out.println("Checking Account Balance : " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance + amount ) >= 0 ){
            calcCheckingDeposit(amount);
            System.out.println("New checking Account Balance : " + moneyFormat.format(checkingBalance));
        }
        else {
            System.out.println("Balance cannot be negative.");
        }
    }

    /*Customer saving Account deposit input */

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance : " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from saving Account : ");
        double amount = input.nextDouble();

        if((savingBalance + amount ) >= 0 ){
            calcSavingDeposit(amount);
            System.out.println("New saving Account balance : " + moneyFormat.format(savingBalance));
        }
        else {
            System.out.println("Balance cannot be negative.");
        }

    }

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0 ;
}
