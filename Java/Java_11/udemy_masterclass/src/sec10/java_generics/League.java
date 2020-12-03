package sec10.java_generics;

import java.util.List;

public class League <T extends Team> {
    private String name;
    private List<T> clubs;

    public League(String name, List<T> teams) {
        this.name = name;
        clubs = teams;
    }

    public String getName() {
        return name;
    }
}
