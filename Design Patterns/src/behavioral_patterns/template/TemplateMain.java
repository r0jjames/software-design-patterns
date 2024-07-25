package behavioral_patterns.template;

import behavioral_patterns.template.solution.ChatWindow;

public class TemplateMain {
    public static void main(String[] args) {
        var window = new ChatWindow();
        window.close();

        var task = new TransferMoneyTask();
        task.execute();
    }
}
