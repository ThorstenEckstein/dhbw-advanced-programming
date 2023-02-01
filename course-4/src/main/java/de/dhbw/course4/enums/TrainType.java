package de.dhbw.course4.enums;

public enum TrainType {

    RegionalTrain("Regionalzug"),
    LongDistanceTrain("Fernzug"),
    PassengerTrain("Personenzug"),
    FreightTrain("Güterzug"),
    Unknown("Unbekannt");

    // ... can be many more ...

    private final String synonym;

    TrainType(String synonym) {
        this.synonym = synonym;
    }

    public String getSynonym() {
        return synonym;
    }

    public static TrainType from(String synonym) {
        for (TrainType trainType : TrainType.values()) {
            if (trainType.getSynonym().equals(synonym)) {
                return trainType;
            }
        }
        return TrainType.Unknown;
    }

}
