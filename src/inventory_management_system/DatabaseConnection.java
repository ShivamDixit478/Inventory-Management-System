/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory_management_system;

import java.sql.*;

/**
 *
 * @author asus
 */
import java.sql.Connection;
public class DatabaseConnection
{
    static String url="jdbc:derby://localhost:1527/InventoryDataBase";
    static String username="User1";
    static String password="User1";
    Connection Conn=null;
    public Connection getConn() {
        try {

            
            Conn = DriverManager.getConnection(url, username, password);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return Conn;
    }
}
