package main.java.de.dhbw.course1.course1.model.train;

public abstract class BaseWagon implements Wagon {
    private int order;

    @Override
    public int getOrder() {
        return this.order;
    }

    @Override
    public void setOrder(int order) {
        this.order = order;
    }
}
