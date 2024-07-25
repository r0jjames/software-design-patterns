package behavioral_patterns.stategy;

import behavioral_patterns.stategy.solution.AESEncryption;
import behavioral_patterns.stategy.solution.ChatClient;
import behavioral_patterns.stategy.solution.DESEncryption;

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
