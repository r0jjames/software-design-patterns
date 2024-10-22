package behavioral_patterns.stategy;

import behavioral_patterns.stategy.example_1.BlackAndWhiteFilter;
import behavioral_patterns.stategy.example_1.ImageStorage;
import behavioral_patterns.stategy.example_1.JpegCompressor;
import behavioral_patterns.stategy.example_2.AESEncryption;
import behavioral_patterns.stategy.example_2.ChatClient;
import behavioral_patterns.stategy.example_2.DESEncryption;

public class StrategyMain {
    public static void main(String[] args) {

        ChatClient chatClient = new ChatClient(new AESEncryption());
        chatClient.send("Hello");

        ChatClient chatClient2 = new ChatClient(new DESEncryption());
        chatClient2.send("Hello");

        ImageStorage storage = new ImageStorage();
        storage.store("file", new JpegCompressor(), new BlackAndWhiteFilter());

    }
}
