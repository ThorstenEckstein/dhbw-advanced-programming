package de.dhbw.course3.generics;

import de.dhbw.commons.Logger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class GenericsTest {

    private final Logger logger = new Logger(GenericsTest.class);

    @Test
    public void canUseGenericClassWithString() {
        // given
        Joiner<String> joiner = new Joiner<>();

        Collection<String> strings = new TreeSet<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");

        // when
        String joined = joiner.join(strings);

        // then
        assertEquals("[A, B, C]", joined);
    }

    @Test
    public void canUseGenericClassWithBooleans() {
        // given
        Joiner<Boolean> joiner = new Joiner<>();

        Collection<Boolean> booleans = new Vector<>();
        booleans.add(Boolean.TRUE);
        booleans.add(Boolean.FALSE);
        booleans.add(Boolean.TRUE);

        // when
        String joined = joiner.join(booleans);

        // then
        assertEquals("[true, false, true]", joined);
    }

    @Test
    public void canUseGenericClassWithObject() {
        // given
        Joiner<Person> joiner = new Joiner<>();

        Collection<Person> people = new ArrayList<>();
        people.add(new Person("Blake"));
        people.add(new Person("Eric"));
        people.add(new Person("Anna"));

        // when
        String joined = joiner.join(people);

        // then
        assertEquals("[Blake, Eric, Anna]", joined);
    }

    @Test
    public void canUseGenericMethod() {
        // given
        Printer printer = new Printer();

        // when
        String output1 = printer.print("String");
        String output2 = printer.print(1827.08);
        String output3 = printer.print(new Person("Ronaldo"));

        // then
        assertEquals("String", output1);
        assertEquals("1827.08", output2);
        assertEquals("Ronaldo", output3);
    }

}