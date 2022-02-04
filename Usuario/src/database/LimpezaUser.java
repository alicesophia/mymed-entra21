package database;

import java.sql.SQLException;
import java.sql.Statement;

/**
* @author Allan Martins Da Silva
 */
public class LimpezaUser {

    public static void truncateTabelas() {
        ConexaoUser conexao = new ConexaoUser();
        try {
            Statement st = conexao.conectar().createStatement();
            st.addBatch("SET FOREIGN_KEY_CHECKS = 0");
            st.addBatch("TRUNCATE TABLE usuarios;");
            st.addBatch("TRUNCATE TABLE paises;");
            st.addBatch("TRUNCATE TABLE cidades;");
            st.addBatch("TRUNCATE TABLE farmacias;");
            st.addBatch("TRUNCATE TABLE medicamentos;");
            st.addBatch("TRUNCATE TABLE medicamentos_internacionais;");
            st.addBatch("SET FOREIGN_KEY_CHECKS = 1");
            st.executeBatch();
        } catch (SQLException sqle) {
            System.err.println(sqle.getMessage());

        } finally {
            conexao.desconectar();
        }
    }
}
