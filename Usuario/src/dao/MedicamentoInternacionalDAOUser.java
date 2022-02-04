package dao;

import database.ConexaoUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.MedicamentoUser;
import model.PaisUser;

/**
 *
 * @author Mario Schwabe Filho
 */
public class MedicamentoInternacionalDAOUser {

    public static int idOrigem, idDestino;
    public static String nomeMedicamento;

    public static ArrayList<MedicamentoUser> buscarMedicamentosInternacionais(PaisUser paisOrigem, PaisUser paisDestino, String nomeMedicamento) {
        ArrayList<MedicamentoUser> medicamentos = new ArrayList<>();
        String sql = "SELECT mo.nome as origem_nome, md.preco as preco, md.id as destino_id, md.nome as destino_nome FROM medicamentos_internacionais mi \n"
                + "JOIN medicamentos mo ON (mi.id_origem = mo.id)\n"
                + "JOIN medicamentos md ON (mi.id_destino = md.id) \n"
                + "WHERE mo.id_pais = ? AND md.id_pais = ? AND mo.nome LIKE ?";
        ConexaoUser conexao = new ConexaoUser();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, paisOrigem.getId());
            ps.setInt(2, paisDestino.getId());
            ps.setString(3, "%" + nomeMedicamento + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                MedicamentoUser medicamento = new MedicamentoUser();
                medicamento.setId(resultSet.getInt("destino_id"));
                medicamento.setParaQServe(resultSet.getString("origem_nome"));
                medicamento.setNome(resultSet.getString("destino_nome"));
                medicamento.setPreco(resultSet.getFloat("preco"));
                medicamentos.add(medicamento);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            conexao.desconectar();
        }
        return medicamentos;
    }
}