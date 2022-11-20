package de.juwi.pattern.printsupport.print;

public class PrinterFactory {

	public enum PrinterType { STRING, XML; }
	
	public static Printer newPrinter(PrinterType printerType) {
		switch (printerType) {
			case STRING:
				return new StringPrinter();
			case XML:
				return new XmlPrinter();
			default: 
				throw new UnsupportedOperationException(
						"Invalid Printer Type: " + printerType);
		}
	}
	
}