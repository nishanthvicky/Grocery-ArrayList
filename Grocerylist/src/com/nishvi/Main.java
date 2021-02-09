package com.nishvi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GroceryList Groceries = new GroceryList();
        int c;
        String item;
        Scanner s = new Scanner(System.in);
        System.out.println("Press 1 to start (OR) press 0 to exit");
         c= s.nextInt();
         s.nextLine();
        while (c != 0) {
            System.out.println("Enter 1 to add");
            System.out.println("Enter 2 to print");
            System.out.println("Enter 3 to search");
            System.out.println("Enter 4 to modify");
            System.out.println("Enter 0 to exit");
            System.out.println("Enter your choice");
            c=s.nextInt();
            s.nextLine();
            switch (c) {
                case 1:
                    System.out.println("enter an item");
                    item = s.nextLine();
                    Groceries.addList(item);
                    break;
                case 2:
                    Groceries.printList();
                    break;
                case 3:
                    System.out.println("enter an item");
                    item = s.nextLine();
                    Groceries.itemPosition(item);
                    break;
                case 4:
                    System.out.println("Enter the replacement item");
                    String item1 = s.nextLine();
                    System.out.println("Enter the replacing item");
                    String item2 = s.nextLine();
                    Groceries.modifyItem(item1,item2);
                    break;
            }
        }
    }
}
