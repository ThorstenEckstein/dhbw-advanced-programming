package de.dhbw.course2.basics.collections.n;

public class Person {

    private String name;

    private Passport passport;

    public Person(String name, String passportNumber) {
        this.name = name;
        this.passport = new Passport(passportNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public void deletePassport() {
        setPassport(null);
    }
}
