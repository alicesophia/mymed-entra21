package dao;

import database.ConexaoUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.FavoritoUser;
import model.MedicamentoUser;

/**
 *
 * @author Allan Martins Da Silva
 */
public class FavoritosDAOUser {

    public static int inserir(FavoritoUser favoritos) {
        String sql = "INSERT INTO favoritos (id_usuario, id_medicamento) VALUES (?,?);";
        try {
            PreparedStatement ps = ConexaoUser.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(2, favoritos.getIdUsuario().getId());
            ps.setInt(1, favoritos.getIdMedicamento().getId());
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

    public static List<MedicamentoUser> retornarFavoritosPorUsuario(int codigoUsuario) {
        ArrayList<MedicamentoUser> medicamentos = new ArrayList<>();
        String sql = "SELECT id, id_medicamento, id_usuario FROM favoritos WHERE id_usuario = ?";
        try {
            PreparedStatement ps = ConexaoUser.conectar().prepareStatement(sql);
            ps.setInt(1, codigoUsuario);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                MedicamentoUser medicamento = MedicamentoDAOUser.buscarMedicamentoPorId(resultSet.getInt("id_medicamento"));
                medicamentos.add(medicamento);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConexaoUser.desconectar();
        }
        return medicamentos;
    }

    public static FavoritoUser buscarFavoritoPorId(int codigo) {
        FavoritoUser favorito = null;
        String sql = "SELECT id,id_usuario,id_medicamento FROM favoritos WHERE id = ?";
        try {
            PreparedStatement ps = ConexaoUser.conectar().prepareCall(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                favorito = new FavoritoUser();
                favorito.setId(codigo);
                favorito.setIdUsuario(UsuarioDAOUser.buscarUsuarioPorId(resultSet.getInt("id_usuario")));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            ConexaoUser.desconectar();
        }
        return favorito;
    }

}
