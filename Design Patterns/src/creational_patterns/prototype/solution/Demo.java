package creational_patterns.prototype.solution;

public class Demo {
    public static void show() {
        var timeline = new Timeline();
        var text = new Text("Hello");
        var audio = new Audio();
        timeline.add(text);

        var menu = new ContextMenu(timeline);
        menu.duplicate(text);
        menu.duplicate(audio);
    }
}
