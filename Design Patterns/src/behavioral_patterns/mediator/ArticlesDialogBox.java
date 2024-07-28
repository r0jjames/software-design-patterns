package behavioral_patterns.mediator;

// Concrete Mediator
public class ArticlesDialogBox extends DialogBox {

    private final Button savedButton;
    private final ListBox articlesListBox;
    private final TextBox titleTextBox;

    public ArticlesDialogBox() {
        this.savedButton = new Button(this);
        this.articlesListBox = new ListBox(this);
        this.titleTextBox = new TextBox(this);
    }
    public void simulateUserInteraction()
    {
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        System.out.println("Textbox: " + titleTextBox.getContent());
        System.out.println("Button: " + savedButton.isEnabled());
    }

    @Override
    void changed(UIControl ui) {
        if (ui == articlesListBox)
            articlesChanged();
        if (ui == titleTextBox)
            titleTextBoxChanged();
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
