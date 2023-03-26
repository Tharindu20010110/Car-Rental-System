/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ashik
 */
public class DatabaseConnection {
    static Connection connection;
    
    public static Connection createDatabseConnection(){     
        //jdbc:mysql://localhost:3306/car_rental?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
        String url="jdbc:mysql://localhost:3306/carrentailsystem";
        String username="root";
        String password="20010110";
        
        try{
            //load driver
            //Class.forName("con.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            //getting connection
            connection=DriverManager.getConnection(url,username,password);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        return connection;
    }
}
