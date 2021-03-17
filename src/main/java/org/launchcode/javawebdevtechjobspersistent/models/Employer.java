package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Employer extends AbstractEntity {
//I added all below

    @NotBlank(message = "Location is required")
    private String location;

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
