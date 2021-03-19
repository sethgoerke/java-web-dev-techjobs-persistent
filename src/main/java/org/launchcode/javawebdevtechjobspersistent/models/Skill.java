package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;

@Entity
public class Skill extends AbstractEntity {


    private String longerDescriptionOfSkill;

    public Skill (){
    }

    public String getLongerDescriptionOfSkill() {
        return longerDescriptionOfSkill;
    }

    public void setLongerDescriptionOfSkill(String longerDescriptionOfSkill) {
        this.longerDescriptionOfSkill = longerDescriptionOfSkill;
    }
}