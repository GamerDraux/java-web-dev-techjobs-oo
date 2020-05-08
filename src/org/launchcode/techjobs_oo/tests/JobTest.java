package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.launchcode.techjobs_oo.*;

public class JobTest {
    Job job1 = new Job();
    Job job2 = new Job();
    Job job3 = new Job("Product tester", new Employer(
            "ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Test //tests that each new job is given a unique
    // id
    public void newIdForEachJob(){
        Assert.assertNotEquals(job1, job2);
    }

    @Test //tests that constructor creates an instance of
    // the Job class
    public void jobConstructorSetsInstanceOfJob(){
        Assert.assertTrue(job3 instanceof Job);
    }

    @Test //tests that constructor sets value of name
    public void jobConstructorSetsNameOfJob(){
        Assert.assertTrue(job3.getName()!=null&& job3.getName().equals("Product tester"));
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
        Assert.assertTrue(job3.getPositionType()!=null&&job3.getPositionType().getValue().equals("Quality control"));
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
}
