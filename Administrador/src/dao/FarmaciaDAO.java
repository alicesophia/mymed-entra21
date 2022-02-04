package dao;

import database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Farmacia;

/**
 *
 * @author Allan Martins Da Silva
 */
public class FarmaciaDAO {

    public static int posicao = 0;

    public static void excluir(int codigo) {
        Conexao conexao = new Conexao();
        try {
            String sql = "DELETE FROM farmacias WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        } finally {
            conexao.desconectar();
        }
    }

    public static int alterar(Farmacia farmacia) {
        Conexao conexao = new Conexao();
        try {
            String sql = "UPDATE farmacias SET nome = ?, logradouro = ?, telefone = ?, site = ?, id_cidade = ? WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setString(1, farmacia.getNome());
            ps.setString(2, farmacia.getLogradouro());
            ps.setString(3, farmacia.getTelefone());
            ps.setString(4, farmacia.getSite());
            ps.setInt(5, farmacia.getCidade().getId());
            ps.setInt(6, farmacia.getId());
            int resultado = ps.executeUpdate();
            return resultado;
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
            return 0;
        } finally {
            conexao.desconectar();
        }
    }

    public static int inserir(Farmacia farmacia) {
        String sql = "INSERT INTO farmacias (nome, logradouro, telefone, site, id_cidade) VALUES (?, ?, ?, ?, ?);";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, farmacia.getNome());
            ps.setString(2, farmacia.getLogradouro());
            ps.setString(3, farmacia.getTelefone());
            ps.setString(4, farmacia.getSite());
            ps.setInt(5, farmacia.getCidade().getId());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()) {
                int codigo = rs.getInt(1);
                return codigo;
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        } finally {
            conexao.desconectar();
        }
        return -1;
    }

    public static Farmacia buscarFarmaciaPorNome(String nome) {
        Farmacia farmacia = null;
        String sql = "SELECT id,nome FROM farmacias WHERE nome LIKE ?";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                farmacia = new Farmacia();
                farmacia.setId(resultSet.getInt("id"));
                farmacia.setNome(resultSet.getString("nome"));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            conexao.desconectar();
        }
        return farmacia;
    }

    public static Farmacia buscarFarmaciaPorId(int codigo) {
        Farmacia farmacia = null;
        String sql = "SELECT id, nome, logradouro, telefone, site, id_cidade FROM farmacias WHERE id = ?";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                farmacia = new Farmacia();
                farmacia.setId(codigo);
                farmacia.setNome(resultSet.getString("nome"));
                farmacia.setLogradouro(resultSet.getString("logradouro"));
                farmacia.setSite(resultSet.getString("site"));
                farmacia.setTelefone(resultSet.getString("telefone"));
                farmacia.setCidade(CidadeDAO.buscarCidadePorId(resultSet.getInt("id_cidade")));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            conexao.desconectar();
        }
        return farmacia;
    }

    public static List<Farmacia> retornarFarmacias() {
        List<Farmacia> farmacias = new ArrayList<>();
        String sql = "SELECT id, nome, logradouro, telefone, site, id_cidade FROM farmacias LIMIT ?,30";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, posicao);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                Farmacia farmacia = new Farmacia();
                farmacia.setId(resultSet.getInt("id"));
                farmacia.setNome(resultSet.getString("nome"));
                farmacia.setLogradouro(resultSet.getString("logradouro"));
                farmacia.setTelefone(resultSet.getString("telefone"));
                farmacia.setSite(resultSet.getString("site"));
                farmacia.setCidade(CidadeDAO.buscarCidadePorId(resultSet.getInt("id_cidade")));
                farmacias.add(farmacia);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            conexao.desconectar();
        }
        return farmacias;
    }

    public static List<Farmacia> retornarFarmaciasSemLimites() {
        List<Farmacia> farmacias = new ArrayList<>();
        String sql = "SELECT id, nome, logradouro, telefone, site, id_cidade FROM farmacias";
        Conexao conexao = new Conexao();
        try {
            Statement ps = conexao.conectar().createStatement();
            ps.execute(sql);
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                Farmacia farmacia = new Farmacia();
                farmacia.setId(resultSet.getInt("id"));
                farmacia.setNome(resultSet.getString("nome"));
                farmacia.setLogradouro(resultSet.getString("logradouro"));
                farmacia.setTelefone(resultSet.getString("telefone"));
                farmacia.setSite(resultSet.getString("site"));
                farmacia.setCidade(CidadeDAO.buscarCidadePorId(resultSet.getInt("id_cidade")));
                farmacias.add(farmacia);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            conexao.desconectar();
        }
        return farmacias;
    }

}
