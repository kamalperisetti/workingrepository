package de.itdesign.incubating.rmg.newModel;

import de.itdesign.incubating.rmg.model.Skill;

public class Demand {
    int time;
    Skill skill;

    public Demand(int time, Skill skill) {
        this.time = time;
        this.skill = skill;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
