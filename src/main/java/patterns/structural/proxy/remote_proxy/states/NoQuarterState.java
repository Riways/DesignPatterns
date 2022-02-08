package patterns.structural.proxy.remote_proxy.states;

import patterns.structural.proxy.remote_proxy.gumball_machine.GumballMachine;

public class NoQuarterState implements State {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8924581445954926094L;
	
	transient GumballMachine gumballMachine;
	
	
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven’t inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there’s no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}

}
