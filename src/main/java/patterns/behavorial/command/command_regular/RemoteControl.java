package patterns.behavorial.command.command_regular;

import java.util.ArrayList;
import java.util.Stack;

import patterns.behavorial.command.command_regular.commands.Command;

public class RemoteControl {
	
	ArrayList<Command> onCommands;
	ArrayList<Command> offCommands;
	
	Stack<Command> undoCommand;
	
//	for one command
//	Command undoCommand; 
	
	
	public RemoteControl() {
		onCommands = new ArrayList<Command>();
		offCommands = new ArrayList<Command>();
		undoCommand = new Stack<Command>();
	}
	
	public void setCommandOnButton(int buttonRowNumber, Command onCommand, Command offCommand) {
		onCommands.add(onCommand);
		offCommands.add(offCommand);
	}
	
	public void onButtonPushed(int buttonRowNumber) {
		onCommands.get(buttonRowNumber).execute();
		undoCommand.add(onCommands.get(buttonRowNumber));
	}
	
	public void offButtonPushed(int buttonRowNumber) {
		offCommands.get(buttonRowNumber).execute();
		undoCommand.add(offCommands.get(buttonRowNumber));
	}
	
	public void undoButtonPushed() {
		if(undoCommand.isEmpty()) {
			System.out.println("No commands to undo");
			return;
		}
		undoCommand.pop().undo();
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
