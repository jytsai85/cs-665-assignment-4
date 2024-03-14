/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/13/2024
 * File Name: TestCustomer.java
 * Description: JUnit tests to evaluate the system.
 */
package edu.bu.met.cs665;

import edu.bu.met.cs665.adapt.system.Customer_Https;
import edu.bu.met.cs665.adapt.system.Customer_Usb;
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
    Customer_Usb legacyCustomer = new Customer_Usb("Erin", "Ford", 5);
    Customer_Https newCustomer = new Customer_Https("Greg", "Homer", 70);
    assertEquals("Erin", legacyCustomer.getFirstName());
    assertEquals("Homer", newCustomer.getLastName());
  }

  /**
   * A JUnit test to check the function of getting the customer's ID
   * in both the old and new systems.
   */
  @Test
  public void testGetID() {
    Customer_Usb legacyCustomer = new Customer_Usb("India", "Johnson", 2);
    Customer_Https newCustomer = new Customer_Https("Kate", "Lily", 34);
    assertEquals(2, legacyCustomer.getCustomerId());
    assertEquals(34, newCustomer.getCustomerId());
  }

  /**
   * A JUnit test to check the function of setting the customer's ID
   * in both the old and new systems.
   */
  @Test
  public void testSetID() {
    Customer_Usb legacyCustomer = new Customer_Usb("Michael", "Newman", 7);
    Customer_Https newCustomer = new Customer_Https("Olivia", "Pugliese", 26);
    legacyCustomer.setCustomerId(8);
    newCustomer.setCustomerId(45);
    assertEquals(8, legacyCustomer.getCustomerId());
    assertEquals(45, newCustomer.getCustomerId());

  }
}
