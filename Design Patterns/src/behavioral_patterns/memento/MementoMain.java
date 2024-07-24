package behavioral_patterns.memento;

import behavioral_patterns.memento.solutions.Demo;

public class MementoMain {
    public static void main(String[] args) {
        // Document Problem
        Demo.show();
    }
    public static void editorShow() {
        var editor = new Editor();
        var history = new History();
        editor.setContent("A");
        history.push(editor.createState());
        editor.setContent("B");
        history.push(editor.createState());
        editor.setContent("C");
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}
