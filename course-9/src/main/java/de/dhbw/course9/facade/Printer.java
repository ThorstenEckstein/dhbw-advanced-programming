package de.dhbw.course9.facade;

import de.dhbw.course9.model.Entity;
import de.dhbw.course9.template.AbstractPrintStrategy;
import de.dhbw.course9.strategy.PrintContext;
import de.dhbw.course9.strategy.PrintStrategy;

/**
 * This is a simple realization of the pattern "Facade".
 * It just wraps access to an entire subsystem, here the classes and functionality of the module "print".
 */
public class Printer {

    private PrintStrategy printStrategy;

    private PrintContext context = new PrintContext();

    public Printer(PrintStrategy printStrategy){
        this.printStrategy = printStrategy;
    }

    public Printer caller(String value) {
        context.add("caller", value);
        return this;
    }

    public Printer entity(Entity value) {
        context.add("entity", value);
        return this;
    }

    public Printer item(String key, Object value) {
        context.add(key, value);
        return this;
    }

    public void print() {
        if (printStrategy != null) {
            ((AbstractPrintStrategy)printStrategy).templatePrint(context);
        }
    }

}
