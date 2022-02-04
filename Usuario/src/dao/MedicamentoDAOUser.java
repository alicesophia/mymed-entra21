package dao;

import database.ConexaoUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.MedicamentoUser;
import model.PaisUser;

/**
 *
 * @author Allan Martins Da Silva
 */
public class MedicamentoDAOUser {

    public static ArrayList<MedicamentoUser> resultadosDaPesquisa(String nome, PaisUser pais) {
        ArrayList<MedicamentoUser> medicamentos = new ArrayList<>();
        String sql = "SELECT id,nome,preco FROM medicamentos WHERE nome LIKE ? AND id_pais = ?";
        try {
            PreparedStatement ps = ConexaoUser.conectar().prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            ps.setInt(2, pais.getId());
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                MedicamentoUser medicamento = new MedicamentoUser();
                medicamento.setId(resultSet.getInt("id"));
                medicamento.setNome(resultSet.getString("nome"));
                medicamento.setPreco(resultSet.getFloat("preco"));
                medicamentos.add(medicamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            ConexaoUser.desconectar();
        }
        return medicamentos;
    }

    public static MedicamentoUser buscarMedicamentoPorId(int codigo) {
        MedicamentoUser medicamento = null;
        String sql = "SELECT id, nome, para_que_serve, contraindicacoes, armazenamento, preco,id_pais FROM medicamentos WHERE id = ?";
        ConexaoUser conexao = new ConexaoUser();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                medicamento = new MedicamentoUser();
                medicamento.setId(codigo);
                medicamento.setNome(resultSet.getString("nome"));
                medicamento.setParaQServe(resultSet.getString("para_que_serve"));
                medicamento.setContraIndicacoes(resultSet.getString("contraindicacoes"));
                medicamento.setArmazenamento(resultSet.getString("armazenamento"));
                medicamento.setPreco(resultSet.getFloat("preco"));
                medicamento.setPais(PaisDAOUser.buscarPaisPorId(resultSet.getInt("id_pais")));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            conexao.desconectar();
        }
        return medicamento;
    }

    public static List<MedicamentoUser> retornarMedicamentos() {
        List<MedicamentoUser> medicamentos = new ArrayList<>();
        String sql = "SELECT id, nome, para_que_serve, contraindicacoes, armazenamento, preco,id_pais FROM medicamentos";
        ConexaoUser conexao = new ConexaoUser();
        try {
            Statement st = conexao.conectar().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                MedicamentoUser medicamento = new MedicamentoUser();
                medicamento.setId(resultSet.getInt("id"));
                medicamento.setNome(resultSet.getString("nome"));
                medicamento.setParaQServe(resultSet.getString("para_que_serve"));
                medicamento.setContraIndicacoes(resultSet.getString("contraindicacoes"));
                medicamento.setArmazenamento(resultSet.getString("armazenamento"));
                medicamento.setPreco(resultSet.getFloat("preco"));
                medicamento.setPais(PaisDAOUser.buscarPaisPorId(resultSet.getInt("id_pais")));
                medicamentos.add(medicamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return medicamentos;
    }
}
