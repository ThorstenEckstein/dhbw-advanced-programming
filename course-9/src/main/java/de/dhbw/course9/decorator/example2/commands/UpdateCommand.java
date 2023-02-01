package de.dhbw.course9.decorator.example2.commands;

public class UpdateCommand extends AbstractCommand {

	@Override
	public void execute() {
		System.out.println("  executing 'update' ...");
	}

}