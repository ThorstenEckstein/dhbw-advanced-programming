package de.dhbw.enums;

import de.dhbw.commons.Logger;
import de.dhbw.enums.solution.Color;
import de.dhbw.enums.solution.RgbColor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExerciseSolutions {

    private final Logger logger = new Logger(ExerciseSolutions.class);

    @Test
    @DisplayName("Exercise 1: 'Switch' anstelle von 'if-elseif-else'")
    public void exercise1Solution() {
        // given
        Color red = Color.Red;

        // when
        Color mixed = red.mix(Color.Blue);

        // then
        assertEquals(Color.Lila, mixed);
    }

    @Test
    @DisplayName("Exercise 2: ...")
    public void exercise2Solution() {
        // given
        RgbColor color = RgbColor.Black;

        // when
        String rgb = color.getRGB();

        // then
        assertEquals("(0,0,0)", rgb);
    }

}
