package creational_patterns.factory.sharp;

import creational_patterns.factory.matcha.Controller;
import creational_patterns.factory.matcha.ViewEngine;

public class SharpController extends Controller {

    @Override
    public ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
