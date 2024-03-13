/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/13/2024
 * File Name: TestCustomer.java
 * Description: JUnit tests to evaluate the system.
 */
package edu.bu.met.cs665;

import edu.bu.met.cs665.adapt.system.Customer_HTTPS;
import edu.bu.met.cs665.adapt.system.Customer_USB;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCustomer {
    public TestCustomer() {
    }

    /**
     * A JUnit test to check the function of getting the customer's first and last name
     * in both the old and new systems.
     */
    @Test
    public void testGetName() {
        Customer_USB legacyCustomer = new Customer_USB("Erin", "Ford", 5);
        Customer_HTTPS newCustomer = new Customer_HTTPS("Greg", "Homer", 70);
        assertEquals("Erin", legacyCustomer.getFirstName());
        assertEquals("Homer", newCustomer.getLastName());
    }

    /**
     * A JUnit test to check the function of getting the customer's ID
     * in both the old and new systems.
     */
    @Test
    public void testGetID() {
        Customer_USB legacyCustomer = new Customer_USB("India", "Johnson", 2);
        Customer_HTTPS newCustomer = new Customer_HTTPS("Kate", "Lily", 34);
        assertEquals(2, legacyCustomer.getCustomerId());
        assertEquals(34, newCustomer.getCustomerId());
    }

    /**
     * A JUnit test to check the function of setting the customer's ID
     * in both the old and new systems.
     */
    @Test
    public void testSetID(){
        Customer_USB legacyCustomer = new Customer_USB("Michael", "Newman", 7);
        Customer_HTTPS newCustomer = new Customer_HTTPS("Olivia", "Pugliese", 26);
        legacyCustomer.setCustomerId(8);
        newCustomer.setCustomerId(45);
        assertEquals(8 , legacyCustomer.getCustomerId());
        assertEquals(45, newCustomer.getCustomerId());

    }
}
