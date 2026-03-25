
package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.util.ArrayList;
public class Mavenproject1 {
     
    

    public static void main(String[] args) {
         
        Scanner input= new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        Account mainAC=new Account();
        
        
            
            System.out.print("Hello !! ,enter a name and an intial balance to create an account ");
            Account acc=new Account();
            String nm=input.nextLine();
            int bl=input.nextInt();
            System.out.print(" Enter an account numer(4 digits) ");
            int accNum=input.nextInt();
            acc.account(nm, bl,accNum);
            accounts.add(acc);
            System.out.println("welcome "+nm+"!!");
            mainAC=acc;
        
        while (true){
        System.out.println("Menu :- ");
        System.out.println("1-Creat Account.");
        System.out.println("2-Deposite.");
        System.out.println("3-WithDraw.");
        System.out.println("4-Log in."); 
        System.out.println("5-CheckBalance.");
        System.out.println("6-Exit");
       
        int ch =input.nextInt();
        if(ch==1){
        System.out.print("Hello !! ,enter a name and an intial balance to create an account ");
        acc=new Account();
        input.nextLine();
        nm=input.nextLine();
        bl=input.nextInt();
        System.out.print(" Enter an account numer(4 digits) ");
        accNum=input.nextInt();
        acc.account(nm, bl,accNum);
        accounts.add(acc);
        mainAC=acc;
        }
        if(ch==2){
            System.out.println("Enter the sum of money");
            int mny=input.nextInt();
            mainAC.deposite(mny);
        }else if (ch==3){
            System.out.println("Enter the sum of money");
            int mny=input.nextInt();
            mainAC.WithDraw(mny);
        }else if (ch==4){
            boolean found=false;
            System.out.print(" Enter your account numer(4 digits) ");
            int numb=input.nextInt();
            for(Account ac:accounts){
                if (numb==ac.acNumber){
                    mainAC=ac;
                    System.out.println("welcome back "+ac.holder);
                    found=true;
                    break;
                }
            }
        
            if(!found){
                
                System.out.print("can not find your account ");
                System.out.print("Enter a name and an intial balance to create an account ");
                acc=new Account();
                input.nextLine();
                nm=input.nextLine();
                bl=input.nextInt();
                System.out.print(" Enter an account numer(4 digits) ");
                accNum=input.nextInt();
                acc.account(nm, bl,accNum);
                accounts.add(acc);
                System.out.println("welcome "+nm+"!!");
                mainAC=acc;
            }
        
        }
        else if (ch==5){
            mainAC.CheckBalance();
        
        }else if(ch==6){
            
            break;
        }
        
    }
    }
}
      