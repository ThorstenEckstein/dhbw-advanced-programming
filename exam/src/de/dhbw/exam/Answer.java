package de.dhbw.exam;

public class Answer {

    private final String letter;
    private final String detail;

    private Answer(String letter, String detail) {
        this.letter = letter;
        this.detail = detail;
    }

    public static Answer from(String letter) {
        return new Answer(letter, null);
    }

    public static Answer from(String letter, String format, Object... args) {
        String detail = String.format(format, args);
        return new Answer(letter, detail);
    }

    public String getLetter() {
        return letter;
    }

    public String getDetail() {
        return detail;
    }

    public void showDetail(boolean answerIsCorrect) {
        if (answerIsCorrect) {
            System.out.printf("%s: %s", letter, detail);
        }
    }

}
