package de.dhbw.course9.strategy;

import de.dhbw.course9.model.Entity;
import de.dhbw.course9.template.AbstractPrintStrategy;

public class SimplePrintStrategy extends AbstractPrintStrategy {

    @Override
    public void print(PrintContext context) {
        Entity entity = (Entity)context.get("entity");
        System.out.printf("ID=%s", entity.getId());
    }

}