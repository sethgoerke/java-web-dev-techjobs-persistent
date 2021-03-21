package org.launchcode.javawebdevtechjobspersistent.models;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
//I added all below

    @NotBlank(message = "Location is required")
    private String location;

    //I created line 15 - 17 for part 3
    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public Employer(){
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
//created everything above

}
