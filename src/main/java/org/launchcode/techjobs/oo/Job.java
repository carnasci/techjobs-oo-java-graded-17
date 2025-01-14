package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
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

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {

        String newLine = System.lineSeparator();

        /*return newLine + "ID: " + getId() + newLine + "Name: " + getName() + newLine + "Employer: "
                + getEmployer() + newLine + "Location: " + getLocation() + newLine + "Position Type: " + getPositionType() +
                newLine + "Core Competency: " + getCoreCompetency() + newLine ;*/
        if (getName().equals("")) {
            name = "Data not available";
        }
        if (getEmployer().getValue().equals("")) {
            getEmployer().setValue("Data not available");
        }
        if (getLocation().getValue().equals("")) {
            getLocation().setValue("Data not available");
        }
        if (getPositionType().getValue().equals("")) {
            getPositionType().setValue("Data not available");
        }
        if (getCoreCompetency().getValue().equals("")) {
            getCoreCompetency().setValue("Data not available");
        }

        String s = String.format("\n" + "ID: %s" + "\n" + "Name: %s" + "\n" + "Employer: %s" +
                        "\n" + "Location: %s" + "\n" + "Position Type: %s" + "\n" + "Core Competency: %s" + "\n",
                getId(), getName(), getEmployer().getValue(), getLocation().getValue(), getPositionType().getValue(),
                getCoreCompetency().getValue());



        return s;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

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
}
