package creational_patterns.abstractFactory.solution;

public class Demo {
    public static void show() {
        var homePage = new HomePage();
        homePage.setGoal(new WeightLossFactory());
    }
}
