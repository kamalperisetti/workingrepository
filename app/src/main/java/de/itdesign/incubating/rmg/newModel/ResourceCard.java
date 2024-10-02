package de.itdesign.incubating.rmg.newModel;
import java.util.UUID;

public class ResourceCard {

    String id;
    String skill;
    String name;
    int time;
    String homeBoardId;

    public ResourceCard(String skill,String name,int time,String homeBoardId){
        //GUID for id
        this.id=generateGUID();
        this.skill=skill;
        this.name=name;
        this.time=time;
        this.homeBoardId=homeBoardId;
    }
   //Method  to generate GUID(UUID)
    private String generateGUID() {
        return  UUID.randomUUID().toString(); //Generate GUID
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
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
