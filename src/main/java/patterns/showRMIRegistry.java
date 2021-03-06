package patterns;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

//example args: localhost 1099

public class showRMIRegistry {
	public static void main(String... args) throws RemoteException {
		String host = args[0];
		int port = Integer.parseInt(args[1]);
		Registry registry = LocateRegistry.getRegistry(host, port);
		for (String name : registry.list()) {
			System.out.println(name);
		}
	}
}
