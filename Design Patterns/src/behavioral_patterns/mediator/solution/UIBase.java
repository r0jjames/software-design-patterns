package behavioral_patterns.mediator.solution;

import java.util.ArrayList;
import java.util.List;

public class UIBase {
    private List<UIEventHandler> handlers = new ArrayList<>();
    void addUIEventHandlers(UIEventHandler eventHandler) {
        this.handlers.add(eventHandler);
    }

    void notifyEventHandlers() {
        for (var handler: handlers) {
            handler.handle();
        }
    }
}
