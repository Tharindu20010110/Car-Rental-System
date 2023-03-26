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
public class CustomerCrud {
    //getting dataBase COnnection
    private final Connection connection=DatabaseConnection.createDatabseConnection();
    private String query;
    private int count;
    
    public int insertCustomer(Customer customer){
        query="insert into customer values(?,?,?,?)";
        
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1, customer.getNic());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setInt(3, customer.getMobileNo());
            preparedStatement.setString(4, customer.getAddress());
            
            count=preparedStatement.executeUpdate();
        }catch(SQLException err){
            err.printStackTrace();
        }
        return count;
    }
    
    public ResultSet retrievedAll(){
        query="select * from customer";
        ResultSet result=null;
        try{
            Statement statement=connection.createStatement();
            result=statement.executeQuery(query);
        }catch(Exception err){
            err.printStackTrace();
        }
        
        return result;
    }
    
    public int updateCustomer(String nic,String customerName,int mobileNo,String address){
        query="Update customer set nic=?,customerName=?,mobileNo=?,address=? where nic=?";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1, nic);
            preparedStatement.setString(2, customerName);
            preparedStatement.setInt(3, mobileNo);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, nic);
            
            //this will assingn integer for count if execute successfull
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return count;
    }
    
    public int deleteCustomer(String nic){
        query="delete from customer where nic=? ";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1, nic);
            count=preparedStatement.executeUpdate();
        }catch(SQLException err){
            err.printStackTrace();
        }
        return count;
    }
}
