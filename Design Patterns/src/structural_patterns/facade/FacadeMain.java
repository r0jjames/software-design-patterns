package structural_patterns.facade;

import structural_patterns.facade.solution.Demo;

public class FacadeMain {
    public static void main(String[] args) {
        // Example 1:
        var service = new NotificationService();
        service.send("Hello World", "Target");

        // Example 2:
        Demo.show();
    }
}
