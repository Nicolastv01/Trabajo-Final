/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cox;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class conexion {
    

    private static final String URL="jdbc:mysql://localhost:3306/bdbotica";
    private static final String USER = "root";
    private static final String PASS = "123456";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Connection cx = null;
    public static Connection getconexion() throws SQLException{
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
                
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    return cx;
    }

}
