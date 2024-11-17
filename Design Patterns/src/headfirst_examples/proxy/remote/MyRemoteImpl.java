package headfirst_examples.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException {

    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey!";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.bind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
