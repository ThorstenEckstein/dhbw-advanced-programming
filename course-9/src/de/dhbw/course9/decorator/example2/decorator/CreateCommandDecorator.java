package de.dhbw.course9.decorator.example2.decorator;

import de.dhbw.course9.decorator.example2.commands.Command;

public class CreateCommandDecorator extends CommandDecorator {

	public CreateCommandDecorator(Command command) {
		super(command);
	}

	@Override
	public void execute() {
		getRecorder().record("  recording 'create' execution!");
		super.execute();
	}

}