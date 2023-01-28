package de.dhbw.course6.study;

import main.java.de.dhbw.commons.Logger;
import org.junit.jupiter.api.Test;

public class MyStudyTests {

    private final Logger logger = new Logger(MyStudyTests.class);

    /* ----------------------------------------------------------------
     * Im test-package 'study' bzw. in dieser Testklasse können einfach
     * eigene Tests oder Experimente geschrieben werden.
     * ------------------------------------------------------------- */

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