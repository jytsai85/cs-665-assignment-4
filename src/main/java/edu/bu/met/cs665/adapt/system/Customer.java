/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/13/2024
 * File Name: Customer.java
 * Description: Customer object class.
 */

package edu.bu.met.cs665.adapt.system;

public class Customer {
  String firstName;
  String lastName;
  int customerId;

  /**
   * Getter method for first name.
   *
   * @return firstname of the customer.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Setter method for first name.
   *
   * @param firstName first name of the customer.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Getter method for last name.
   *
   * @return lastname of the customer.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter method for last name.
   *
   * @param lastName last name of the customer.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Getter method for customer ID.
   *
   * @return a unique ID given to the customer.
   */
  public int getCustomerId() {
    return customerId;
  }

  /**
   * Setter method for customer ID.
   *
   * @param customerId a unique ID given to the customer.
   */
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }
}
