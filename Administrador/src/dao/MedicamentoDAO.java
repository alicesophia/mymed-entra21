package dao;

import database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Medicamento;
import model.Pais;

/**
 *
 * @author Allan Martins Da Silva
 */
public class MedicamentoDAO {

    public static int posicao = 0;

    public static void excluir(int codigo) {
        Conexao conexao = new Conexao();
        try {
            String sql = "DELETE FROM medicamentos WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        } finally {
            conexao.desconectar();
        }
    }

    public static int alterar(Medicamento medicamento) {
        Conexao conexao = new Conexao();
        try {
            String sql = "UPDATE medicamentos SET nome = ?, para_que_serve = ?, contraindicacoes = ?, armazenamento = ?, preco = ?, id_pais = ? WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setString(1, medicamento.getNome());
            ps.setString(2, medicamento.getParaQServe());
            ps.setString(3, medicamento.getContraIndicacoes());
            ps.setString(4, medicamento.getArmazenamento());
            ps.setFloat(5, medicamento.getPreco());
            ps.setInt(6, medicamento.getPais().getId());
            ps.setInt(7, medicamento.getId());
            int resultado = ps.executeUpdate();
            return resultado;
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
            return 0;
        } finally {
            conexao.desconectar();
        }
    }

    public static int inserir(Medicamento medicamento) {
        String sql = "INSERT INTO medicamentos (nome, para_que_serve, contraindicacoes, armazenamento, preco,id_pais) VALUES (?,?,?,?,?,?);";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, medicamento.getNome());
            ps.setString(2, medicamento.getParaQServe());
            ps.setString(3, medicamento.getContraIndicacoes());
            ps.setString(4, medicamento.getArmazenamento());
            ps.setFloat(5, medicamento.getPreco());
            ps.setInt(6, medicamento.getPais().getId());
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

    public static Medicamento buscarMedicamentoPorNome(String nome) {
        Medicamento medicamento = null;
        String sql = "SELECT id,nome FROM medicamentos WHERE nome LIKE ?";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                medicamento = new Medicamento();
                medicamento.setId(resultSet.getInt("id"));
                medicamento.setNome(resultSet.getString("nome"));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            conexao.desconectar();
        }
        return medicamento;
    }

    public static Medicamento buscarMedicamentoPorId(int codigo) {
        Medicamento medicamento = null;
        String sql = "SELECT id, nome, para_que_serve, contraindicacoes, armazenamento, preco,id_pais FROM medicamentos WHERE id = ?";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                medicamento = new Medicamento();
                medicamento.setId(codigo);
                medicamento.setNome(resultSet.getString("nome"));
                medicamento.setParaQServe(resultSet.getString("para_que_serve"));
                medicamento.setContraIndicacoes(resultSet.getString("contraindicacoes"));
                medicamento.setArmazenamento(resultSet.getString("armazenamento"));
                medicamento.setPreco(resultSet.getFloat("preco"));
                medicamento.setPais(PaisDAO.buscarPaisPorId(resultSet.getInt("id_pais")));
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            conexao.desconectar();
        }
        return medicamento;
    }

    public static List<Medicamento> retornarMedicamentos() {
        List<Medicamento> medicamentos = new ArrayList<>();
        String sql = "SELECT id, nome, para_que_serve, contraindicacoes, armazenamento, preco,id_pais FROM medicamentos LIMIT ?,30";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, posicao);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                Medicamento medicamento = new Medicamento();
                medicamento.setId(resultSet.getInt("id"));
                medicamento.setNome(resultSet.getString("nome"));
                medicamento.setParaQServe(resultSet.getString("para_que_serve"));
                medicamento.setContraIndicacoes(resultSet.getString("contraindicacoes"));
                medicamento.setArmazenamento(resultSet.getString("armazenamento"));
                medicamento.setPreco(resultSet.getFloat("preco"));
                medicamento.setPais(PaisDAO.buscarPaisPorId(resultSet.getInt("id_pais")));
                medicamentos.add(medicamento);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            conexao.desconectar();
        }
        return medicamentos;
    }

    public static ArrayList<Medicamento> listarMedicamentos(int idPais) {
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        String sql = "SELECT nome, id FROM medicamentos WHERE id_pais = ?";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setInt(1, idPais);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                Medicamento medicamento = new Medicamento();
                medicamento.setId(resultSet.getInt("id"));
                medicamento.setNome(resultSet.getString("nome"));
                medicamentos.add(medicamento);
            }
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());

        } finally {
            conexao.desconectar();
        }
        return medicamentos;
    }
    
    public static List<Medicamento> retornarMedicamentoSemLimites() {
        List<Medicamento> medicamentos = new ArrayList<>();
        String sql = "SELECT id, nome, preco, id_pais FROM medicamentos";
        Conexao conexao = new Conexao();
        try {
            Statement ps = conexao.conectar().createStatement();
            ps.execute(sql);
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                Medicamento medicamento = new Medicamento();
                medicamento.setId(resultSet.getInt("id"));
                medicamento.setNome(resultSet.getString("nome"));
                medicamento.setPreco(resultSet.getFloat("preco"));
                medicamento.setPais(PaisDAO.buscarPaisPorId(resultSet.getInt("id_pais")));
                medicamentos.add(medicamento);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conexao.desconectar();
        }
        return medicamentos;
    }

}
