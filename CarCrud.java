/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ashik
 */
public class CarCrud {
    //Getting database Connection
    private final Connection connection=DatabaseConnection.createDatabseConnection();
    private String query;
    private int count;
    public int insert(Car car){
        query="insert into car values(?,?,?,?,?)";
        
        try{
            //PreparedStatement will be used for executing SQL statements many times dynamically.
            //It will accept input parameters.
            PreparedStatement pSTM=connection.prepareStatement(query);
            
            pSTM.setInt(1, car.getCarID());
            pSTM.setString(2, car.getRegistationNo());
            pSTM.setString(3, car.getBrand());
            pSTM.setString(4, car.getModel());
            pSTM.setString(5, car.getAvailable());
            
            count=pSTM.executeUpdate();
            
        }catch(SQLException err){
            err.printStackTrace();
        }
        return count;
    }
    
    
    public ResultSet retrievedAll(){
        query="select * from car";
        ResultSet result;
        result = null;
        //Statement will be used for executing static SQL statements and it can't accept input parameters.
        try{
            Statement statement=connection.createStatement();
            result=statement.executeQuery(query);
            
        }catch(Exception err){
            err.printStackTrace();
        }
        return result;
    }

    public int updateCar(int carID,String registationNo,String brand,String model,String available){
        //CarID RegistationNo Brand Model Availabkle
        query="Update car set CarID=?,RegistationNo=?,Brand=?,Model=?,Available=? where CarID=?";
        try{
            PreparedStatement pSTM=connection.prepareStatement(query);
            pSTM.setInt(1,carID );
            pSTM.setString(2, registationNo);
            pSTM.setString(3,brand );
            pSTM.setString(4, model);
            pSTM.setString(5, available);
            pSTM.setInt(6, carID);
            
            //this will assingn integer for count if execute successfull
            count= pSTM.executeUpdate();
 
        }catch(Exception err){
            err.printStackTrace();
        }
        return count;
    }
    
    public int deleteCar(int carID){
        query="delete from car where CarID=?";
        try{
            PreparedStatement pSTM=connection.prepareStatement(query);
            pSTM.setInt(1, carID);
            count=pSTM.executeUpdate();
        }catch(SQLException err){
            err.printStackTrace();
        }
        return count;
    }
    
    public void autoID(){
        query="select Max(carId) from car;";
        try{
            //Statement will be used for executing static SQL statements and it can't accept input parameters.
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);            
        }catch(Exception err){
            err.printStackTrace();
        }
    }
    
}
