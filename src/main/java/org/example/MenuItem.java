package org.example;

public class MenuItem extends MenuComponent{
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    public double getPrice() {
        return price;
    }
    public void print() {
        System.out.print("Name: " + name);
        if(isVegetarian()) {
            System.out.print("    Vegetarian ");
        }
        System.out.print("   Price: " + price);
        System.out.print("   Description: " + description);
        System.out.println();
    }
}
