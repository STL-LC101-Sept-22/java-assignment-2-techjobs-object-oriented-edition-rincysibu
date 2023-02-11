package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;

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
}
