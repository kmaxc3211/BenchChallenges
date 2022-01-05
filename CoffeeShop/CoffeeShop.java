package CoffeeShop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CoffeeShop {
    String name;
    ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
    Queue<MenuItem> orders = new LinkedList<MenuItem>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public void addOrder(String itemName){
        Iterator<MenuItem> menuIterator = menu.iterator();
        while(menuIterator.hasNext()){
            MenuItem curr = menuIterator.next();
            if(curr.getItem().equals(itemName)){
                orders.add(curr);
                return;
            }
        }
        System.out.println("This item is currently unavailable!");
        return;
    }

    public void fulfillOrder(){
        MenuItem head = orders.poll();
        if(head == null){
            System.out.println("All orders have been fulfilled!");
            return;
        }
        while(head != null){
            System.out.println("The " + head.getItem() + " is ready!");
            head = orders.poll();
        }
        return;
    }

    public ArrayList<String> listOrders(){
        ArrayList<String> ordersPlaced = new ArrayList<String>();
        for (MenuItem menuItem : orders) {
            ordersPlaced.add(menuItem.item);
        }
        return ordersPlaced;
    }

    public double dueAmount(){
        double total = 0.0d;
        for (MenuItem menuItem : orders) {
            total += menuItem.getPrice();
        }
        return total;
    }

    public String cheapestItem(){
        // returns the name of the cheapest item on the menu.
        String cheapestItemName = menu.get(0).getItem();
        double price = menu.get(0).getPrice();
        for (MenuItem menuItem : menu) {
            if(menuItem.getPrice() < price){
                price = menuItem.getPrice();
                cheapestItemName = menuItem.getItem();
            }
        }
        return cheapestItemName;
    }
    
    public ArrayList<String> drinksOnly() {
        // returns only the item names of type drink from the menu.
        ArrayList<String> drinksNameList = new ArrayList<String>();
        for (MenuItem menuItem : menu) {
            if(menuItem.getType().equals("drink"))
                drinksNameList.add(menuItem.getItem());
        }
        return drinksNameList;
    }
    
    public ArrayList<String> foodOnly() {
        // returns only the item names of type food from the menu.
        ArrayList<String> foodsNameList = new ArrayList<String>();
        for (MenuItem menuItem : menu) {
            if(menuItem.getType().equals("food"))
                foodsNameList.add(menuItem.getItem());
        }
        return foodsNameList;
    }


}