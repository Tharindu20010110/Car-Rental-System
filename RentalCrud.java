/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mtlak
 */
public class RentalCrud {

    private final Connection connection = DatabaseConnection.createDatabseConnection();
    private String query1, query2;
    private int count;
    
     CarRegistation car = new CarRegistation();
    
    public int insertRental(Rental rental) {
        query1 = "INSERT INTO rental(car_regno,nic,customerName,fee,date,due_date)VALUES(?,?,?,?,?,?)";
        query2 = "update car set Available='No' where RegistationNo=?";
        try {
            PreparedStatement preparedStatement1 = connection.prepareStatement(query1);
            preparedStatement1.setString(1, rental.getCarReg());
            preparedStatement1.setString(2, rental.getCustomerId());
            preparedStatement1.setString(3, rental.getCustomerName());
            preparedStatement1.setString(4, rental.getRentalFee());
            preparedStatement1.setString(5, rental.getDate());
            preparedStatement1.setString(6, rental.getDueDate());
            count = preparedStatement1.executeUpdate();

            PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
            preparedStatement2.setString(1, rental.getCarReg());
            preparedStatement2.executeUpdate();
            car.updateTable();
            
           
        } catch (SQLException err) {
            err.printStackTrace();
        }
        return count;
    }

}
