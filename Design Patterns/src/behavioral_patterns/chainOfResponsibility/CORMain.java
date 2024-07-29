package behavioral_patterns.chainOfResponsibility;

import behavioral_patterns.chainOfResponsibility.solution.DataReaderFactory;

public class CORMain {
    public static void main(String[] args) {
        // Example 1:
        // Auth -> Logger -> Compressor
        var encrypt = new Encryptor(null);
        var compressor = new Compressor(encrypt);
        var logger = new Logger(compressor);
        var auth = new Authenticator(logger);

        var webServer = new WebServer(auth);
//        webServer.handle(new HttpRequest("admin", "1234"));

        // Example 2:
        var reader = DataReaderFactory.getDataReaderChain();
        reader.read("data.xls");
        reader.read("data.numbers");
        reader.read("data.qbw");
        reader.read("data.jpg");

    }
}
