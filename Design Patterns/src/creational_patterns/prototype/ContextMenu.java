package creational_patterns.prototype;

public class ContextMenu {
    public void duplicate(Component component) {
        Component newComponent = component.clone();
        // Add component to new Document
    }
}
