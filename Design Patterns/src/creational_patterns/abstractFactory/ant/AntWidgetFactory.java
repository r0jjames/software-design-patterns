package creational_patterns.abstractFactory.ant;

import creational_patterns.abstractFactory.Button;
import creational_patterns.abstractFactory.Textbox;
import creational_patterns.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public Textbox createTextbox() {
        return new AntTextbox();
    }
}
