package Conection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public Connection getConnection()throws SQLException, ClassNotFoundException{
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://143.106.241.1:3306/cl16253";
        String usuario = "cl16253";
        String senha = "cl*22082001";
        
        try{
            Class.forName(driver);
            return (Connection) DriverManager.getConnection (url, usuario, senha);
        }catch (SQLException ex){
            throw new RuntimeException("Erro de Conexão: ", ex);
        }
        
    }
    
}
