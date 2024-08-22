package creational_patterns.abstractFactory.material;

import creational_patterns.abstractFactory.Textbox;

public class MaterialTextBox implements Textbox {
    @Override
    public void render() {
        System.out.println("Render: MaterialTextbox");
    }
}
