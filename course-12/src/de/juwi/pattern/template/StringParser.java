package de.juwi.pattern.template;

import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

public class StringParser implements Parser {

	private String input;
	private List<String> output;
	
	@Override
	public List<String> parse(String data) {
		this.input = data;
		this.output = new Vector<String>();
		StringTokenizer st = new StringTokenizer(data, "\\.");
		while (st.hasMoreTokens()) {
			output.add(st.nextToken());
		}
		return output;
	}

	@Override
	public String getOutput() {
		return output.toString();
	}

	@Override
	public String getInput() {
		return input;
	}

}
