package de.dhbw.course12;

public class TestSuite {
    public void run() throws Exception {
        PatternTest test = new PatternTest();

        test.architecture_filterV1();

        test.behavior_adapter();
        test.behavior_observer();
        test.behavior_strategy_facade_templateMethod();

        test.structure_decorator_example1();
        test.structure_decorator_example2();
        test.structure_proxy();
    }
}
