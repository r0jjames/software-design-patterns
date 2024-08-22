package creational_patterns.factory.matcha;

import java.util.Map;

public class Controller {

    public void render(String viewName, Map<String, Object> context) {
        var view = createViewEngine();
        var html = view.render(viewName, context);
        System.out.println(html);
    }

    // Option 1:
    public ViewEngine createViewEngine() {
        return new MatchaViewEngine();
    }
    // Option 2:
//    public abstract void createViewEngine();
}
