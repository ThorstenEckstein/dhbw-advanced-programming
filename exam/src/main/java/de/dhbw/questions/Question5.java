package de.dhbw.questions;

public class Question5 {

    public interface Observable {
        default String whoAmI() { return "I'm a default method within an interface"; }
    }
    public interface Train extends Observable {}
    public abstract class AbstractTrain implements Train {}
    public class LongDistanceTrain extends AbstractTrain {}

}