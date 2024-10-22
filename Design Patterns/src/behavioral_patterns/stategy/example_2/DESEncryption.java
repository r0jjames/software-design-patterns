package behavioral_patterns.stategy.example_2;

public class DESEncryption implements Encryption{
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting " +  message + " using DES");
    }
}
