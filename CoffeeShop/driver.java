package BenchChallenges.CoffeeShop;

import java.util.ArrayList;

public class driver {
    public static void main(String[] args) {
        // setting menu
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
        MenuItem itemOne = new MenuItem();
        itemOne.setItem("Cappuccino");
        itemOne.setPrice(5.0d);
        itemOne.setType("drink");
        menu.add(itemOne);

        MenuItem itemTwo = new MenuItem();
        itemTwo.setItem("Cafe Latte");
        itemTwo.setPrice(4.0d);
        itemTwo.setType("drink");
        menu.add(itemTwo);

        MenuItem itemThree = new MenuItem();
        itemThree.setItem("Americano");
        itemThree.setPrice(3.5d);
        itemThree.setType("drink");
        menu.add(itemThree);
        
        MenuItem itemFour = new MenuItem();
        itemFour.setItem("Expresso");
        itemFour.setPrice(4.5d);
        itemFour.setType("drink");
        menu.add(itemFour);

        MenuItem itemFive = new MenuItem();
        itemFive.setItem("Croissant");
        itemFive.setPrice(6.0d);
        itemFive.setType("food");
        menu.add(itemFive);

        MenuItem itemSix = new MenuItem();
        itemSix.setItem("Pain au Chocolat");
        itemSix.setPrice(6.5d);
        itemSix.setType("food");
        menu.add(itemSix);

        // setting up coffee shop
        CoffeeShop shop = new CoffeeShop();
        shop.setMenu(menu);
        shop.setName("Adezzo");

        // getting all foods
        ArrayList<String> foods = shop.foodOnly();
        System.out.println("All foods: " + foods.toString());

        // getting all drinks
        ArrayList<String> drinks = shop.drinksOnly();
        System.out.println("All drinks: " + drinks.toString());

        // getting the cheapest item
        String cheapest = shop.cheapestItem();
        System.out.println("Cheapest Item: " + cheapest);

        // adding orders
        System.out.println("Adding orders...");
        shop.addOrder("Cappuccino");
        shop.addOrder("Croissant");

        // attempting to add order that doesn't exist
        System.out.print("Trying to add a bagel: ");
        shop.addOrder("Bagel");

        // listing orders
        ArrayList<String> orders = shop.listOrders();
        System.out.println("Orders placed: " + orders.toString());

        // getting the due amount for the order
        double amount = shop.dueAmount();
        System.out.println("Due amount: " + amount);

        // fulfilling the order
        System.out.println("Fulfilling order below:");
        shop.fulfillOrder();

        // trying to fulfill an empty order
        System.out.println("Attempting to fulfill an empty order below:");
        shop.fulfillOrder();
        
    }
}
