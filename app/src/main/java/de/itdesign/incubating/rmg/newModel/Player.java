package de.itdesign.incubating.rmg.newModel;

import de.itdesign.incubating.rmg.model.Role;

import java.util.List;

public class Player {
    String id;
    Role role;
    String name;
    List<Integer> scores;

    public Player(String id, Role role, String name, List<Integer> scores) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.scores = scores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }
}
