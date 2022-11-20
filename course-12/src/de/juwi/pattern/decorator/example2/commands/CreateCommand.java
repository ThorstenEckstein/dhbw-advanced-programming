package de.juwi.pattern.decorator.example2.commands;

public class CreateCommand extends AbstractCommand {

	@Override
	public void execute() {
		System.out.println("  executing create ...");
	}

}
