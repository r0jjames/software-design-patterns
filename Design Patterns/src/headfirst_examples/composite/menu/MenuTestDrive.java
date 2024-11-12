package headfirst_examples.composite.menu;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        pancakeHouseMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marina Sauce", true, 1.59));
        dessertMenu.add(new MenuItem("Apple pie", "Apple pie with flaky crust", true, 3.89));
        cafeMenu.add(new MenuItem("Veggie burger and fries", "This is description", true, 2.42));

        Waitress waitress = new Waitress(allMenus);
        waitress.print();
    }
}
