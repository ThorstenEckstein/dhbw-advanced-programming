package de.dhbw.experimental.foodstore;

import java.util.Arrays;

@SuppressWarnings("SpellCheckingInspection")
public enum FoodGroup {
    Milch("Milch"),
    Milchprodukte("Milchprodukte"),
    Kaese("Käse"),
    Butter("Butter"),
    Eier("Eier"),
    Fleisch("Fleisch"),
    Fleischerzeugnisse("Fleischerzeugnisse"),
    Wurstwaren("Wurstwaren"),
    Fische("Fische"),
    Fischerzeugnisse("Fischerzeugnisse"),
    Krustentiere("Krustentiere"),
    FetteUndOele("Fette, Öle"),
    SuppenUndSossen("Suppen, Soßen"),
    Getreide("Getreide"),
    Getreideprodukte("Getreideprodukte"),
    BroteUndKleingebaecke("Brote, Kleingebäcke"),
    FeineBackwaren("Feine Backwaren"),
    MayonnaisenUndFeinkostsalate("Mayonnaisen, Feinkostsalate"),
    PuddingeUndDesserts("Puddinge, Desserts"),
    Teigwaren("Teigwaren"),
    HuelsenfruechteUndSchalenobst("Hülsenfruechte, Schalenobst"),
    Kartoffeln("Kartoffeln"),
    Frischgemuese("Frischgemüse"),
    Gemueseerzeugnisse("Gemüseerzeugnisse"),
    Pilze("Pilze"),
    Pilzerzeugnisse("Pilzerzeugnisse"),
    Frischobst("Frischobst"),
    Obsterzeugnisse("Obsterzeugnisse"),
    Fruchtsaefte("Fruchtsäfte"),
    AlkoholfreieGetraenke("Alkoholfreie Getränke"),
    Weine("Weine"),
    Weinerzeugnisse("Weinerzeugnisse"),
    WeinaehnlicheGetraenke("Weinähnliche Getränke"),
    Biere("Biere"),
    Spirituosen("Spirituosen"),
    Zucker("Zucker"),
    Honige("Honige"),
    Konfitueren("Konfitüren"),
    Speiseeis("Speiseeis"),
    Suesswaren("Süßwaren"),
    Schokoladen("Schokoladen"),
    Kakao("Kakao"),
    Kaffee("Kaffee"),
    Tee("Tee"),
    Saeuglingsnahrung("Säuglingsnahrung"),
    DiaetischeLebensmittel("Diätische Lebensmittel"),
    Fertiggerichte("Fertiggerichte"),
    Nahrungsergaenzungsmittel("Nahrungsergänzungsmittel"),
    Wuerzmittel("Würzmittel"),
    Gewuerze("Gewürze"),
    Aromastoffe("Aromastoffe"),
    Hilfsmittel("Hilfsmittel"),
    Zusatzstoffe("Zusatzstoffe"),
    Trinkwasser("Trinkwasser"),
    Sonstiges("Sonstiges")
    ;

    private final String original;

    FoodGroup(String original) {
        this.original = original;
    }

    public String getOriginal() {
        return original;
    }

    public static FoodGroup from(String original) {
        return Arrays.stream(FoodGroup.values())
                .filter(fg -> fg.getOriginal().equals(original))
                .findFirst()
                .orElse(FoodGroup.Sonstiges);
    }

}