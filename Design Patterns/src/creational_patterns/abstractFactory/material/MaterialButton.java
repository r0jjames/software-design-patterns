package creational_patterns.abstractFactory.material;

import creational_patterns.abstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Render: Material Button");
    }
}
