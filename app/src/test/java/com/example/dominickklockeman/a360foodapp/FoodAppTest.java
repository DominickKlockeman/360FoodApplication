/*
 * FoodAppTest.java
 * TCSS 360 - Fall 2018
 */

package com.example.dominickklockeman.a360foodapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests cases for the mobile food order application.
 * @author Group 5
 * @version Fall 2018
 */
public class FoodAppTest {

    /**
     * Tests isEmailValid with an actual valid email.
     */
    @Test
    public void testEmailValid() {
        assertTrue(LoginActivity.isEmailValid("bestgio@uw.edu"));
    }

    /**
     * Tests isEmailValid with an email missing the '@' character.
     */
    @Test
    public void testEmailInvalidMissingAt() {
        assertFalse(LoginActivity.isEmailValid("11.com"));
    }

    /**
     * Tests isEmailValid with an email missing the "." character.
     */
    @Test
    public void testEmailInvalidMissingDot() {
        assertFalse(LoginActivity.isEmailValid("11@uwedu"));
    }

    /**
     * Tests isEmailValid with an email that has an invalid length.
     */
    @Test
    public void testEmailInvalidLength() {
        assertFalse(LoginActivity.isEmailValid("@."));
    }

    /**
     * Tests isPasswordValid with a password shorter than
     * requirement length.
     */
    @Test
    public void testPasswordInvalidLength() {
        assertFalse(LoginActivity.isPasswordValid("joke"));
    }

    /**
     * Tests isPasswordValid with a password exceeding the
     * requirement length.
     */
    @Test
    public void testPasswordValid() {
        assertTrue(LoginActivity.isPasswordValid("HelloWorld123"));
    }

    /**
     * Tests isPasswordValid with a password not having
     * some numerical value but meeting required length.
     */
    @Test
    public void testPasswordInvalidMissingNumber() {
        assertFalse(LoginActivity.isPasswordValid("HelloWorld"));
    }

    /**
     * Tests isPasswordValid with not meeting required length
     * but contains numerical requirement.
     */
    @Test
    public void testPasswordInvalidNumberRequirement() {
        assertFalse(LoginActivity.isPasswordValid("1234"));
    }
}