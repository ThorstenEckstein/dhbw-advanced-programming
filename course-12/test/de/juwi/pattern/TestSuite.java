package de.juwi.pattern;

public class TestSuite {
    public void run() throws Exception {
        PatternTest test = new PatternTest();
        test.general_printSupport();
        test.behavior_adapter();
        test.behavior_observer();
        test.behavior_templateMethod();
        test.structure_decorator_example1();
        test.structure_decorator_example2();
        test.structure_proxy();
    }
}
