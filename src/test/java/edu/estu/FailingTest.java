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
       @Test(timeout = 1000)
    public void testInfiniteLoop() {
        InfiniteLoopClass infiniteLoopObject = new InfiniteLoopClass();

        // Triggering the infinite loop with specific user input
        int userInput = 0; // Change this to the specific input triggering the infinite loop
        
        // Call the method that enters the infinite loop
        infiniteLoopObject.infiniteLoop(userInput);

        // If the code reaches here, the method didn't enter an infinite loop as expected
        fail("The infinite loop was not triggered as expected");
    }
}
