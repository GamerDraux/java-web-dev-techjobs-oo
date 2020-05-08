package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        this.id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer,
               Location aLocation,
               PositionType aPositionType,
               CoreCompetency aCoreCompetency){
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String toString(){
        String name;
        String employer;
        String location;
        String positionType;
        String na = "Data not available";
        if (this.name==null&&this.employer==null&&this.location==null&&this.positionType==null&&this.coreCompetency==null){
            return "\nOOPS!  This job does not seem to " +
                    "exist.\n";
        }

        if (this.name==null){name=na;}else{name=
                this.name;}
        assert this.employer != null;
        if (this.employer.getValue()==null){employer=na;}else{employer=this.employer.getValue();}
        if (this.location.getValue()==null){location=na;}else{location=this.location.getValue();}
        if (this.positionType.getValue()==null){positionType=na;}else{positionType=this.positionType.getValue();}
        String coreCompetency;
        if (this.coreCompetency.getValue()==null){coreCompetency=na;}else{coreCompetency=this.coreCompetency.getValue();}

        return "\nID: "+ this.id+"\nName: "+name+
        "\nEmployer: "+employer+"\nLocation" +
        ":" +
        " "+location+"\nPosition " +
        "Type: "+positionType+
        "\nCore Competency: "+coreCompetency +
        "\n";
    }
}
