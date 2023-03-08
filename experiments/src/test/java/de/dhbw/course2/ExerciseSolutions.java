package de.dhbw.course2;

import de.dhbw.commons.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseSolutions {

    private final Logger logger = new Logger(ExerciseSolutions.class);

    @Test
    @DisplayName("Lösung zu Übung 1a")
    public void exercise1a() {
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
    @DisplayName("Lösung zu Übung 1b")
    public void exercise1b() {
        // given
        News ardNews = new News("In Mannheim ist heute gutes Wetter!");
        News rtlNews = new News("In Mannheim ist heute schlechtes Wetter!");

        // when
        boolean newsAreEqual = ardNews.equals(rtlNews);

        // then
        assertFalse(newsAreEqual);
    }

    @Test
    @DisplayName("Übung 2a: Typumwandlungen")
    public void exercise2a() {
        // given
        char c = '1';

        // when
        int i = c;

        // then
        // HINT: 49 ist die Dezimalzahl bzw. der ASCII-Zeichensatz-Wert der Ziffer '1' als Character!
        assertEquals(49, i);
    }

    @Test
    @DisplayName("Übung 2b: Typumwandlungen")
    public void exercise2b() {
        // given
        int i = 127;

        // when
        byte b = (byte)i;

        // then
        assertEquals(127, b);
    }

    @Test
    @DisplayName("Übung 3: Klassenmodell") // LIVE CODING
    public void exercise3() {
        // given
        // HumanBeing person = new Person();

        // when

        // then
    }

    @Test
    @DisplayName("Übung 4a: Listeneinträge summieren")
    public void exercise4a() {
        // given
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(43);

        // when
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        // then
        assertEquals(53, sum);
    }

    @Test
    @DisplayName("Übung 4b: Map mit Key-Value-Paaren & Sortierung")
    public void exercise4b() {
        // given
        // TreeMap = ascending key order
        Map<String, String> map = new TreeMap<>();

        // when - 'String' keys will be ordered 'naturally', so 'alphabetically' here!
        map.put("b","Wert4");
        map.put("e","Wert2");
        map.put("a","Wert1");
        map.put("d","Wert3");
        map.put("c","Wert5");

        // then
        logger.log(map);
    }

}
