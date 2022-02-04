
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan Martins Da Silva
 */
public class ConexaoUser {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String HOST = "jdbc:mysql://localhost/buscador_medicamentos";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static Connection conexao;

    public static Connection conectar() {
        try {
           Properties properties = new Properties();
            properties.setProperty("user", USUARIO);
            properties.setProperty("password", SENHA);

            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(HOST, properties);
            return conexao;
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            return null;
        }
    }
    public static void desconectar(){
        if(conexao != null){
            try{
                conexao.close();
            } catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
