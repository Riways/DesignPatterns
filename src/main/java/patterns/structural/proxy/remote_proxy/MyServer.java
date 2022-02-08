package patterns.structural.proxy.remote_proxy;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import patterns.structural.proxy.remote_proxy.gumball_machine.GumballMachine;
import patterns.structural.proxy.remote_proxy.gumball_machine.GumballMachineRemote;


public class MyServer {

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		
		GumballMachineRemote gumballMachineInterface1= new GumballMachine("Lipetsk", 100);
		GumballMachineRemote gumballMachineInterface2= new GumballMachine("Grodno", 200);
		GumballMachineRemote gumballMachineInterface3= new GumballMachine("Paris", 300);
		
		Registry localReg = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
		
		localReg.bind("gumballMachineInterface1", gumballMachineInterface1);
		localReg.bind("gumballMachineInterface2", gumballMachineInterface2);
		localReg.bind("gumballMachineInterface3", gumballMachineInterface3);
		
		System.out.println("Remote server runs");
	}
}
