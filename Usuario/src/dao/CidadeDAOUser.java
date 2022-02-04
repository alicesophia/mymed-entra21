package dao;

import database.ConexaoUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.CidadeUser;
import model.PaisUser;

/**
 *
 * @author Allan Martins Da Silva
 */
public class CidadeDAOUser {

    public static String nome;
    public static PaisUser pais;

    //GAMBIARRA Ñ MECHER ----------------------------
    public static ArrayList<CidadeUser> resultadosDaPesquisa(String nome/*, PaisUser */) {
        ArrayList<CidadeUser> cidades = new ArrayList<>();
        String sql = "SELECT id,nome/*,id_pais*/ FROM cidades WHERE nome LIKE ? /*AND id_pais = ?*/";
        try {
            PreparedStatement ps = ConexaoUser.conectar().prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            //ps.setInt(2, pais.getId());
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                CidadeUser cidade = new CidadeUser();
                cidade.setId(resultSet.getInt("id"));
                cidade.setNome(resultSet.getString("nome"));
                //cidade.setPais((PaisDAOUser.buscarPaisPorId(resultSet.getInt("id_pais"))));
                cidades.add(cidade);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            ConexaoUser.desconectar();
        }
        return cidades;
    }
    //FIM DA GAMBIARRA PODE MECHER -------------------

    public static CidadeUser buscarCidadePorNome(String nome) {

        CidadeUser cidade = null;
        String sql = "SELECT id,nome FROM cidades WHERE nome LIKE ?";
        ConexaoUser conexao = new ConexaoUser();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setString(1, "%" + nome + "%");
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                cidade = new CidadeUser();
                cidade.setId(resultSet.getInt("id"));
                cidade.setNome(resultSet.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            conexao.desconectar();
        }
        return cidade;
    }

    public static CidadeUser buscarCidadePorId(int codigo) {
        CidadeUser cidade = null;
        String sql = "SELECT id, nome,id_pais FROM cidades WHERE id = ?";
        ConexaoUser conexao = new ConexaoUser();
        try {
            PreparedStatement ps = conexao.conectar().prepareCall(sql);
            ps.setInt(1, codigo);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            while (resultSet.next()) {
                cidade = new CidadeUser();
                cidade.setId(codigo);
                cidade.setNome(resultSet.getString("nome"));
                cidade.setPais(PaisDAOUser.buscarPaisPorId(resultSet.getInt("id_pais")));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            conexao.desconectar();
        }
        return cidade;
    }

}
