package patterns.behavorial.command.command_regular.commands;

//Encapsulate methods in objects
//Functional interface

public interface Command {

	public void execute();
	public void undo();
}
