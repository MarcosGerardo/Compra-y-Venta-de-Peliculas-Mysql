/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Mata
 */
public class Conexion {
     Connection con=null; 
   public Connection conexion(){
       try {
           //Driver
           Class.forName("com.mysql.jdbc.Driver");
           //Tipo de conexion, el servidor, base de datos, usuario, password
           con=DriverManager.getConnection("jdbc:mysql://localhost/block","root","");
           System.out.println("Conexion realizada");
       } catch (ClassNotFoundException | SQLException e) {
           JOptionPane.showMessageDialog(null,"Problemas al conectar"+ e);
       }
       return con;
   }
    
}
