package de.dhbw.experimental;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@SelectPackages({
        "de.dhbw.experimental.trip",
        "de.dhbw.experimental.foodstore"
})
@Suite
public class ExperimentsTestSuite {
}

