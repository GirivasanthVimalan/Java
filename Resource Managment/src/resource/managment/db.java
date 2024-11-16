/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resource.managment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class db {
    public static Connection mycon() throws SQLException
    {
        Connection con=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/login","root","");
        }
        catch(ClassNotFoundException |SQLException e)
        {
            System.out.println(e);
            
        }
        return con;
    }
}
