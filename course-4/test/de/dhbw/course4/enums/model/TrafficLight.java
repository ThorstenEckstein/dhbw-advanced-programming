package de.dhbw.course4.enums.model;

/*

    @DisplayName(
            """
            Q1: Consider the following enum:

            public enum TrafficLight {
                Red, DarkRedYellow, LightRedYellow, Yellow, Green;
            }

            Add methods to the enum to check if a car is allowed to pass the traffic light
            and test it in the test method.
            """
    )
    @Test
    public void canPassTrafficLight() {
        // given - enum TrafficLight

        // when
        boolean canBePassed = TrafficLight.canBePassed("LightRedYellow");
        boolean mustNotBePassed = TrafficLight.mustNotBePassed("Red");

        // then
        assertTrue(canBePassed);
        assertTrue(mustNotBePassed);
    }


*/

public enum TrafficLight {

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Exercise 3                                  !!!!!
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    Red, DarkRedYellow, LightRedYellow, Yellow, Green;

    public static boolean canBePassed(String state) {
        TrafficLight _state = TrafficLight.valueOf(state);
        return _state == LightRedYellow || _state == Yellow || _state == Green;
    }

    public static boolean mustNotBePassed(String state) {
        TrafficLight _state = TrafficLight.valueOf(state);
        return _state == Red || _state == DarkRedYellow;
    }

}