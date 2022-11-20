package de.dhbw.course12.printsupport.model;

import de.dhbw.course12.printsupport.print.PrintException;
import de.dhbw.course12.printsupport.print.Printer;
import de.dhbw.course12.printsupport.print.PrinterFactory;
import de.dhbw.course12.printsupport.print.PrinterFactory.PrinterType;

public abstract class AbstractObject {
	
	private PrinterType printerType;
	
	private boolean printingEnabled = true; // Config.getIsEnabled ..
	
	public PrinterType getPrinterType() {
		return printerType;
	}
	
	public void setPrinterType(PrinterType printerType) {
		this.printerType = printerType;
	}
	
	public String toString() {
		String ret = null;
		if (printingEnabled) {
			Printer printer = PrinterFactory.newPrinter(printerType);
			try {
				ret = printer.print(this);
			} catch (PrintException e) {
				ret = e.getMessage();
			}
		}
		return ret;
	}

}