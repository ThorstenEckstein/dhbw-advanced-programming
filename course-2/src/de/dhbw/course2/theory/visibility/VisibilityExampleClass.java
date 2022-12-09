package de.dhbw.course2.theory.visibility;

public class VisibilityExampleClass {

    // what is the modifier here?

    // default, package-private = accessible in this package (all classes in "visibility")
    String fieldA;

    // public = accessible from "everywhere"
    public String fieldB;

    // protected = accessible in this class and from subclasses
    protected String fieldC;

    // provate = accessible only in this class
    private String fieldD;

}