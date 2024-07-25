package behavioral_patterns.stategy.solution;

public class AESEncryption implements Encryption{
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting " +  message + " using AES");
    }
}
