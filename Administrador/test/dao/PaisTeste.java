package dao;

import database.Limpeza;
import model.Pais;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Allan Martins Da Silva
 */
public class PaisTeste {
    @Test
    public void testarCriacao() {
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Dougras");
        pais.setSigla("DR");
        pais.setId(PaisDAO.inserir(pais));
        assertEquals(1,pais.getId());
    }

   @Test
    public void testarAlterar() {
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Dougras");
        pais.setSigla("DR");
        pais.setId(PaisDAO.inserir(pais));
        assertEquals(pais.getId(), 1);

        pais.setNome("Allan");
        pais.setSigla("AL");
        pais.setId(PaisDAO.alterar(pais));

        assertNotEquals(0,pais.getId());
    }
    
    @Test
    public void testarBuscarPaisPorNome() {
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Boston");
        pais.setSigla("BS");
        pais.setId(PaisDAO.inserir(pais));
        assertEquals("Boston", pais.getNome());

        Pais paisBuscada = PaisDAO.buscarPaisPorNome(pais.getNome());
        assertEquals(paisBuscada.getId(),pais.getId());
        assertEquals(paisBuscada.getNome(), pais.getNome());
    }

    @Test
    public void testarExcluir() {
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Dougras");
        pais.setSigla("DR");
        pais.setId(PaisDAO.inserir(pais));
        PaisDAO.excluir(pais.getId());
        assertNull(PaisDAO.buscarPaisPorNome(pais.getNome()));
    }    
}
