/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

/**
 *
 * @author ashik
 */
public class Car {

    private int carID;
    private String registationNo;
    private String brand;
    private String model;
    private String available;
    
    public Car(int carID, String registationNo, String brand, String model, String available) {
        this.carID = carID;
        this.registationNo = registationNo;
        this.brand = brand;
        this.model = model;
        this.available = available;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public void setRegistationNo(String registationNo) {
        this.registationNo = registationNo;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public int getCarID() {
        return carID;
    }

    public String getRegistationNo() {
        return registationNo;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getAvailable() {
        return available;
    }

    
    
}
