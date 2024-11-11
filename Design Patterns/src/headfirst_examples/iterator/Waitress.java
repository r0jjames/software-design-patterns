package headfirst_examples.iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;
    List<Menu> menus;

    Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    /**

    Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
        System.out.println("MENU\n----");
        // Breakfast
        System.out.println("Breakfast:\n");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\n\nLunch:\n");
        printMenu(dinerMenuIterator);
        System.out.println("\n\nDinner\n");
        printMenu(cafeIterator);
    }
     **/

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.print(item.getName() + ", " + item.getPrice() + ", " + item.getDescription() + "\n");
        }
    }
}
