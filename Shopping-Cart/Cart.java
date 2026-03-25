/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_1;
import java.util.ArrayList;
/**
 *
 * @author Jana
 */
public class Cart {
    ArrayList<Product> products;
    public Cart(){
        products = new ArrayList<>();
    }
    public void addProduct(Product p){
        products.add(p);
    }
    public void viewCart(){
        if(products.isEmpty()){
            System.out.println("Cart is empty");
        }else{
            for(Product p : products){
                System.out.println(p);
            }
        }
    }
    public double calculateSubtotal(){
        double total = 0;
        for(Product p : products){
            total+= p.calculateTotalPrice();
        }
        return total;
    }
    public void removeProduct(String productName){
        boolean found = false;
        for(int i = 0; i < products.size(); i++){
            
        if (products.get(i).getName().equalsIgnoreCase(productName)) {
            products.remove(i);
            found = true;
            System.out.println("Product removed successfully!");
            break;
        }
    }

        if (!found) {
            System.out.println("Product not found.");
        }
    }
    public void checkout(){
        if(products.isEmpty()){
            System.out.println("Cart is empty");
            return;
        }
        double subtotal = calculateSubtotal();
        
        double discount = 0;
        if (subtotal > 5000) {
            discount = subtotal * 0.10;
        }
        double tax = (subtotal - discount) * 0.14;
        double finalTotal = subtotal - discount + tax;
        viewCart();
        System.out.println("======= INVOICE =======");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Total: " + finalTotal);
        System.out.println("Thank you for shopping!");
    }
}
