/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoppinglistassignment;

/**
 *
 * @author Samuel Chang
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();
        
        // Adding items to the shopping list
        System.out.println("Enter items for your shopping list (type 'done' to finish):");
        while (true) {
            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("done")) {
                break;
            }
            shoppingList.add(item);
        }

        // Display the shopping list
        System.out.println("\nYour Shopping List:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }

        // Remove an item
        System.out.print("\nEnter the number of an item to remove (or 0 to skip): ");
        int index = scanner.nextInt();
        if (index > 0 && index <= shoppingList.size()) {
            shoppingList.remove(index - 1);
            System.out.println("Item removed!");
        }

        // Display the updated list
        System.out.println("\nUpdated Shopping List:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }

        scanner.close();
    }
}
