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
import model.MedicamentoInternacional;

/**
 *
 * @author Mario Schwabe Filho
 */
public class MedicamentoInternacionalDAO {
    public static int posicao = 0;
    public static void excluir(int codigo) {
        Conexao conexao = new Conexao();
        try {
            String sql = "DELETE FROM medicamentos_internacionais WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        } finally {
            conexao.desconectar();
        }
    }

    public static int alterar(MedicamentoInternacional medicamentoInternacional) {
        Conexao conexao = new Conexao();
        try {
            String sql = "UPDATE medicamentos_internacionais SET id_origem = ?, id_destino = ? WHERE id = ?";

            PreparedStatement ps = conexao.conectar().prepareStatement(sql);
            ps.setInt(1, medicamentoInternacional.getMedicamentoOrigem().getId());
            ps.setInt(2, medicamentoInternacional.getMedicamentoDestino().getId());
            ps.setInt(3, medicamentoInternacional.getId());
            int resultado = ps.executeUpdate();
            return resultado;
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
            return 0;
        } finally {
            conexao.desconectar();
        }
    }

    public static int inserir(Medicamento medicamentoOrigem, Medicamento medicamentoDestino) {
        String sql = "INSERT INTO medicamentos_internacionais (id_origem, id_destino) VALUES (?,?);";
        Conexao conexao = new Conexao();
        try {
            PreparedStatement ps = conexao.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, medicamentoOrigem.getId());
            ps.setInt(2, medicamentoDestino.getId());
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
    
    public static MedicamentoInternacional buscarMedicamentoInternacionalPorId(int codigo) {
    MedicamentoInternacional medicamentoInternacional = null;
    String sql = "SELECT id, id_origem, id_destino FROM medicamentos_internacionais WHERE id = ?";
    Conexao conexao = new Conexao();
    try {
        PreparedStatement ps = conexao.conectar().prepareCall(sql);
        ps.setInt(1, codigo);
        ps.execute();
        ResultSet resultSet = ps.getResultSet();
        while (resultSet.next()) {
            medicamentoInternacional = new MedicamentoInternacional();
            medicamentoInternacional.setId(codigo);
            medicamentoInternacional.setMedicamentoOrigem(MedicamentoDAO.buscarMedicamentoPorId(resultSet.getInt("id_origem")));
            medicamentoInternacional.setMedicamentoDestino(MedicamentoDAO.buscarMedicamentoPorId(resultSet.getInt("id_destino")));
        }
    } catch (SQLException sqle) {
        JOptionPane.showMessageDialog(null, sqle.getMessage());

    } finally {
        conexao.desconectar();
    }
    return medicamentoInternacional;
    }
    
    public static List<MedicamentoInternacional> retornarMedicamentosInternacionais(){
    List<MedicamentoInternacional> medicamentosInternacionais = new ArrayList<>();
    String sql = "SELECT id, id_origem, id_destino FROM medicamentos_internacionais LIMIT ?,30";
    Conexao conexao = new Conexao();
    try {
        PreparedStatement ps = conexao.conectar().prepareStatement(sql);
        ps.setInt(1, posicao);
        ps.execute();
        ResultSet resultSet = ps.getResultSet();
        while(resultSet.next()){
            MedicamentoInternacional medicamentoInternacional = new MedicamentoInternacional();
            medicamentoInternacional.setId(resultSet.getInt("id"));
            medicamentoInternacional.setMedicamentoOrigem(MedicamentoDAO.buscarMedicamentoPorId(resultSet.getInt("id_origem")));
            medicamentoInternacional.setMedicamentoDestino(MedicamentoDAO.buscarMedicamentoPorId(resultSet.getInt("id_destino")));
            medicamentosInternacionais.add(medicamentoInternacional);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());  
    }finally{
        conexao.desconectar();
    }
        return medicamentosInternacionais;
    }
}
