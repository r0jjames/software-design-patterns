package headfirst_examples.proxy.hello;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {
    public static void main(String[] args) {
        try {
            Hello hello = new HelloImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Hello", hello);
            System.out.println("Server is ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
