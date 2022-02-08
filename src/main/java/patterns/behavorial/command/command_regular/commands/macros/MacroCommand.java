package patterns.behavorial.command.command_regular.commands.macros;

import java.util.ArrayList;
import java.util.Collections;

import patterns.behavorial.command.command_regular.commands.Command;

public class MacroCommand implements Command{
	
	ArrayList<Command> commands;

	
	public MacroCommand(ArrayList<Command> commands) {
		super();
		this.commands = commands;
	}

	@Override
	public void execute() {
		for(Command cmnd: commands) {
			cmnd.execute();
		}
	}

	@Override
	public void undo() {
		Collections.reverse(commands);
		for(Command cmnd: commands) {
			cmnd.execute();
		}
		Collections.reverse(commands);
	}

	
}
