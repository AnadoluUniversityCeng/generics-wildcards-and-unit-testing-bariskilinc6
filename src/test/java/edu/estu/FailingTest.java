package edu.estu;

import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;

/* *********************************************************
 **** WRITE YOUR FAILING UNIT TEST(S) INTO  THIS FILE! *****
 ***********************************************************
 */

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {

@Test(timeout = 2500)
    public void testLoop() {

        double input = Double.POSITIVE_INFINITY;

        try {
            App.infiniteLoop(input);
           
            fail("Expected infinite loop, but the method completed successfully");
        } catch (Exception e) {
           
        }
    }
}
