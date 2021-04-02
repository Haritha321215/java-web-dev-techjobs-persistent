package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    @OneToMany
    @JoinColumn
    @NotNull
    private final List<Job> jobs = new ArrayList<>();

    @NotNull
    @Size(min = 3, max = 200, message = "Location must be between 3 and 200 characters")
    private String location;

    public Employer(String location){
        this.location=location;
    }

    public Employer(){

    }

    public List<Job> getJobs() {
        return jobs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
