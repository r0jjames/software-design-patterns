package headfirst_examples.proxy.hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {

    protected HelloImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello, world";
    }
}
