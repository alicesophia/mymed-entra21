package dao;

import database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pais;

/**
 *
 * @author Allan Martins Da Silva
 */
public class PaisDAO {

    public static int posicao = 0;

    public static void excluir(int codigo) {
        Conexao conexao = new Conexao();
        try {
            String sql = "DELETE FROM paises WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        } finally {
            conexao.desconectar();
        }
    }

    public static int alterar(Pais pais) {
        Conexao conexao = new Conexao();
        try {
            String sql = "UPDATE paises SET nome = ?, sigla = ? WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setString(1, pais.getNome());
            ps.setString(2, pais.getSigla());
            ps.setInt(3, pais.getId());
            int resultado = ps.executeUpdate();
            return resultado;
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
            return 0;
        } finally {
            conexao.desconectar();
        }
    }

    public static int inserir(Pais pais) {
        String sql = "INSERT INTO paises (nome, sigla) VALUES (?, ?);";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pais.getNome());
            ps.setString(2, pais.getSigla());
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

    public static Pais buscarPaisPorNome(String nome) {
        Pais pais = null;
        String sql = "SELECT id,nome FROM paises WHERE nome LIKE ?";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                pais = new Pais();
                pais.setId(resultSet.getInt("id"));
                pais.setNome(resultSet.getString("nome"));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            conexao.desconectar();
        }
        return pais;
    }

    public static Pais buscarPaisPorId(int codigo) {
        Pais pais = null;
        String sql = "SELECT id,nome,sigla FROM paises WHERE id = ?";
        try {
            PreparedStatement ps = Conexao.conectar().prepareCall(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                pais = new Pais();
                pais.setId(codigo);
                pais.setNome(resultSet.getString("nome"));
                pais.setSigla(resultSet.getString("sigla"));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            Conexao.desconectar();
        }
        return pais;
    }

    public static List<Pais> retornarPais() {
        List<Pais> paises = new ArrayList<>();
        String sql = "SELECT id,nome,sigla FROM paises LIMIT ?,30";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, posicao);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                Pais pais = new Pais();
                pais.setId(resultSet.getInt("id"));
                pais.setNome(resultSet.getString("nome"));
                pais.setSigla(resultSet.getString("sigla"));
                paises.add(pais);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return paises;
    }

    public static List<Pais> retornarPaisSemLimites() {
        List<Pais> paises = new ArrayList<>();
        String sql = "SELECT id,nome,sigla FROM paises";
        Conexao conexao = new Conexao();
        try {
            Statement ps = conexao.conectar().createStatement();
            ps.execute(sql);
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                Pais pais = new Pais();
                pais.setId(resultSet.getInt("id"));
                pais.setNome(resultSet.getString("nome"));
                pais.setSigla(resultSet.getString("sigla"));
                paises.add(pais);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return paises;
    }
}
