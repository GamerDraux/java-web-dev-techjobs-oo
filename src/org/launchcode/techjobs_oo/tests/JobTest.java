package org.launchcode.techjobs_oo.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTest {
    Job job1;
    Job job2;
    Job job3;

    @Before
    public void initialize() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product Tester", new Employer(
                "ACME"), new Location("Desert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
    }

    @Test //tests that a job is equal to itself
    public void sameJobEqual(){
        Assert.assertEquals(job1,job1);
    }

    @Test //tests that 2 jobs are not equal because of
            // same fields
    public void jobsNotEqual(){
        Assert.assertNotEquals(job1, job2);
    }

    @Test //tests that constructor creates an instance of
    // the Job class
    public void jobConstructorSetsInstanceOfJob(){
        //noinspection ConstantConditions
        Assert.assertTrue(job3 instanceof Job);
    }

    @Test //tests that constructor sets value of name
    public void jobConstructorSetsNameOfJob(){
        Assert.assertTrue(job3.getName()!=null&& job3.getName().equals("Product Tester"));
    }

    @Test //tests that constructor sets value of Employer
    public void jobConstructorSetsEmployerOfJob(){
        Assert.assertTrue(job3.getEmployer()!=null&&job3.getEmployer().getValue().equals("ACME"));
    }

    @Test //tests that constructor sets value of Location
    public void jobConstructorSetsLocationOfJob(){
        Assert.assertTrue(job3.getLocation()!=null&&job3.getLocation().getValue().equals("Desert"));
    }

    @Test //tests that constructor sets value of
    // PositionType
    public void jobConstructorSetsPositionTypeOfJob(){
        Assert.assertTrue(job3.getPositionType()!=null&&job3.getPositionType().getValue().equals("Quality Control"));
    }

    @Test //tests that constructor sets value of core
    // Competency
    public void jobConstructorSetsCoreCompetencyOfJob(){
        Assert.assertTrue(job3.getCoreCompetency()!=null&&job3.getCoreCompetency().getValue().equals("Persistence"));
    }

    @Test //tests that each job is assigned a unique id
    // by checking equals on 2 jobs with the same field
    // values except ID
    public void jobConstructorSetsUniqueIdForEachJob(){
        Employer employer = new Employer();
        Location location = new Location();
        PositionType positionType = new PositionType();
        CoreCompetency coreCompetency =
                new CoreCompetency();
        Job job4 = new Job("Party Hound",employer,
                location,positionType, coreCompetency);
        Job job5 = new Job("Party Hound", employer,
                location,positionType,coreCompetency);
        Assert.assertNotEquals(job4, job5);
    }

    @Test //test the toString method starts and ends with
    // a blank line
    public void toStringStartsAndEndsWithBlankLine(){
        Assert.assertTrue(job3.toString().startsWith("\n")&&job3.toString().endsWith("\n"));
    }

    @Test //Test that toString gives a block with labels
    // and the values for each field, each on a separate
    // line
    public void toStringCreatesFieldsAndValuesOnSeparateLines(){
        Assert.assertEquals(job3.toString(), "\nID: " + job3.getId() +
                "\nName: " +
                "Product Tester\nEmployer: " +
                "ACME\nLocation: Desert\nPosition Type: " +
                "Quality Control\nCore Competency: " +
                "Persistence\n");
    }

    @Test //testing if one of the fields is null, the
    // toString method prints "Data not Available" in
    // field value
    public void dataNotAvailableTest(){
        Employer employer =new Employer("Stuff Inc");
        Location location = new Location("A Place");
        PositionType positionType =new PositionType();
        CoreCompetency coreCompetency =
                new CoreCompetency("Doing Things");
        Job partialJob = new Job("Partial Job",employer,
                location, positionType,coreCompetency);
        Assert.assertEquals(partialJob.toString(), "\nID" +
                        ": " +partialJob.getId()+
                "\nName: Partial Job\nEmployer: " +
                "Stuff " +
                "Inc\nLocation: " +
                "A Place\nPosition Type: Data not" +
                " available\nCore Competency: " +
                "Doing Things\n");
    }

    @Test //if there is no data in the Job aside from an
    // ID, it should print a Does not exist line with
    // blank lines before and after
    public void jobHasNoInformationExceptID(){
        Job blankJob = new Job();
        Assert.assertEquals(blankJob.toString(), "\nOOPS!  This job does not seem to " +
                "exist.\n");
    }

}
