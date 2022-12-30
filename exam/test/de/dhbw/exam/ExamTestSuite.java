package de.dhbw.exam;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@SelectPackages({
        "de.dhbw.exam.course1",
        "de.dhbw.exam.course2",
        "de.dhbw.exam.course3",
        "de.dhbw.exam.course4"
})
@Suite
public class ExamTestSuite {
}
