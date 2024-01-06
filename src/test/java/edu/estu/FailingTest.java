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
      public class UserLoginTest {

    // Testing a deliberate scenario where the user login method intentionally goes into an infinite loop
    @Test(timeout = 1000) // Setting a timeout to prevent the infinite loop
    public void testInfiniteLoopOnUserLogin() {
        UserLoginService loginService = new UserLoginService();

        try {
            // Invoking the method that enters an infinite loop
            loginService.infiniteUserLogin();
        } catch (Throwable expected) {
            // If an infinite loop error is caught, the test is considered successful
            return;
        }

        // If no infinite loop error is caught within the specified time, the test fails
        throw new AssertionError("No infinite loop error occurred!");
    }
}
}
