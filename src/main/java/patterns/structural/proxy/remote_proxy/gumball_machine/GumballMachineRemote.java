package patterns.structural.proxy.remote_proxy.gumball_machine;

import java.rmi.Remote;
import java.rmi.RemoteException;

import patterns.structural.proxy.remote_proxy.states.State;

public interface GumballMachineRemote extends Remote {
	
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
	public int getCount() throws RemoteException;

}
