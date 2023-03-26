/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

/**
 *
 * @author mtlak
 */
 public class Rental {
      private String  carReg;
      private String customerId;
      private String customerName;
      private String rentalFee;   
      private String date;
      private String dueDate;

    public Rental(String carId, String customerId, String customerName, String rentalFee, String date, String dueDate) {
        this.carReg = carId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.rentalFee = rentalFee;
        this.date = date;
        this.dueDate = dueDate;
    }

    public String getCarReg() {
        return carReg;
    }

    public void setCarReg(String carId) {
        this.carReg = carId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(String rentalFee) {
        this.rentalFee = rentalFee;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }


}
