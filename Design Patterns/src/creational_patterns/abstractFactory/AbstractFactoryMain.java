package creational_patterns.abstractFactory;

import creational_patterns.abstractFactory.ant.AntWidgetFactory;
import creational_patterns.abstractFactory.app.ContactForm;
import creational_patterns.abstractFactory.material.MaterialWidgetFactory;
import creational_patterns.abstractFactory.solution.Demo;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Demo.show();
    }

    public static void example() {
        ContactForm form = new ContactForm();
        form.render(new AntWidgetFactory());
        form.render(new MaterialWidgetFactory());
    }
}
