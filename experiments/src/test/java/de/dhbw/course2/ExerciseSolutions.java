package de.dhbw.course2;

import main.java.de.dhbw.commons.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExerciseSolutions {

    private final Logger logger = new Logger(ExerciseSolutions.class);

    @Test
    @DisplayName("Lösung zu Übung 1 / Exercise 1")
    public void canCheckIdenticalNews() {
        // given
        News ardNews = new News("Die Antwort auf alles ist 42!");
        News rtlNews = new News("Die Antwort auf alles ist 42!");

        // when
        // Object are equal? -> no, different instances!
        // hashCode() on different instances shall always return different int results
        boolean newsAreSameInstances = ardNews == rtlNews;
        boolean newsAreLogicallyEqual = ardNews.hashCode() == rtlNews.hashCode();

        // then
        assertFalse(newsAreSameInstances);
        assertTrue(newsAreLogicallyEqual);

        // when - now both vars point to the same (!) instance
        rtlNews = ardNews;
        newsAreSameInstances = ardNews == rtlNews;

        // then
        assertTrue(newsAreSameInstances);
    }

    @Test
    public void canCheckEqualNews() {
        // given
        News ardNews = new News("In Mannheim ist heute gutes Wetter!");
        News rtlNews = new News("In Mannheim ist heute schlechtes Wetter!");

        // when
        boolean newsAreEqual = ardNews.equals(rtlNews);

        // then
        assertFalse(newsAreEqual);
    }

    @Test
    public void canUseSortedMapWithNaturalOrder() {
        // given
        // TreeMap = ascending key order
        Map<String, String> map = new TreeMap<>();

        // when
        // for 'String' keys, they will be ordered 'naturally', here alphabetical!
        map.put("b","Wert4");
        map.put("e","Wert2");
        map.put("a","Wert1");
        map.put("d","Wert3");
        map.put("c","Wert5");

        // then
        logger.log(map);
    }

}
