package dao;

import dao.CidadeDAO;
import dao.MedicamentoDAO;
import dao.PaisDAO;
import database.Limpeza;
import model.Cidade;
import model.Medicamento;
import model.Pais;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Allan Martins Da Silva
 */
public class MedicamentoTeste {
    @Test
    public void testarCriacao() {
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Brasil");
        pais.setSigla("BR");
        pais.setId(PaisDAO.inserir(pais));
        
        Cidade cidade = new Cidade();
        cidade.setNome("Pomerode");
        cidade.setPais(pais);
        cidade.setId(CidadeDAO.inserir(cidade));
        
        Medicamento medicamento = new Medicamento();
        medicamento.setNome("Benegrip");
        medicamento.setPais(pais);
        medicamento.setPreco(3.29f);
        medicamento.setParaQServe("Curar umas doenças e pah");
        medicamento.setContraIndicacoes("N beber alcool dps");
        medicamento.setArmazenamento("Manter longe de crianças e em local seco");
        medicamento.setId(MedicamentoDAO.inserir(medicamento));
        assertEquals(1,medicamento.getId());
    }
    @Test
    public void testarAlterar(){
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Brasil");
        pais.setSigla("BR");
        pais.setId(PaisDAO.inserir(pais));
        
        Cidade cidade = new Cidade();
        cidade.setNome("Pomerode");
        cidade.setPais(pais);
        cidade.setId(CidadeDAO.inserir(cidade));
        
        Medicamento medicamento = new Medicamento();
        medicamento.setNome("Allangrip");
        medicamento.setPais(pais);
        medicamento.setPreco(3.29f);
        medicamento.setParaQServe("Curar");
        medicamento.setContraIndicacoes("N beber alcool");
        medicamento.setArmazenamento("Manter em local seco");
        medicamento.setId(MedicamentoDAO.inserir(medicamento));
        
        medicamento.setNome("Benegrip");
        medicamento.setParaQServe("Curar");
        medicamento.setId(MedicamentoDAO.alterar(medicamento));   
        
        Medicamento medicamentoAlterado = MedicamentoDAO.buscarMedicamentoPorId(medicamento.getId());
        assertEquals(medicamentoAlterado.getId(),medicamento.getId());   
        assertEquals(medicamentoAlterado.getNome(),medicamento.getNome()); 
        assertEquals(medicamentoAlterado.getPais().getId(),medicamento.getPais().getId());
        assertEquals(medicamentoAlterado.getPreco(),medicamento.getPreco(),0);
        assertEquals(medicamentoAlterado.getContraIndicacoes(),medicamento.getContraIndicacoes());
        assertEquals(medicamentoAlterado.getArmazenamento(),medicamento.getArmazenamento());
    }
    @Test
    public void buscarPorNome(){
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Brasil");
        pais.setSigla("BR");
        pais.setId(PaisDAO.inserir(pais));
        
        Cidade cidade = new Cidade();
        cidade.setNome("Pomerode");
        cidade.setPais(pais);
        cidade.setId(CidadeDAO.inserir(cidade));
        
        Medicamento medicamento = new Medicamento();
        medicamento.setNome("Benegrip");
        medicamento.setPais(pais);
        medicamento.setPreco(3.29f);
        medicamento.setParaQServe("Curar umas doenças e pah");
        medicamento.setContraIndicacoes("N beber alcool dps");
        medicamento.setArmazenamento("Manter longe de crianças e em local seco");
        medicamento.setId(MedicamentoDAO.inserir(medicamento));
        
        assertEquals("Benegrip", medicamento.getNome());
        Medicamento medicamentoBuscado = MedicamentoDAO.buscarMedicamentoPorNome(medicamento.getNome());
        assertEquals(medicamento.getId(),medicamentoBuscado.getId());   
        assertEquals(medicamento.getNome(),medicamentoBuscado.getNome());
    }
    @Test
    public void testarExcluir(){
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Brasil");
        pais.setSigla("BR");
        pais.setId(PaisDAO.inserir(pais));
        
        Cidade cidade = new Cidade();
        cidade.setNome("Pomerode");
        cidade.setPais(pais);
        cidade.setId(CidadeDAO.inserir(cidade));
        
        Medicamento medicamento = new Medicamento();
        medicamento.setNome("Benegrip");
        medicamento.setPais(pais);
        medicamento.setPreco(3.29f);
        medicamento.setParaQServe("Curar umas doenças e pah");
        medicamento.setContraIndicacoes("N beber alcool dps");
        medicamento.setArmazenamento("Manter longe de crianças e em local seco");
        medicamento.setId(MedicamentoDAO.inserir(medicamento));
        MedicamentoDAO.excluir(medicamento.getId()); 
        assertNull(MedicamentoDAO.buscarMedicamentoPorNome(medicamento.getNome()));
    } 
}
