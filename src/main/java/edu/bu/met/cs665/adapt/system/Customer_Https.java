/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/13/2024
 * File Name: Customer_Https.java
 * Description: A Customer child class that stores customer objects belongs to the new system.
 */

package edu.bu.met.cs665.adapt.system;

public class Customer_Https extends Customer implements CustomerData_Https {
  /**
   * Create a Customer object using first and last name and customer ID.
   *
   * @param firstName  firstname of the customer as a string
   * @param lastName   lastname of the customer as a string
   * @param customerId customerID of the customer as an integer
   */
  public Customer_Https(String firstName, String lastName, int customerId) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.customerId = customerId;
  }

  public void printCustomer(int customerId) {
    if (customerId == this.getCustomerId()) {
      String name = this.getFirstName() + ' ' + this.getLastName();
      System.out.println("Accessing data of " + name);
    }
  }

  public void getCustomer_Https(int customerId) {
    System.out.println("Retrieving customer data through HTTPS connection...");
  }
}
