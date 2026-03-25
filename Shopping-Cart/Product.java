/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_1;

/**
 *
 * @author Jana
 */
public class Product {
    String name;
    double price;
    int quantity;
    public Product(String n, double p, int q){
        name = n;
        price = p;
        quantity = q;
    }
    public double calculateTotalPrice(){
        double total = price * quantity;
        return total;
    }
    @Override
    public String toString() {
    return name + " x" + quantity + " = " + calculateTotalPrice();
    }
    public String getName() {
    return name;
    }
    public double getPrice() {
    return price;
    }
}
