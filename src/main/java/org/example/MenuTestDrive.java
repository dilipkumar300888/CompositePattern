package org.example;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU","Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course!");
        MenuComponent allMenus = new Menu("ALL MENU","All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);
        dessertMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89
        ));
        dinnerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59
        ));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
