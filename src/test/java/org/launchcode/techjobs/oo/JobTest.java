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
    public void testToStringStartsAndEndsWithANewLine() {
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String newLine = System.lineSeparator();
        assertEquals(jobA.toString(), newLine + "ID: 6" + newLine + "Name: Product tester" + newLine + "Employer: ACME"
                + newLine + "Location: Desert" + newLine + "Position Type: Quality control" + newLine + "Core Competency: Persistence" + newLine);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String newLine = System.lineSeparator();
        assertEquals(jobA.toString(), newLine + "ID: 4" + newLine + "Name: Product tester" + newLine + "Employer: ACME"
                 + newLine + "Location: Desert" + newLine + "Position Type: Quality control" + newLine + "Core Competency: Persistence" + newLine);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job jobA = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));

        String newLine = System.lineSeparator();
        assertEquals(jobA.toString(), newLine + "ID: 3" + newLine + "Name: Product tester" + newLine + "Employer: Data not available"
                + newLine + "Location: Desert" + newLine + "Position Type: Data is not available" + newLine + "Core Competency: Persistence" + newLine);
    }

}
