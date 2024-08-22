package creational_patterns.abstractFactory.ant;

import creational_patterns.abstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Render: Ant Button");
    }
}
