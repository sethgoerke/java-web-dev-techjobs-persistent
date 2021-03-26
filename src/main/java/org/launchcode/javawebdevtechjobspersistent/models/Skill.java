package org.launchcode.javawebdevtechjobspersistent.models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    private String description;

    @ManyToMany(mappedBy="skills")//added this for part 4
    private final List<Job> jobs = new ArrayList<>();//added this for part 4

    public Skill (){
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}