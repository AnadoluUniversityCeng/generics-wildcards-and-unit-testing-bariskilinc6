package edu.estu;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/* *********************************************************
 **** WRITE YOUR FAILING UNIT TEST(S) INTO  THIS FILE! *****
 ***********************************************************
 */

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {
       @Test(expected = RuntimeException.class)
    public void testInfiniteLoopBug() {
        // This test is expected to fail because the method infiniteLoop enters an infinite loop for certain inputs.
        App.infiniteLoop(Double.POSITIVE_INFINITY);
        // If the method does not throw an exception, the test will fail
        fail("Expected infinite loop, but the method did not throw an exception.");
    }
}
}
