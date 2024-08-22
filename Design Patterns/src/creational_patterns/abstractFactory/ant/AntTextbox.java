package creational_patterns.abstractFactory.ant;

import creational_patterns.abstractFactory.Textbox;

public class AntTextbox implements Textbox {
    @Override
    public void render() {
        System.out.println("Render: Ant Textbox");
    }
}
