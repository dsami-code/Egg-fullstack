/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public abstract class DAO {
    //variables de conexión
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    //constantes 
    private final String USER ="root";
    private final String PASSWORD="root";
    private final String DATABASE ="tienda";
    private final String DRIVER ="com.mysql.jdbc.Driver";
    
    protected void conectarBase() throws ClassNotFoundException, SQLException{
    
        try {
            //seleccionando el tipo de conexion de DBMS
            Class.forName(DRIVER);
            String urlBaseDeDatos="jdbc:mysql://localhost:3306/"+ DATABASE + "?useSSL=false";
            conexion=DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    
    }
    
    protected void desconectarBase(){
        try {
            
        } catch (Exception e) {
            throw e;
        }
    
    }
}
