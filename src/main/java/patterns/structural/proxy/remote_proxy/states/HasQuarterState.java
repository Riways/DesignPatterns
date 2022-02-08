package patterns.structural.proxy.remote_proxy.states;

import patterns.structural.proxy.remote_proxy.gumball_machine.GumballMachine;

public class HasQuarterState implements State {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8434079665435016888L;
	
	transient GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can’t insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		 gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());

	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
