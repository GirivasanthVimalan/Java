/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resource.managment;

import java.sql.SQLException;

/**
 *
 * @author girivasanthvm
 */
public class ResourceManagment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Login l=new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);

     
    }  
    
}
