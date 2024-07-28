package behavioral_patterns.mediator.withoberserver;


import java.util.ArrayList;
import java.util.List;

public class UIController {
    List<EventHandler> handlers = new ArrayList<>();

    public void addHandler(EventHandler handler) {
        handlers.add(handler);
    }

    public void notifyHandlers() {
        for (var handler : handlers) {
            handler.handle();
        }
    }
}
