package de.dhbw.course2;

import java.util.Objects;

public class News extends Object {

    private String statement;

    public News(String statement) {
        this.statement = statement;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(statement, news.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statement);
    }
}