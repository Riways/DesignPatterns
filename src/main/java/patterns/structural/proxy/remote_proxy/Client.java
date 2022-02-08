package patterns.structural.proxy.remote_proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.concurrent.ThreadLocalRandom;

import patterns.structural.proxy.remote_proxy.gumball_machine.GumballMachineRemote;

public class Client {
	public void go() throws RemoteException {
		GumballMonitor mon = null;
		GumballMachineRemote service = null;
		try {
			service = (GumballMachineRemote) Naming
					.lookup("rmi://127.0.0.1/gumballMachineInterface");
			mon = new GumballMonitor(service);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		while(ThreadLocalRandom.current().nextInt(0, 1000000)!= 3213) {
			mon.report();
		}
		
	}

	public static void main(String[] args) throws RemoteException {
		new Client().go();
	}
}
