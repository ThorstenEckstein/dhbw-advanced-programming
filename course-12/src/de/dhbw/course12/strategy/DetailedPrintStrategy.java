package de.dhbw.course12.strategy;

import de.dhbw.course12.demo.model.Entity;
import de.dhbw.course12.template.AbstractPrintStrategy;

public class DetailedPrintStrategy extends AbstractPrintStrategy {

    @Override
    public void print(PrintContext context) {
        Entity entity = (Entity)context.get("entity");
        System.out.printf("ID=%s (%s)", entity.getId(), context.getItems());
    }

}