package headfirst_examples.observer.swing;

import javax.swing.*;

public class SwingObservableExample {
    JFrame frame;
    public static void main(String[] args) {
        new SwingObservableExample().go();
    }

    void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
//        button.addActionListener(new AngelListener());
//        button.addActionListener(new DevilListener());
        button.addActionListener(event -> System.out.println("Don't do it, you would regret it"));
        button.addActionListener(event -> System.out.println("Come on, do it!"));
    }
}
