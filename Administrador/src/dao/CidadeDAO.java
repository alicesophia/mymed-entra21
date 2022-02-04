package dao;

import database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cidade;

/**
 *
 * @author Allan Martins Da Silva
 */
public class CidadeDAO {

    public static int posicao = 0;

    public static void excluir(int codigo) {
        Conexao conexao = new Conexao();
        try {
            String sql = "DELETE FROM cidades WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        } finally {
            conexao.desconectar();
        }
    }

    public static int alterar(Cidade cidade) {
        Conexao conexao = new Conexao();
        try {
            String sql = "UPDATE cidades SET id_pais = ?, nome = ? WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, cidade.getPais().getId());
            ps.setString(2, cidade.getNome());
            ps.setInt(3, cidade.getId());
            int resultado = ps.executeUpdate();
            return resultado;
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
            return 0;
        } finally {
            conexao.desconectar();
        }
    }

    public static int inserir(Cidade cidade) {
        String sql = "INSERT INTO cidades (nome, id_pais) VALUES (?, ?);";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cidade.getNome());
            ps.setInt(2, cidade.getPais().getId());
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

    public static Cidade buscarCidadePorNome(String nome) {

        Cidade cidade = null;
        String sql = "SELECT id,nome FROM cidades WHERE nome LIKE ?";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                cidade = new Cidade();
                cidade.setId(resultSet.getInt("id"));
                cidade.setNome(resultSet.getString("nome"));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            conexao.desconectar();
        }
        return cidade;
    }

    public static Cidade buscarCidadePorId(int codigo) {
        Cidade cidade = null;
        String sql = "SELECT id, nome,id_pais FROM cidades WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.conectar().prepareCall(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                cidade = new Cidade();
                cidade.setId(codigo);
                cidade.setNome(resultSet.getString("nome"));
                cidade.setPais(PaisDAO.buscarPaisPorId(resultSet.getInt("id_pais")));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            Conexao.desconectar();
        }
        return cidade;
    }

    public static ArrayList<Cidade> retornarCidades() {
        ArrayList<Cidade> cidades = new ArrayList<>();
        String sql = "SELECT id,nome,id_pais FROM cidades LIMIT ?,30";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, posicao);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                Cidade cidade = new Cidade();
                cidade.setId(resultSet.getInt("id"));
                cidade.setNome(resultSet.getString("nome"));
                cidade.setPais(PaisDAO.buscarPaisPorId(resultSet.getInt("id_pais")));
                cidades.add(cidade);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return cidades;
    }

    public static ArrayList<Cidade> retornarCidadesSemLimite() {
        ArrayList<Cidade> cidades = new ArrayList<>();
        String sql = "SELECT id,nome,id_pais FROM cidades";
        Conexao conexao = new Conexao();
        try {
            Statement ps = conexao.conectar().createStatement();
            ps.execute(sql);
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                Cidade cidade = new Cidade();
                cidade.setId(resultSet.getInt("id"));
                cidade.setNome(resultSet.getString("nome"));
                cidade.setPais(PaisDAO.buscarPaisPorId(resultSet.getInt("id_pais")));
                cidades.add(cidade);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return cidades;
    }
}
