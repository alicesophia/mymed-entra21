package database;

import java.sql.SQLException;
import java.sql.Statement;

/**
* @author Allan Martins Da Silva
 */
public class Limpeza {

    public static void truncateTabelas() {
        Conexao conexao = new Conexao();
        try {
            Statement st = conexao.conectar().createStatement();
            st.addBatch("SET FOREIGN_KEY_CHECKS = 0");
            st.addBatch("TRUNCATE TABLE administradores;");
            st.addBatch("TRUNCATE TABLE usuarios;");
            st.addBatch("TRUNCATE TABLE paises;");
            st.addBatch("TRUNCATE TABLE cidades;");
            st.addBatch("TRUNCATE TABLE farmacias;");
            st.addBatch("TRUNCATE TABLE nomes_comercias;");
            st.addBatch("TRUNCATE TABLE medicamentos;");
            st.addBatch("TRUNCATE TABLE medicamento_internacionais;");
            st.addBatch("SET FOREIGN_KEY_CHECKS = 1");
            st.executeBatch();
        } catch (SQLException sqle) {
            System.err.println(sqle.getMessage());

        } finally {
            conexao.desconectar();
        }
    }
}
