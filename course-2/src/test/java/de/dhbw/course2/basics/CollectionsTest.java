package de.dhbw.course2.basics;

import main.java.de.dhbw.commons.Logger;
import de.dhbw.course2.basics.collections.nm.v1.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsTest {

    private final Logger logger = new Logger(CollectionsTest.class);

    /**
     * Exercise: Write tests that use other types from the "collections" framework, like:
     * - Collection
     * - Set
     * - Map
     *
     * Explain differences and name the characteristics!
     */

    @Test
    public void canAddElementsToList() {
        // given
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("Michaela");
        Student s2 = new Student("Alexander");

        // when
        students.add(s1);
        students.add(s2);

        // then
        assertEquals(2, students.size());
    }

}