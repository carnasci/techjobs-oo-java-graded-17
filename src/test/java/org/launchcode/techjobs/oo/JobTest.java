package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job jobA = new Job();
        Job jobB = new Job();
        Assert.assertNotEquals(jobA.getId(), jobB.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(jobA.getName(), "Product tester");
        assertTrue(jobA instanceof Job);
        assertEquals(jobA.getEmployer().getValue(), "ACME");
        assertTrue(jobA.getEmployer() instanceof Employer);
        assertEquals(jobA.getLocation().getValue(), "Desert");
        assertTrue(jobA.getLocation() instanceof Location);
        assertEquals(jobA.getPositionType().getValue(), "Quality control");
        assertTrue(jobA.getPositionType() instanceof PositionType);
        assertEquals(jobA.getCoreCompetency().getValue(), "Persistence");
        assertTrue(jobA.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobB = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(jobA.equals(jobB));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String newLine = System.lineSeparator();
        assertEquals(jobA.toString(), "\n" + "ID: 5" + "\n" + "Name: Product tester" + "\n" + "Employer: ACME"
                + "\n" + "Location: Desert" + "\n" + "Position Type: Quality control" + "\n" + "Core Competency: Persistence" + "\n");
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String newLine = System.lineSeparator();
        assertEquals(jobA.toString(), "\n" + "ID: 4" + "\n" + "Name: Product tester" + "\n" + "Employer: ACME"
                 + "\n" + "Location: Desert" + "\n" + "Position Type: Quality control" + "\n" + "Core Competency: Persistence" + "\n");
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job jobA = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));

        String newLine = System.lineSeparator();
        assertEquals(jobA.toString(), "\n" + "ID: 3" + "\n" + "Name: Product tester" + "\n" + "Employer: Data not available"
                + "\n" + "Location: Desert" + "\n" + "Position Type: Data not available" + "\n" + "Core Competency: Persistence" + "\n");
    }

}
