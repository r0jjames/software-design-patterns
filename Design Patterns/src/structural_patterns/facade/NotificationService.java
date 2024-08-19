package structural_patterns.facade;

public class NotificationService {

    public void send(String message, String target) {
        var server = new NotificationServer();
        var connect = server.connect("ip");
        var authToken = server.authenticate("appID", "key");
        server.send(authToken, new Message(message), target);
        connect.disconnect();
    }
}
