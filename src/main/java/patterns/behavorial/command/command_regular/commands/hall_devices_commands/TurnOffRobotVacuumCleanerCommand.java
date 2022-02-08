package patterns.behavorial.command.command_regular.commands.hall_devices_commands;

import patterns.behavorial.command.command_regular.commands.Command;
import patterns.behavorial.command.command_regular.devices_to_control.HallDevices;

public class TurnOffRobotVacuumCleanerCommand implements Command {

	HallDevices hallDevices;
	
	
	public TurnOffRobotVacuumCleanerCommand(HallDevices hallDevices) {
		super();
		this.hallDevices = hallDevices;
	}



	@Override
	public void execute() {
		hallDevices.turnOffRobotVacuumCleaner();
	}
	
	@Override
	public void undo() {
		hallDevices.turnOnRobotVacuumCleaner();
	}

}
