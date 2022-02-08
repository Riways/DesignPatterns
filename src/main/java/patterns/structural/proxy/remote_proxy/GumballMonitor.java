package patterns.structural.proxy.remote_proxy;

import java.rmi.RemoteException;

import patterns.structural.proxy.remote_proxy.gumball_machine.GumballMachineRemote;

public class GumballMonitor {
	GumballMachineRemote machine;

	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}

	public void report() throws RemoteException {
		System.out.println("Gumball Machine: " + machine.getLocation());
		System.out.println("Current inventory: " + machine.getCount() + " gumballs");
		System.out.println("Current state: " + machine.getState());
	}
}
