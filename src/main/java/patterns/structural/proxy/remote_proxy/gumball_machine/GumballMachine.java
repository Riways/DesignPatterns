package patterns.structural.proxy.remote_proxy.gumball_machine;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import patterns.structural.proxy.remote_proxy.states.HasQuarterState;
import patterns.structural.proxy.remote_proxy.states.NoQuarterState;
import patterns.structural.proxy.remote_proxy.states.SoldOutState;
import patterns.structural.proxy.remote_proxy.states.SoldState;
import patterns.structural.proxy.remote_proxy.states.State;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5248128461473444359L;
	
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;

	private String location;
	
	private State state;

	private int count = 0;

	public GumballMachine(String location, int count)  throws RemoteException  {
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.count = count;
		this.location = location;
		if (count > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public String getLocation() {
		return location;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getState() {
		return state;
	}

}
