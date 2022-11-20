package de.juwi.pattern.template;

import java.util.List;

/**
 * Class providing a template method as defined by the "<b>template method
 * pattern</b>".
 * 
 * <pre>
 * 
 * +---------------------+
 * |  <<abstract>>       |
 * |  TemplateClass      |
 * |   +templateMethod() | --->  templateMethod() {
 * |   +abstract op1()   |         ...
 * |   +abstract op2()   |         op1();
 * +---------------------+         op2();
 *          /\                     ...
 *           | "extends"         }
 *           |
 * +---------------------+
 * |  ConcreteClass      |
 * |   +op1()            |
 * |   +op2()            |
 * +---------------------+
 * 
 * </pre>
 * 
 * @author Thorsten Eckstein
 * 
 */
public abstract class AbstractBusinessService {

	private Parser parser = new StringParser();

	// abstract: must be overridden by subclasses
	protected abstract String read();

	// abstract: must be overridden by subclasses
	protected abstract boolean write();

	/**
	 * This is the <b>template method</b>, containing 3 main steps read(),
	 * parse() and write(), but only parse() is a concrete implementation. read()
	 * and write() must be realized by subclassing this abstract service.
	 * 
	 * @throws Exception
	 */
	public void execute() throws Exception {
		// abstract step 1
		String data = read();
		// concrete: implementation of parsing process, step 2
		List<String> parsedData = parser.parse(data);
		// handle parse result
		if (parsedData != null && !parsedData.isEmpty()) {
			// abstract step 3
			write();
		} else {
			// error case 3: throw exception
			throw new Exception("Parsing data failed!");
		}
	}

	public String getInput() {
		return parser.getInput();
	}
	
	public String getOutput() {
		return parser.getOutput();
	}

}