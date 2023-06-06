package conndb;

import java.sql.*;

public class ConnDB {
    
    public static void main(String[] args) {
        Connection conexion = null;
        Statement sentencia = null;
        
        try{
            //CARGAR DRIVER
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            //CONEXION DB
            String url = "jdbc:sqlserver://localhost:1433;databaseName=DB_HOTELMANAGEMENT";
            conexion = DriverManager.getConnection(url, "SA", "reallyStrongPwd123");
            
            //PREPARAR EL OBJETO TIPO STATEMENT
            sentencia = conexion.createStatement();
            
            //EJECUTAR CONSULTA
            String consulta = "SELECT nombre, documento FROM CLIENTE";
            ResultSet resultado = sentencia.executeQuery(consulta);
            
            //MOSTRANDO RESULTADOS
            while(resultado.next()){
                String nombre = resultado.getString("nombre");
                String documento = resultado.getString("documento");
                System.out.println( nombre + " - " + documento );
            }
        }catch(ClassNotFoundException e){
            System.out.println("Driver no encontrado");
        }catch(SQLException sqle){
            System.out.println("Problemas de conexion");
        }
    }
    
}
