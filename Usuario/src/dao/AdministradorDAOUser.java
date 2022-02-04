package dao;

import database.ConexaoUser;
import database.CriptografarUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.AdministradorUser;

/**
 *
 * @author Allan Martins Da Silva
 */
public class AdministradorDAOUser {

    public static int posicao = 0;

    public static AdministradorUser realizarLogin(String usuario, String senha) {
        AdministradorUser admin = null;
        String sql = "SELECT id,nome FROM administradores WHERE usuario = ? AND senha = ?";
        try {
            PreparedStatement ps = ConexaoUser.conectar().prepareCall(sql);
            ps.setString(1, usuario);
            ps.setString(2, CriptografarUser.gerarHASH(senha));
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                admin = new AdministradorUser();
                admin.setId(resultSet.getInt("id"));
                admin.setNome(resultSet.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexaoUser.desconectar();
        }
        return admin;
    }

    public static void excluir(int codigo) {
        try {
            String sql = "DELETE FROM administradores WHERE id = ?";
            PreparedStatement ps = ConexaoUser.conectar().prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        } finally {
            ConexaoUser.desconectar();
        }
    }

    public static int alterar(AdministradorUser admin) {
        try {
            String sql = "UPDATE administradores SET usuario = ?, senha = ?, nome = ? WHERE id = ?";
            PreparedStatement ps = ConexaoUser.conectar().prepareStatement(sql);
            ps.setString(1, admin.getUsuario());
            ps.setString(2, CriptografarUser.gerarHASH(admin.getSenha()));
            ps.setString(3, admin.getNome());
            ps.setInt(4, admin.getId());
            int resultado = ps.executeUpdate();
            return resultado;
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
            return 0;
        } finally {
            ConexaoUser.desconectar();
        }
    }

    public static int inserir(AdministradorUser admin) {
        String sql = "INSERT INTO administradores (usuario, senha, nome) VALUES (?, ?, ?);";
        try {
            PreparedStatement ps = ConexaoUser.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, admin.getUsuario());
            ps.setString(2, CriptografarUser.gerarHASH(admin.getSenha()));
            ps.setString(3, admin.getNome());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()) {
                int codigo = rs.getInt(1);
                return codigo;
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        } finally {
            ConexaoUser.desconectar();
        }
        return -1;
    }

    public static AdministradorUser buscarAdminPorId(int codigo) {
        AdministradorUser admin = null;
        String sql = "SELECT id,nome,usuario,senha FROM administradores WHERE id = ?";
        try {
            PreparedStatement ps = ConexaoUser.conectar().prepareCall(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                admin = new AdministradorUser();
                admin.setId(resultSet.getInt("id"));
                admin.setNome(resultSet.getString("nome"));
                admin.setUsuario(resultSet.getString("usuario"));
                admin.setSenha(resultSet.getString("senha"));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            ConexaoUser.desconectar();
        }
        return admin;
    }

    public static AdministradorUser buscarAdminPorNome(String nome) {
        AdministradorUser admin = null;
        String sql = "SELECT id,nome FROM administradores WHERE nome LIKE ?";
        try {
            PreparedStatement ps = ConexaoUser.conectar().prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                admin = new AdministradorUser();
                admin.setId(resultSet.getInt("id"));
                admin.setNome(resultSet.getString("nome"));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            ConexaoUser.desconectar();
        }
        return admin;
    }

    public static List<AdministradorUser> retornarAdmins() {
        List<AdministradorUser> admins = new ArrayList<>();
        String sql = "SELECT id,nome,usuario,senha FROM administradores LIMIT ?,30";
        try {
            PreparedStatement ps = ConexaoUser.conectar().prepareStatement(sql);
            ps.setInt(1, posicao);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                AdministradorUser administrador = new AdministradorUser();
                administrador.setId(resultSet.getInt("id"));
                administrador.setNome(resultSet.getString("nome"));
                administrador.setUsuario(resultSet.getString("usuario"));
                administrador.setSenha(resultSet.getString("senha"));
                admins.add(administrador);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConexaoUser.desconectar();
        }
        return admins;
    }

}
