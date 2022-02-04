
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
import model.Administrador;

/**
 *
 * @author Allan Martins Da Silva
 */
public class AdministradorDAO {
    public static int posicao = 0;
    public static void excluir(int codigo) {
        Conexao conexao = new Conexao();
        try {
            String sql = "DELETE FROM administradores WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        } finally {
            conexao.desconectar();
        }
    }

    public static int alterar(Administrador admin) {
        Conexao conexao = new Conexao();
        try {
            String sql = "UPDATE administradores SET usuario = ?, senha = ?, nome = ? WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setString(1, admin.getUsuario());
            ps.setString(2, Criptografar.gerarHASH(admin.getSenha()));
            ps.setString(3, admin.getNome());
            ps.setInt(4, admin.getId());
            int resultado = ps.executeUpdate();
            return resultado;
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
            return 0;
        } finally {
            conexao.desconectar();
        }
    }

    public static int inserir(Administrador admin) {
        String sql = "INSERT INTO administradores (usuario, senha, nome) VALUES (?, ?, ?);";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, admin.getUsuario());
            ps.setString(2, Criptografar.gerarHASH(admin.getSenha()));
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
            conexao.desconectar();
        }
        return -1;
    }
    
    public static Administrador buscarAdminPorId(int codigo) {
    Administrador admin = null;
    String sql = "SELECT id,nome,usuario,senha FROM administradores WHERE id = ?";
    Conexao conexao = new Conexao();
    try {
        PreparedStatement ps = conexao.conectar().prepareCall(sql);
        ps.setInt(1,codigo);
        ps.execute();
        ResultSet resultSet = ps.getResultSet();
        while (resultSet.next()) {
            admin = new Administrador();
            admin.setId(resultSet.getInt("id"));
            admin.setNome(resultSet.getString("nome"));
            admin.setUsuario(resultSet.getString("usuario"));
            admin.setSenha(resultSet.getString("senha"));
        }
    } catch (SQLException sqle) {
        JOptionPane.showMessageDialog(null, sqle.getMessage());

    } finally {
        conexao.desconectar();
    }
    return admin;
    }
    
    public static Administrador buscarAdminPorNome(String nome) {
    Administrador admin = null;
    String sql = "SELECT id,nome FROM administradores WHERE nome LIKE ?";
    Conexao conexao = new Conexao();
    try {
        PreparedStatement ps = conexao.conectar().prepareCall(sql);
        ps.setString(1, "%" + nome + "%");
        ps.execute();
        ResultSet resultSet = ps.getResultSet();
        while (resultSet.next()) {
            admin = new Administrador();
            admin.setId(resultSet.getInt("id"));
            admin.setNome(resultSet.getString("nome"));
        }
    } catch (SQLException sqle) {
        JOptionPane.showMessageDialog(null, sqle.getMessage());

    } finally {
        conexao.desconectar();
    }
    return admin;
    }
    
    public static List<Administrador> retornarAdmins(){
        List<Administrador> admins = new ArrayList<>();
        String sql = "SELECT id,nome,usuario,senha FROM administradores LIMIT ?,30";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, posicao);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while(resultSet.next()){
                Administrador administrador = new Administrador();
                administrador.setId(resultSet.getInt("id"));
                administrador.setNome(resultSet.getString("nome"));
                administrador.setUsuario(resultSet.getString("usuario"));
                administrador.setSenha(resultSet.getString("senha"));
                admins.add(administrador);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            conexao.desconectar();
        }
        return admins;
    }
    
    
}
