package com.nishvi;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> GroceryList =new ArrayList<String>();
    //Method to add elements in the list
    private void addGroceryItem(String item){
        GroceryList.add(item);
        System.out.println("added successfully");
    }
    //Method to print available items
    public void printList(){
        for(int i=0;i< GroceryList.size();i++)
            System.out.println("The item number "+i+" is "+GroceryList.get(i));
    }
    //Checking whether the item already exists or not
    public boolean exist(String item){
        boolean exists = GroceryList.contains(item);
        return exists;
    }
    public void addList(String item){
        boolean e= exist(item);
        if(!e)
            addGroceryItem(item);
        else
            System.out.println("item already exists");
    }
    //Search an itemposition
    public void itemPosition(String item){
        int i;
        boolean e=  exist(item);
        if(e) {
            System.out.println("Item is at" +GroceryList.indexOf(item)+ " position");
        }
        else
            System.out.println("Item not found");
    }
    //Replace an item with new item
    public void modifyItem(String item,String newItem){
        boolean e=exist(item);
        int p;
        if(e){
            p = GroceryList.indexOf(item);
            GroceryList.remove(item);
            GroceryList.add(p,newItem);
        }
    }
}
