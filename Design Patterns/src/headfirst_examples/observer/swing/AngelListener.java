package headfirst_examples.observer.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Don't do it, you would regret it");
    }
}
