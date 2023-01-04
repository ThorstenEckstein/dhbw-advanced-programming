package de.dhbw.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Answer {

    private List<String> letters;
    private final String detail;

    private Answer(String letter, String detail) {
        this.letters = List.of(letter);
        this.detail = detail;
    }

    private Answer(List<String> letters, String detail) {
        this.letters = letters;
        this.detail = detail;
    }

    public static Answer from(String letter) {
        return new Answer(letter, null);
    }

    public static Answer fromMany(String... letters) {
        return new Answer(Arrays.asList(letters), null);
    }

    public static Answer from(String letter, String format, Object... args) {
        String detail = String.format(format, args);
        return new Answer(letter, detail);
    }

    public List<String> getLetters() {
        return letters;
    }

    public String getLetter() {
        if (letters.size() > 1) {
            throw new RuntimeException("Please use getLetters(), because this is a multi-answer question!");
        }
        return letters.get(0);
    }

    public String getDetail() {
        return detail;
    }

    public void showDetail(boolean answerIsCorrect) {
        if (answerIsCorrect) {
            System.out.printf("%s: %s", letters, detail);
        }
    }

}
