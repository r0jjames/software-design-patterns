package creational_patterns.factory.matcha;

import java.util.Map;

public interface ViewEngine {
    public String render(String viewName, Map<String, Object> context);
}
