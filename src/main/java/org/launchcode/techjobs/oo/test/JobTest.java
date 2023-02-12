package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        String spec = "Test Job IDs are distinct";
        int job1Id = job1.getId();
        int job2Id = job2.getId();
        assertNotEquals(spec, job1Id, job2Id);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String spec = "Checking jobID has a value";
        assertTrue(job.getId() != 0);

        //Checking Name field
        spec = "Test value of job title is Product tester";
        assertEquals( "Product tester", job.getName());

        //Testing Employer
        spec = "Test type of employer object";
        assertTrue(job.getEmployer() instanceof Employer);
        spec = "Test value of employer is ACME";
        assertEquals( "ACME", job.getEmployer().getValue());

        //Testing Location
        spec = "Test type of location object";
        assertTrue( job.getLocation() instanceof Location);
        spec = "Test value of location is Desert";
        assertEquals( "Desert", job.getLocation().getValue());

        //Testing PositionType
        spec = "Test type of position type object";
        assertTrue(job.getPositionType() instanceof PositionType);
        spec = "Test value of positionn type as Quality Control";
        assertEquals( "Quality control", job.getPositionType().getValue());

        //Testing CoreCompetency
        spec = "Test type of corecompetency object";
        assertTrue( job.getCoreCompetency() instanceof CoreCompetency);
        spec = "Test value of core competency is Persistence ";
        assertEquals( "Persistence", job.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String spec = "Test two job objects with different ID returns false";
        assertFalse(job1.equals(job2));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        Job jobTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //testing new line before and after the job object
        String spec = "To String method returns job object with a blank line before and after job information";
        String actual = jobTest2.toString();

        assertEquals('\n', actual.charAt(0));
        assertEquals('\n', actual.charAt(actual.length()-1));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job jobTest3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //Testing the display for job object
        String spec = "Displaying the job object as per the requirement";
        String expected = "\nID: 4\nName: Product tester\nEmployer: ACME\n" +
                "Location: Desert\nPosition Type: Quality control" +
                "\nCore Competency: Persistence\n";
        assertEquals(expected, jobTest3.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        //Testing to dispaly data not vailable if the value of the field is empty
        Job jobTest4 = new Job("", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String spec = "Display empty field as Data not avaliable";
        String expected = "\nID: 3\nName: Data not available\nEmployer: ACME\n" +
                "Location: Data not available\nPosition Type: Quality control" +
                "\nCore Competency: Persistence\n";
        assertEquals(expected, jobTest4.toString());
    }


}
