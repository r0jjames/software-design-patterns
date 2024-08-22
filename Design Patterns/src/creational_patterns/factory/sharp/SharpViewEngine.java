package creational_patterns.factory.sharp;

import creational_patterns.factory.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "Rendered by Sharp";
    }
}
