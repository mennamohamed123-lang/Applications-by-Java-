/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment_1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Jana
 */
public class Assignment_1 {

    public static void main(String[] args) {
        ArrayList<Product> storeProducts = new ArrayList<>();

        storeProducts.add(new Product("Laptop", 15000, 1));
        storeProducts.add(new Product("Phone", 10000, 1));
        storeProducts.add(new Product("Mouse", 200, 1));
        storeProducts.add(new Product("Headphones", 500, 1));
            
        ArrayList<Product> products;
        
        Scanner input = new Scanner(System.in);
        Cart cart = new Cart();

        while(true) {

            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            int choice = input.nextInt();
            input.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Available Products:");

                    for (int i = 0; i < storeProducts.size(); i++) {
                        System.out.println((i + 1) + ". " + storeProducts.get(i).getName() 
                                           + " - " + storeProducts.get(i).calculateTotalPrice());
                    }
                    System.out.print("Choose product number: ");
                    int productChoice = input.nextInt();
                    input.nextLine();
                    
                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();
                    input.nextLine();
                    
                    Product selectedProduct = storeProducts.get(productChoice - 1);
                    Product productToAdd = new Product(
                    selectedProduct.getName(),
                    selectedProduct.getPrice(),
                    quantity
                    );

                    cart.addProduct(productToAdd);
                    System.out.println("Product added to cart!");
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    String name = input.nextLine();
                    cart.removeProduct(name);
                    break;
                case 3:
                    cart.viewCart();
                    break;

                case 4:
                    cart.checkout();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;
            }
        }
    }
}
