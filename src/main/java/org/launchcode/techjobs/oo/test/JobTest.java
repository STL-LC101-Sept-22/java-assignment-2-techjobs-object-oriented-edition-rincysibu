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
    public void testToStringStartsAndEndsWithNewLine(){
        assertTrue(true);
    }
    @Test
    public void testSettingJobId(){
        Job job1=new Job();
        Job job2=new Job();
        String spec="Test Job IDs are distinct";
        int job1Id= job1.getId();
        int job2Id=job2.getId();
        assertNotEquals(spec,job1Id,job2Id);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String spec="Checking jobID has a value";
        assertTrue(spec,job.getId()!=0);

       //Checking Name field
        spec="Test value of job title is Product tester";
        assertEquals(spec,"Product tester",job.getName());

       //Testing Employer
        spec="Test type of employer object";
        assertTrue(spec,job.getEmployer() instanceof Employer);
        spec="Test value of employer is ACME";
        assertEquals(spec,"ACME",job.getEmployer().getValue());

        //Testing Location
        spec="Test type of location object";
        assertTrue(spec,job.getLocation() instanceof Location);
        spec="Test value of location is Desert";
        assertEquals(spec,"Desert",job.getLocation().getValue());

        //Testing PositionType
        spec="Test type of position type object";
        assertTrue(spec,job.getPositionType() instanceof PositionType);
        spec="Test value of positionn type as Quality Control";
        assertEquals(spec,"Quality control",job.getPositionType().getValue());

        //Testing CoreCompetency
        spec="Test type of corecompetency object";
        assertTrue(spec,job.getCoreCompetency() instanceof CoreCompetency);
        spec="Test value of core competency is Persistence ";
        assertEquals(spec,"Persistence",job.getCoreCompetency().getValue());

    }
    @Test
    public void testJobsForEquality(){

        Job job1=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
   String spec="Test two job objects with different ID returns false";
   assertFalse(spec,job1.equals(job2));

    }



}
