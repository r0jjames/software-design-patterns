package creational_patterns.abstractFactory.material;

import creational_patterns.abstractFactory.Button;
import creational_patterns.abstractFactory.Textbox;
import creational_patterns.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public Textbox createTextbox() {
        return new MaterialTextBox();
    }
}
