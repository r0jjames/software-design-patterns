package behavioral_patterns.memento;

import behavioral_patterns.memento.solutions.MementoDemo;

public class MementoMain {
    public static void main(String[] args) {
        // Exercise 1: Document Problem
        MementoDemo.show();

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
