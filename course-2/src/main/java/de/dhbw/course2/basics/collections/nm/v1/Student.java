package de.dhbw.course2.basics.collections.nm.v1;

import java.util.Set;

public class Student {

    Long id;

    String name;

    Set<Course> courses;

    public Student(String name) {
        this.name = name;
    }
}
