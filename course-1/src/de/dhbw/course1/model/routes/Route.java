package de.dhbw.course1.model.routes;

import java.util.List;
import java.util.Objects;

public class Route {

    /**
     * Example name: WI-FFM
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<Section> sections;

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return name.equals(route.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
