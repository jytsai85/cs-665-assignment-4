/**
 * Name: JINGYI TSAI
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/11/2024
 * File Name: UsbToHttpsAdapter.java
 * Description: The adapter that facilitates the integration
 * of the old and new system interfaces.
 */

package edu.bu.met.cs665.adapt.system;

public class UsbToHttpsAdapter implements CustomerData_Https {
  private final CustomerData_Usb usbAccess;

  public UsbToHttpsAdapter(CustomerData_Usb usbAccess) {
    this.usbAccess = usbAccess;
  }

  @Override
  public void printCustomer(int customerId) {
    usbAccess.printCustomer(customerId);
  }

  @Override
  public void getCustomer_Https(int customerId) {
    usbAccess.getCustomer_Usb(customerId);
  }
}
