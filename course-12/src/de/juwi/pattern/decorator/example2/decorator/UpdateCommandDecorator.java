package de.juwi.pattern.decorator.example2.decorator;

import de.juwi.pattern.decorator.example2.commands.Command;

public class UpdateCommandDecorator extends CommandDecorator {

	public UpdateCommandDecorator(Command command) {
		super(command);
	}

	@Override
	public void execute() {
		getRecorder().record(" >>> record 'update' execution!");
		super.execute();
	}

}