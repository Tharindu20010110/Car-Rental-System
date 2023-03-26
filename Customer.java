/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

/**
 *
 * @author ashika
 */
public class Customer {
    private String nic;
    private String name;
    private int mobileNo;
    private String address;

    public Customer(String nic, String name, int mobileNo, String address) {
        this.nic = nic;
        this.name = name;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public String getName() {
        return name;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
