package dao;

import database.Conexao;
import database.Criptografar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Allan Martins Da Silva
 */
public class UsuarioDAO {

    public static int posicao = 0;

    public static void excluir(int codigo) {
        Conexao conexao = new Conexao();
        try {
            String sql = "DELETE FROM usuarios WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        } finally {
            conexao.desconectar();
        }
    }

    public static int alterar(Usuario user) {
        Conexao conexao = new Conexao();
        try {
            String sql = "UPDATE usuarios SET nome = ?, usuario = ?, email = ?, senha = ? WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setString(1, user.getNome());
            ps.setString(2, user.getUsuario());
            ps.setString(3, user.getEmail());
            ps.setString(4, Criptografar.gerarHASH(user.getSenha()));
            ps.setInt(5, user.getId());
            int resultado = ps.executeUpdate();
            return resultado;
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
            return 0;
        } finally {
            conexao.desconectar();
        }
    }

    public static int inserir(Usuario usuario) {
        String sql = "INSERT INTO usuarios (usuario, senha, nome, email) VALUES (?, ?, ?, ?);";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, Criptografar.gerarHASH(usuario.getSenha()));
            ps.setString(3, usuario.getNome());
            ps.setString(4, usuario.getEmail());
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

    public static Usuario buscarUsuarioPorId(int codigo) {

        Usuario usuario = null;
        String sql = "SELECT usuario, senha, nome, email FROM usuarios WHERE id =?";

        Conexao conexao = new Conexao();
        try {

            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                usuario = new Usuario();
                usuario.setId(codigo);
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setUsuario(resultSet.getString("usuario"));

            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            conexao.desconectar();
        }
        return usuario;
    }

    public static Usuario buscarUsuarioPorNome(String nome) {
        Usuario user = null;
        String sql = "SELECT id,nome FROM usuarios WHERE nome LIKE ?";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                user = new Usuario();
                user.setId(resultSet.getInt("id"));
                user.setNome(resultSet.getString("nome"));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            conexao.desconectar();
        }
        return user;
    }

    public static List<Usuario> retornarUsuario() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT id,usuario,senha,nome,email FROM usuarios LIMIT ?,30";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, posicao);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultSet.getInt("id"));
                usuario.setNome(resultSet.getString("nome"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setUsuario(resultSet.getString("usuario"));
                usuario.setEmail(resultSet.getString("email"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return usuarios;
    }

    public static Usuario realizarLogin(String usuario, String senha) {
        String sql = "SELECT id FROM usuarios WHERE usuario = ? AND senha = ?";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, Criptografar.gerarHASH(senha));
            ps.execute();
            ResultSet rs = ps.getResultSet();
            if (rs.next()) {
                return buscarUsuarioPorId(rs.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return null;
    }

}
