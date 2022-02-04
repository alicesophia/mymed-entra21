package dao;

import database.ConexaoUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.PaisUser;

/**
 *
 * @author Allan Martins Da Silva
 */
public class PaisDAOUser {

    public static PaisUser buscarPaisPorNome(String nome) {
        PaisUser pais = null;
        String sql = "SELECT id,nome FROM paises WHERE nome LIKE ?";
        ConexaoUser conexao = new ConexaoUser();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                pais = new PaisUser();
                pais.setId(resultSet.getInt("id"));
                pais.setNome(resultSet.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return pais;
    }

    public static ArrayList<PaisUser> retornarPais() {
        ArrayList<PaisUser> paises = new ArrayList<>();
        String sql = "SELECT id,nome,sigla FROM paises";
        try {
            Statement st = ConexaoUser.conectar().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                PaisUser pais = new PaisUser();
                pais.setId(resultSet.getInt("id"));
                pais.setNome(resultSet.getString("nome"));
                pais.setSigla(resultSet.getString("sigla"));
                paises.add(pais);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexaoUser.desconectar();
        }
        return paises;
    }

    public static PaisUser buscarPaisPorId(int codigo) {
        PaisUser pais = null;
        String sql = "SELECT id,nome,sigla FROM paises WHERE id = ?";
        ConexaoUser conexao = new ConexaoUser();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                pais = new PaisUser();
                pais.setId(codigo);
                pais.setNome(resultSet.getString("nome"));
                pais.setSigla(resultSet.getString("sigla"));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            conexao.desconectar();
        }
        return pais;
    }
}
