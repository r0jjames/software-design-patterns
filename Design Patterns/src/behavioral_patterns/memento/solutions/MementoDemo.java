package behavioral_patterns.memento.solutions;
/*
Exercise
In the Exercises project, look at the code in the memento/Document
class. This class represents a document in a word processor like MS
Word or Apple Pages.
Our Document class has three attributes:
- content
- fontName
- fontSize
We should allow the user to undo the changes to any of these
attributes. In the future, we may add additional attributes in this
class and these attributes should also be undoable.
Implement the undo feature using the memento pattern.
 */

public class MementoDemo {
  public static void show() {
    var document = new Document();
    var history = new History();

    document.setContent("Hello");
    history.push(document.createMemento());

    document.setFontName("Font 1");
    history.push(document.createMemento());

    document.setFontSize(10);

    System.out.println(document);

    document.restore(history.pop());
    System.out.println(document);

    document.restore(history.pop());
    System.out.println(document);
  }
}
