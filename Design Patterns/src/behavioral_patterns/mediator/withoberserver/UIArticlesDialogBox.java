package behavioral_patterns.mediator.withoberserver;

// Concrete Mediator
public class UIArticlesDialogBox {

    private final UIButton savedButton;
    private final UIListBox articlesListBox;
    private final UITextBox titleTextBox;

    public UIArticlesDialogBox() {
        this.savedButton = new UIButton();
        this.articlesListBox = new UIListBox();
        this.titleTextBox = new UITextBox();
        this.subscribers();
    }

    public void subscribers() {
        this.articlesListBox.addHandler(this::articlesChanged);
        this.titleTextBox.addHandler(this::titleTextBoxChanged);
    }
    public void simulateUserInteraction()
    {
        articlesListBox.setSelection("Article 1");
//        titleTextBox.setContent("");
        System.out.println("Textbox: " + titleTextBox.getContent());
        System.out.println("Button: " + savedButton.isEnabled());
    }

    private void articlesChanged() {
        titleTextBox.setContent(articlesListBox.getSelection());
        savedButton.setEnabled(true);
    }
    private void titleTextBoxChanged() {
        String content = titleTextBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty());
        savedButton.setEnabled(!isEmpty);
    }
}
