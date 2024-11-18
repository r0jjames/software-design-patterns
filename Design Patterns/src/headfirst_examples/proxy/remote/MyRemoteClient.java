package headfirst_examples.proxy.remote;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String response = service.sayHello();
            System.out.println("Response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
