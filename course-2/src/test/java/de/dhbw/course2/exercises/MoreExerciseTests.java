package de.dhbw.course2.exercises;

import de.dhbw.course2.basics.collections.nm.v2.Course;
import de.dhbw.course2.basics.collections.nm.v2.Registration;
import de.dhbw.course2.basics.collections.nm.v2.Student;
import main.java.de.dhbw.commons.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MoreExerciseTests {

    private final Logger logger = new Logger(MoreExerciseTests.class);

    // "Übung 1a" -> siehe de.dhbw.course2.exercises.ExerciseTests.exercise1a()

    // "Übung 1b" -> siehe de.dhbw.course2.exercises.ExerciseTests.exercise1b()

    @Test
    @DisplayName("Übung 2a : 'char' Umwandlung")
    public void exercise2a() {
        // given
        char c = '1';

        // when

        // then
    }

    @Test
    @DisplayName("Übung 2b : 'int' Umwandlung")
    public void exercise2b() {
        // given
        int i = 127;

        // when

        // then
    }

    @Test
    @DisplayName("Übung 3: Klassenmodell")
    public void exercise3() {
        // given

        // when

        // then
    }

    @Test
    @DisplayName("Übung 4a: Listeneinträge summieren")
    public void exercise4a() {
        // given

        // when

        // then
    }

    @Test
    @DisplayName("Übung 4b: Map mit Key-Value-Paaren & Sortierung")
    public void exercise4b() {
        // given

        // when

        // then
    }

    @Test
    @DisplayName("Übung 5: Information Hiding durch getter & setter Methoden")
    public void manyToMany() {
        // given
        Course course = new Course();
        // Course Attribut 'id' setzen

        Student alex = new Student();
        // Student Attribut 'id' setzen

        Student dana = new Student();
        // Student Attribut 'id' setzen

        Registration reg1 = new Registration();
        Registration reg2 = new Registration();

        // when
        // je Registration: Attribute setzen durch "Holen" der zuvor gesetzten Werte aus Course & Student

        // then
        System.out.println(reg1);
        System.out.println(reg2);
    }


}