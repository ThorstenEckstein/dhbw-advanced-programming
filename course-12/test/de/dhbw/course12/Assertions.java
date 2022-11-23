package de.dhbw.course12;

public class Assertions {

    public static void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            String message = String.format("[Assertion Failure] Expected '%s', but was '%s'", expected, actual);
            System.err.println(message);
        }
    }

    public static void assertEquals(String expected, String actual, String actualDefault) {
        if (!expected.equals(actual)) {
            String message = String.format(
                    "[Assertion Failure] Expected '%s', but was '%s' (default='%s')", expected, actual, actualDefault);
            System.err.println(message);
        }
    }

    public static void assertEquals(int expected, int actual) {
        if (expected != actual) {
            String message = String.format("[Assertion Failure] Expected '%s', but was '%s'", expected, actual);
            System.err.println(message);
        }
    }

    public static void assertTrue(boolean actual) {
        if (actual == false) {
            String message = String.format("[Assertion Failure] Expected '%s', but was '%s'", true, actual);
            System.err.println(message);
        }
    }

}
