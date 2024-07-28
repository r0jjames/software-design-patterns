package behavioral_patterns.mediator.solution;

public class SignUpDialogBox {
    private UITextbox username = new UITextbox();
    private UITextbox password = new UITextbox();
    private UICheckbox agreementTerms = new UICheckbox();
    private UIButton signup = new UIButton();

    public SignUpDialogBox() {
        this.username.addUIEventHandlers(this::controlChanged);
        this.password.addUIEventHandlers(this::controlChanged);
        this.agreementTerms.addUIEventHandlers(this::controlChanged);
    }

    public void controlChanged() {
        this.signup.setEnabled(isFormValid());
    }

    public boolean isFormValid() {
        return this.agreementTerms.isChecked() && !this.username.getContent().isEmpty() && !this.password.getContent().isEmpty();
    }

    public void simulateUserInteraction() {
        // Initially the button should be disabled
        System.out.println("Initially: " + this.signup.isEnabled());

        // The user enters their username, the button is still disabled
        this.username.setContent("username");
        System.out.println("After setting the username: " + signup.isEnabled());

        // The user enters their password, the button is still disabled
        password.setContent("password");
        System.out.println("After setting the password: " + signup.isEnabled());

        // The agrees to the terms, the button becomes enabled
        agreementTerms.setChecked(true);
        System.out.println("After agreeing to terms: " + signup.isEnabled());

        // The user removes the password, the button becomes disabled
        password.setContent("");
        System.out.println("After removing the password: " + signup.isEnabled());

        // The user enters the password again, the button becomes enabled
        password.setContent("password");
        System.out.println("After re-setting the password: " + signup.isEnabled());
    }
}

