package headfirst_examples.composite.menu;

public class Waitress {
    MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void print() {
        menuComponent.print();
    }
}
