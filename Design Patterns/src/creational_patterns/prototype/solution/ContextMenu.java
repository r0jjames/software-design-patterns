package creational_patterns.prototype.solution;

public class ContextMenu {
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        Component target = component.clone();
        target.render();
        timeline.add(target);
    }
}
