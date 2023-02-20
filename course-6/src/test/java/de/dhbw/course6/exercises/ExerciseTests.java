package de.dhbw.course6.exercises;

import main.java.de.dhbw.commons.Logger;
import org.junit.jupiter.api.Test;

public class ExerciseTests {

    private final Logger logger = new Logger(ExerciseTests.class);

    @Test
    public void ensureGoodJavadocDocumentation() {
        // given - poorly documented interface 'XmlAdapter'
        XmlAdapter adapter = new XmlAdapter() {
            @Override
            public String toXml(String plainText) {
                // add tags to text
                return "<tag>" + plainText + "</tag>";
            }

            @Override
            public String fromXml(String xml) throws Exception {
                // clear xml from tags
                return xml;
            }

            @Override
            public String adapt(String xmlOrPlainText) throws Exception {
                return null;
            }
        };

        // when - student has documented its public API

        // then - basic documentation is now far better ;-)
    }

}