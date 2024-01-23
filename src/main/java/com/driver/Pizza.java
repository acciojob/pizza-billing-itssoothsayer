package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean takeawayAdded;
    private String bill;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400; // Setting base price based on veg or non-veg pizza
        this.bill = ""; // Initializing bill as an empty string
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            int toppingsPrice = isVeg ? 70 : 120; // Setting toppings price based on veg or non-veg pizza
            this.price += toppingsPrice;
            this.bill += "Extra Toppings Added: " + toppingsPrice + "\n";
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (!takeawayAdded) {
            this.price += 20;
            this.bill += "Paperbag Added: 20\n";
            takeawayAdded = true;
        }
    }

    public String getBill() {
        this.bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
