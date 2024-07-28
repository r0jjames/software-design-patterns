package behavioral_patterns.mediator;

import behavioral_patterns.mediator.solution.SignUpDialogBox;
import behavioral_patterns.mediator.withoberserver.UIArticlesDialogBox;

public class MediatorMain {
    public static void main(String[] args) {
        // Example 1:

        var articleDialogBox = new ArticlesDialogBox();
//        articleDialogBox.simulateUserInteraction();

        // Example 2:
        var uiArticleDialogBox = new UIArticlesDialogBox();
//        uiArticleDialogBox.simulateUserInteraction();

        // Example 3:
        var signUpDialogBox = new SignUpDialogBox();
        signUpDialogBox.simulateUserInteraction();
    }
}
