package de.dhbw.exam.course4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// Exercise 2                                  !!!!!
// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

public enum TrainTypeWithSynonyms {


    RegionalTrain(List.of(
            "Regionalzug",
            "Local Train"
    )),
    LongDistanceTrain(List.of(
            "Fernzug",
            "National Train",
            "Expresszug"
    )),
    PassengerTrain(List.of(
            "Personenzug"
    )),
    FreightTrain(List.of(
            "Güterzug",
            "Goods Train"
    )),
    Unknown(List.of(
            "Unbekannt",
            "Nicht bekannt",
            "n/a",
            "?"
    ));

    private final List<String> synonyms;

    TrainTypeWithSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public List<String> getSynonyms() {
        return synonyms;
    }

    public static TrainTypeWithSynonyms from(String synonym) {
        return Arrays.stream(TrainTypeWithSynonyms.values())
                .filter(tt -> tt.getSynonyms().contains(synonym))
                .findFirst()
                .orElse(TrainTypeWithSynonyms.Unknown);
    }

}
