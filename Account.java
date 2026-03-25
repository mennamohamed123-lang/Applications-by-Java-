/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

 
     

public class Account {

    String holder;
    double Balance;
    int acNumber;
    public Account(){}

    public void account(String name, int balance,int acNm) {
        holder = name;
        Balance = balance;
        acNumber=acNm;

        System.out.println("account made sucessfully!!");
        System.out.println("your name is : " + holder);
        System.out.println("your balance is : " + Balance);
    }

    public void deposite(int ins) {
        Balance += ins;

        System.out.println("successful process!!");
        System.out.println("current balance is : " + Balance);
    }

    public void WithDraw(int outs) {
        if (Balance >= outs) {
            Balance -= outs;
            System.out.println("successful process!!");
            System.out.println("current balance is : " + Balance);
        } else {
            System.out.println(" process failed !! ");
        }
    }

    public void CheckBalance() {
        System.out.println("current balance is : " + Balance);
    }
}
    

