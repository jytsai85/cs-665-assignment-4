/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/11/2024
 * File Name: UsbToHttpsAdapter.java
 * Description: The adapter that facilitates the integration
 * of the old and new system interfaces.
 */
package edu.bu.met.cs665.adapt.system;

public class UsbToHttpsAdapter implements CustomerData_HTTPS {
    private final CustomerData_USB usbAccess;

    public UsbToHttpsAdapter(CustomerData_USB usbAccess) {
        this.usbAccess = usbAccess;
    }

    @Override
    public void printCustomer(int customerId) {
        usbAccess.printCustomer(customerId);
    }

    @Override
    public void getCustomer_HTTPS(int customerId) {
        usbAccess.getCustomer_USB(customerId);
    }
}
