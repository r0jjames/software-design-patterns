package creational_patterns.abstractFactory.app;

import creational_patterns.abstractFactory.WidgetFactory;
import creational_patterns.abstractFactory.ant.AntButton;
import creational_patterns.abstractFactory.ant.AntTextbox;
import creational_patterns.abstractFactory.material.MaterialButton;
import creational_patterns.abstractFactory.material.MaterialTextBox;

public class ContactForm {

    public void render(WidgetFactory factory) {
      factory.createButton().render();
      factory.createTextbox().render();
    }
}
