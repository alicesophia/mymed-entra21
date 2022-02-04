package dao;

import database.Limpeza;
import model.Cidade;
import model.Pais;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Allan Martins Da Silva
 */
public class CidadeTeste {
    @Test
    public void testarCriacao() {
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Brasil");
        pais.setSigla("BR");
        pais.setId(PaisDAO.inserir(pais));

        Cidade cidade = new Cidade();
        cidade.setNome("Itanhaem");
        cidade.setPais(pais);
        cidade.setId(CidadeDAO.inserir(cidade));
        
        assertEquals(1,cidade.getId());
    }

    @Test
    public void testarAlterar() {
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Brasil");
        pais.setSigla("BR");
        pais.setId(PaisDAO.inserir(pais));

        Cidade cidade = new Cidade();
        cidade.setNome("Boston");
        cidade.setPais(pais);
        cidade.setId(CidadeDAO.inserir(cidade));

        Pais paisAlterar = new Pais();
        paisAlterar.setNome("New York");
        paisAlterar.setSigla("NY");
        paisAlterar.setId(PaisDAO.inserir(paisAlterar));

        cidade.setNome("Howgarts");
        cidade.setPais(paisAlterar);
        CidadeDAO.alterar(cidade);
        
        Cidade cidadeAlterada = CidadeDAO.buscarCidadePorId(cidade.getId());
        assertEquals(cidade.getId(),cidadeAlterada.getId());   
        assertEquals(cidade.getNome(),cidadeAlterada.getNome());   
        assertEquals(cidade.getPais().getId(),cidadeAlterada.getPais().getId());
    }
    
    @Test
    public void testarBuscarCidadePorNome() {
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Rio Grande dos Sul");
        pais.setSigla("RS");
        pais.setId(PaisDAO.inserir(pais));

        Cidade cidade = new Cidade();
        cidade.setNome("Boston");
        cidade.setPais(pais);
        cidade.setId(CidadeDAO.inserir(cidade));
        assertEquals(1,cidade.getId());

        Cidade cidadeBuscada = CidadeDAO.buscarCidadePorNome(cidade.getNome());
        assertEquals(cidadeBuscada.getId(), cidade.getId());
        assertEquals(cidadeBuscada.getNome(), cidade.getNome());
        
    }
    
    @Test
    public void testarExcluir() {
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Rio Grande dos Sul");
        pais.setSigla("RS");
        pais.setId(PaisDAO.inserir(pais));
        
        Cidade cidade = new Cidade();
        cidade.setNome("New York");
        cidade.setPais(pais);
        cidade.setId(CidadeDAO.inserir(cidade));
        CidadeDAO.excluir(cidade.getId());
        assertNull(CidadeDAO.buscarCidadePorId(cidade.getId())); 
    }
}
