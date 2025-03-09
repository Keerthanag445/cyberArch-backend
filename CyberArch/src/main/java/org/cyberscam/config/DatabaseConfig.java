package org.cyberscam.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConfig {
    private static final String Url="jdbc:mysql://localhost:3306/CyberArch";
    private static final String UserName="root";
    private static final String Password="Keerthana@04";
    public static Connection getConnection() throws SQLException {
        if(DriverManager.getConnection(Url,UserName,Password)!=null){
            return DriverManager.getConnection(Url, UserName, Password);
        }
        System.out.println("Connection is null");
        return  null;
    }

    public static  void main(String [] args){
        try{
            Connection con=DatabaseConfig.getConnection();

        }
        catch(Exception e){
            System.out.println();
        }
    }
 }
