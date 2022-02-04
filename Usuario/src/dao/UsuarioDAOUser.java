package dao;

import database.ConexaoUser;
import database.CriptografarUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.UsuarioUser;

/**
 *
 * @author ALlan Martins Da Silva
 */
public class UsuarioDAOUser {

    public static UsuarioUser buscarUsuarioPorId(int codigo) {
        UsuarioUser usuario = null;
        String sql = "SELECT usuarios, senha, nome, email FROM cidades WHERE id =?";

        ConexaoUser conexao = new ConexaoUser();
        try {

            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                usuario = new UsuarioUser();
                usuario.setId(codigo);
                usuario.setNome(resultSet.getString("nome"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setUsuario(resultSet.getString("usuario"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return usuario;
    }

    public static UsuarioUser realizarLogin(String usuario, String senha) {
        UsuarioUser user = null;
        String sql = "SELECT id,nome FROM usuarios WHERE usuario = ? AND senha = ?";
        try {
            PreparedStatement ps = ConexaoUser.conectar().prepareCall(sql);
            ps.setString(1, usuario);
            ps.setString(2, CriptografarUser.gerarHASH(senha));
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                user = new UsuarioUser();
                user.setId(resultSet.getInt("id"));
                user.setNome(resultSet.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexaoUser.desconectar();
        }
        return user;
    }

    public static UsuarioUser buscarUsuarioPorNome(String nome) {
        UsuarioUser user = null;
        String sql = "SELECT id,nome FROM usuarios WHERE nome LIKE ?";
        ConexaoUser conexao = new ConexaoUser();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                user = new UsuarioUser();
                user.setId(resultSet.getInt("id"));
                user.setNome(resultSet.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return user;
    }

    public static int inserir(UsuarioUser usuario) {
        String sql = "INSERT INTO usuarios (usuario, senha, nome, email) VALUES (?, ?, ?, ?);";
        ConexaoUser conexao = new ConexaoUser();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, CriptografarUser.gerarHASH(usuario.getSenha()));
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

    public static int alterar(UsuarioUser user) {
        ConexaoUser conexao = new ConexaoUser();
        try {
            String sql = "UPDATE usuarios SET nome = ?, usuario = ?, email = ?, senha = ? WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setString(1, user.getNome());
            ps.setString(2, user.getUsuario());
            ps.setString(3, user.getEmail());
            ps.setString(4, CriptografarUser.gerarHASH(user.getSenha()));
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

}
