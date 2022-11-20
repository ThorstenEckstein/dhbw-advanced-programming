package de.juwi.pattern.template;

import java.util.List;

public interface Parser {

	public List<String> parse(String data);

	public String getInput();

	public String getOutput();

}