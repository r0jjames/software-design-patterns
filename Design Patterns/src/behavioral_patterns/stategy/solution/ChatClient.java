package behavioral_patterns.stategy.solution;

/*
In the Exercises project, look at the strategy/ChatClient class.
This class uses an encryption algorithm to encrypt a message before sending it out.
What are the problems in this implementation?
Refactor the code using the strategy pattern. What are the benefits of the new implementation?
 */
public class ChatClient {
    private final Encryption encryption;

    public ChatClient(Encryption encryptionAlgorithm) {
        if(encryptionAlgorithm == null) {
            throw new UnsupportedOperationException("Unsupported encryption algorithm");
        }
        this.encryption = encryptionAlgorithm;
    }

    public void send(String message) {
        encryption.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
