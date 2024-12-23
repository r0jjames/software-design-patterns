package structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;
// Composite
public class Group implements Component{
    private final List<Component> components = new ArrayList<>();

    public void add(Component component) {
        this.components.add(component);
    }
    @Override
    public void render() {
        for (var component : components) {
            component.render();
        }
    }

    @Override
    public void move() {
        for (var component : components) {
            component.move();
        }
    }
}
