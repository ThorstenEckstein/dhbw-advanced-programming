package de.juwi.pattern.printsupport.print;

public abstract class AbstractPrinter implements Printer {
	private int    indentionLevel   = 1;
	private String indentionChar    = ".";
	private String currentIndention = null;
	private String newLine          = "\n";
	AbstractPrinter() {
		setCurrentIndention();
	}
	protected void indent()   { 
		indent(1); 
	}
	protected void unindent() { 
		unindent(1); 
	}
	protected void indent(int i)   { 
		indentionLevel += i;
		setCurrentIndention();
	}
	protected void unindent(int i) { 
		indentionLevel -= i;
		setCurrentIndention();
	}
	protected String getIndention() {
		return currentIndention;
	}
	private void setCurrentIndention() {
		StringBuffer sb = new StringBuffer();
		sb.append(newLine);
		for (int i=0; i<indentionLevel; i++) { sb.append(indentionChar); }
		currentIndention = sb.toString();
	}
	protected String toFormattedName(Object o) {
		return "[" + o.getClass().getName() + "]";
	}
}
