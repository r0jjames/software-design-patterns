package headfirst_examples.templatemethod.barista;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dipping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
