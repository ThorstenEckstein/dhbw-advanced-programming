package de.dhbw.course12;

import java.util.List;
import java.util.Vector;

public class Tracer {

	private List<String> trace = new Vector<String>();

	public List<String> getTrace() {
		return trace;
	}

	public void setTrace(List<String> trace) {
		this.trace = trace;
	}
	
	public void add(String traceItem) {
		trace.add(traceItem);
	}

	public String get(int stepIndex) {
		return trace.get(stepIndex);
	}

	public String dump() {
		StringBuilder sb = new StringBuilder();
		
		for (int stepIndex = 0; stepIndex < trace.size(); stepIndex++) {
			String traceItem = trace.get(stepIndex);
			sb.append("(")
			  .append(stepIndex+1)
			  .append(") ")
			  .append(traceItem)
			  .append("\n");
		}
		
		for (String traceItem : trace) {
			sb.append(traceItem).append("\n");
		}
		return sb.toString();
	}
	
}