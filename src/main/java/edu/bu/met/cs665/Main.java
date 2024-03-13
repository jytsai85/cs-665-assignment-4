/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/13/2024
 * File Name: Main.java
 * Description: Main class to run examples of the system.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.adapt.system.*;

/**
 * This is the Main class.
 */
public class Main {

    /**
     * A main method to run examples.
     * (1) Creating two customer objects, one in the legacy system, the other in the new system.
     * (2) Accessing data in the legacy system via old interface.
     * (3) Accessing data in the new system via new interface.
     * (4) Using an adapter to integrate accessing data in the legacy system via new interface.
     */
    public static void main(String[] args) {
        // Customer data in the USB system
        CustomerData_USB legacyCustomer = new Customer_USB("Adam", "Black", 45);
        // Customer data in the HTTPS system
        CustomerData_HTTPS newCustomer = new Customer_HTTPS("Cathy", "Diamond", 11);

        // Access data in legacy system via old interface
        legacyCustomer.printCustomer(45);
        legacyCustomer.getCustomer_USB(45);

        // Access data in new system via new interface
        newCustomer.printCustomer(11);
        newCustomer.getCustomer_HTTPS(11);

        // Access legacy system's API with new system interface
        CustomerData_HTTPS httpsAccess = new UsbToHttpsAdapter(legacyCustomer);
        httpsAccess.printCustomer(45);
        httpsAccess.getCustomer_HTTPS(45);
    }
}
