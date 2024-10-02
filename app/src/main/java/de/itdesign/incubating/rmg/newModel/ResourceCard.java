package de.itdesign.incubating.rmg.newModel;
import de.itdesign.incubating.rmg.model.Skill;

import java.util.UUID;

public class ResourceCard {

    String id;
    String homeBoardId;
    int time;
    Skill skill;
    String name;


    public ResourceCard(String id, String homeBoardId, int time, Skill skill, String name){
        //GUID for id
        this.id=id;
        this.skill=skill;
        this.name=name;
        this.time=time;
        this.homeBoardId=homeBoardId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getHomeBoardId() {
        return homeBoardId;
    }

    public void setHomeBoardId(String homeBoardId) {
        this.homeBoardId = homeBoardId;
    }
}
