package org.launchcode.techjobs.oo;

import java.lang.reflect.Field;
import java.util.Objects;

public class Job {

    private final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    //getter
    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    //setter
    public static void setNextId(int nextId) {
        Job.nextId = nextId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


    public String toString() {
        String[] labels = {"ID: ", "Name: ", "Employer: ", "Location: ", "Position Type: ", "Core Competency: "};
        String blankFieldMessage = "Data not available";
        String message = "";
        int jobID = getId();
        String jobName = getName();
        String jobEmployer = getEmployer().toString();
        String jobLocation = getLocation().toString();
        String jobType = getPositionType().toString();
        String jobSkill = getCoreCompetency().toString();


        if (jobName == "" || jobName == null) {
             jobName = "Data not available";
        }
        if(jobEmployer == "" || jobEmployer == null){
            jobEmployer = "Data not available";
        }
        if(jobLocation == "" || jobLocation == null){
            jobLocation = "Data not available";
        }
        if(jobType == "" || jobType == null){
            jobType = "Data not available";
        }
        if(jobSkill == "" || jobSkill == null){
            jobSkill = "Data not available";
        }
        message = "\n" + "ID: " + jobID + "\nName: " + jobName  + "\nEmployer: " + jobEmployer + "\nLocation: " + jobLocation + "\nPosition Type: " + jobType + "\nCore Competency: " + jobSkill + "\n";

        return message;
    }
}
