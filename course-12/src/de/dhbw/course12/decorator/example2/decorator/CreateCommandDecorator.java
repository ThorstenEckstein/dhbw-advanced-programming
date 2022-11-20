package de.dhbw.course12.decorator.example2.decorator;

import de.dhbw.course12.decorator.example2.commands.Command;

public class CreateCommandDecorator extends CommandDecorator {

	public CreateCommandDecorator(Command command) {
		super(command);
	}

	@Override
	public void execute() {
		getRecorder().record(" >>> record 'create' execution!");
		super.execute();
	}

}