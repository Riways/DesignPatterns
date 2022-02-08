package patterns.behavorial.command.commands_on_lambdas;

import java.util.ArrayList;


public class RemoteControl {
	
	ArrayList<Command> onCommands;
	ArrayList<Command> offCommands;
	
	public RemoteControl() {
		onCommands = new ArrayList<Command>();
		offCommands = new ArrayList<Command>();
		
	}
	
	public void setCommandOnButton(int buttonRowNumber, Command onCommand, Command offCommand) {
		onCommands.add(onCommand);
		offCommands.add(offCommand);
	}
	
	public void onButtonPushed(int buttonRowNumber) {
		onCommands.get(buttonRowNumber).execute();
	}
	
	public void offButtonPushed(int buttonRowNumber) {
		offCommands.get(buttonRowNumber).execute();
	}

	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("\n----------Remote Control----------\n");
		for(int i = 0; i < onCommands.size(); i++) {
			strBuff.append(" Button row " + (i+1) +": " +onCommands.get(i).getClass().getName()+", "+ 
					offCommands.get(i).getClass().getName() + '\n');
		}
		return strBuff.toString();
	}

	
}
