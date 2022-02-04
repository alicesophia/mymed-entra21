package dao;

import database.ConexaoUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.CidadeUser;
import model.FarmaciaUser;

/**
 *
 * @author Allan Martins Da Silva
 */
public class FarmaciaDAOUser {

    public static ArrayList<FarmaciaUser> resultadosDaPesquisaCidade(int codigo) {
        ArrayList<FarmaciaUser> farmacias = new ArrayList<>();
        String sql = "SELECT id, nome, logradouro, telefone, site, id_cidade FROM farmacias WHERE id_cidade = ?";
        try {
            PreparedStatement ps = ConexaoUser.conectar().prepareCall(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                FarmaciaUser farmacia = new FarmaciaUser();
                farmacia.setId(resultSet.getInt("id"));
                farmacia.setNome(resultSet.getString("nome"));
                farmacia.setLogradouro(resultSet.getString("logradouro"));
                farmacia.setTelefone(resultSet.getString("telefone"));
                farmacia.setSite(resultSet.getString("site"));
                farmacia.setCidade((CidadeDAOUser.buscarCidadePorId(resultSet.getInt("id_cidade"))));
                farmacias.add(farmacia);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            ConexaoUser.desconectar();
        }
        return farmacias;
    }

    public static ArrayList<FarmaciaUser> resultadosDaPesquisa(String nome, int idCidade) {
        ArrayList<FarmaciaUser> farmacias = new ArrayList<>();
        String sql = "SELECT id, nome, logradouro, telefone, site, id_cidade FROM farmacias WHERE nome LIKE ?";
        try {
            PreparedStatement ps = ConexaoUser.conectar().prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                FarmaciaUser farmacia = new FarmaciaUser();
                farmacia.setId(resultSet.getInt("id"));
                farmacia.setNome(resultSet.getString("nome"));
                farmacia.setLogradouro(resultSet.getString("logradouro"));
                farmacia.setTelefone(resultSet.getString("telefone"));
                farmacia.setSite(resultSet.getString("site"));
                farmacia.setCidade((CidadeDAOUser.buscarCidadePorId(resultSet.getInt("id_cidade"))));
                farmacias.add(farmacia);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            ConexaoUser.desconectar();
        }
        return farmacias;
    }

    public static FarmaciaUser buscarFarmaciaPorNome(String nome) {
        FarmaciaUser farmacia = null;
        String sql = "SELECT id,nome FROM farmacias WHERE nome LIKE ?";
        ConexaoUser conexao = new ConexaoUser();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                farmacia = new FarmaciaUser();
                farmacia.setId(resultSet.getInt("id"));
                farmacia.setNome(resultSet.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            conexao.desconectar();
        }
        return farmacia;
    }

    public static FarmaciaUser buscarFarmaciaPorId(int codigo) {
        FarmaciaUser farmacia = null;
        String sql = "SELECT id, nome, logradouro, telefone, site, id_cidade FROM farmacias WHERE id = ?";
        ConexaoUser conexao = new ConexaoUser();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                farmacia = new FarmaciaUser();
                farmacia.setId(codigo);
                farmacia.setNome(resultSet.getString("nome"));
                farmacia.setLogradouro(resultSet.getString("logradouro"));
                farmacia.setSite(resultSet.getString("site"));
                farmacia.setTelefone(resultSet.getString("telefone"));
                farmacia.setCidade(CidadeDAOUser.buscarCidadePorId(resultSet.getInt("id_cidade")));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            conexao.desconectar();
        }
        return farmacia;
    }

    public static List<FarmaciaUser> retornarFarmacias() {
        List<FarmaciaUser> farmacias = new ArrayList<>();
        String sql = "SELECT id, nome, logradouro, telefone, site, id_cidade FROM farmacias";
        ConexaoUser conexao = new ConexaoUser();
        try {
            Statement st = conexao.conectar().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                FarmaciaUser farmacia = new FarmaciaUser();
                farmacia.setId(resultSet.getInt("id"));
                farmacia.setNome(resultSet.getString("nome"));
                farmacia.setLogradouro(resultSet.getString("logradouro"));
                farmacia.setTelefone(resultSet.getString("telefone"));
                farmacia.setSite(resultSet.getString("site"));
                farmacia.setCidade(CidadeDAOUser.buscarCidadePorId(resultSet.getInt("id_cidade")));
                farmacias.add(farmacia);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return farmacias;
    }

}
