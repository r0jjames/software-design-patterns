package headfirst_examples.templatemethod;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {

    }

    private void pourInCup() {

    }

    //hook


    abstract void brew();

    abstract void addCondiments();
}
