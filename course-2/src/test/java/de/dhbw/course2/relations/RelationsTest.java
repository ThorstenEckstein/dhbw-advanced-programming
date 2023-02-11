package de.dhbw.course2.relations;

import de.dhbw.course2.basics.collections.n.*;
import main.java.de.dhbw.commons.Logger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class RelationsTest {

    private final Logger logger = new Logger(RelationsTest.class);

    @Test
    public void oneToOne() {
        // given
        Person person = new Person("Julian", "sjw73h73hdkf8");
        Passport passport = person.getPassport();

        // when
        boolean deleted = delete(person);

        // then
        assertTrue(deleted);
        assertNull(person.getPassport());
    }

    private boolean delete(Person person) {
        person.deletePassport();
        person = null;
        return true;
    }

    @Test
    public void oneToMany1() {
        // given
        Train1 train1 = new Train1();

        // when
        train1.addWagon(new Wagon1());
        train1.addWagon(new Wagon1());

        // then
        assertEquals(2, train1.wagons.size());
    }

    @Test
    public void oneToMany2() {
        // given
        Train2 train2 = new Train2();

        Wagon2 wagon2a = new Wagon2();
        Wagon2 wagon2b = new Wagon2();

        // Woher weiß der Wagon nun, zu welchem Zug er gehört?
        // Was muss gemacht werden, um dies sicherzustellen?

        // when
        train2.addWagon(wagon2a);
        train2.addWagon(wagon2b);

        // then
        assertEquals(2, train2.wagons.size());
    }

}