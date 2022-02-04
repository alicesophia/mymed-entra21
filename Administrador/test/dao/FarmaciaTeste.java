package dao;

import database.Limpeza;
import model.Cidade;
import model.Farmacia;
import model.Pais;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Allan Martins Da Silva
 */
public class FarmaciaTeste {
    @Test
    public void testarCriacao() {
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Brasil");
        pais.setSigla("BR");
        pais.setId(PaisDAO.inserir(pais));
        
        Cidade cidade = new Cidade();
        cidade.setNome("Sao Paulo");
        cidade.setPais(pais);
        cidade.setId(CidadeDAO.inserir(cidade));
        
        Farmacia farmacia = new Farmacia();
        farmacia.setNome("Benegrip");
        farmacia.setCidade(cidade);
        farmacia.setLogradouro("Rua qualquer");
        farmacia.setSite("hfuwehyuf");
        farmacia.setTelefone("9956");
        farmacia.setId(FarmaciaDAO.inserir(farmacia));
        assertEquals(1,farmacia.getId());
    }

    @Test
    public void testarAlterar() {
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Brasil");
        pais.setSigla("BR");
        pais.setId(PaisDAO.inserir(pais));
        
        Pais paisAlterar = new Pais();
        paisAlterar.setNome("Estados Unidos");
        paisAlterar.setSigla("EU");
        paisAlterar.setId(PaisDAO.inserir(paisAlterar));
        
        Cidade cidade = new Cidade();
        cidade.setNome("Blumenau");
        cidade.setPais(pais);
        cidade.setId(CidadeDAO.inserir(cidade));
        
        Cidade cidadeAlterar = new Cidade();
        cidadeAlterar.setNome("Florida");
        cidadeAlterar.setPais(paisAlterar);
        cidadeAlterar.setId(CidadeDAO.inserir(cidadeAlterar));

        Farmacia farmacia = new Farmacia();
        farmacia.setNome("Droga Raia");
        farmacia.setLogradouro("Rua Quinze de Novembro");
        farmacia.setSite("www.benegripe.com.br");
        farmacia.setTelefone("3322-3040");
        farmacia.setCidade(cidade);
        farmacia.setId(FarmaciaDAO.inserir(farmacia));
       
        farmacia.setNome("Farmalan");
        farmacia.setLogradouro("Rua Treze");
        farmacia.setSite("www.farmalan.com.br");
        farmacia.setTelefone("3322-5582");
        farmacia.setCidade(cidadeAlterar);
        FarmaciaDAO.alterar(farmacia);
        
        Farmacia farmaciaAlterada = FarmaciaDAO.buscarFarmaciaPorId(farmacia.getId());
        assertEquals(farmacia.getId(),farmaciaAlterada.getId());   
        assertEquals(farmacia.getNome(),farmaciaAlterada.getNome());   
        assertEquals(farmacia.getLogradouro(),farmaciaAlterada.getLogradouro());   
        assertEquals(farmacia.getSite(),farmaciaAlterada.getSite());   
        assertEquals(farmacia.getTelefone(),farmaciaAlterada.getTelefone());   
    }
    
    @Test
    public void testarBuscarFarmaciaPorNome() {
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Brasil");
        pais.setSigla("BR");
        pais.setId(PaisDAO.inserir(pais));
        
        Cidade cidade = new Cidade();
        cidade.setNome("Sao Paulo");
        cidade.setPais(pais);
        cidade.setId(CidadeDAO.inserir(cidade));
        
        Farmacia farmacia = new Farmacia();
        farmacia.setNome("Benegrip");
        farmacia.setCidade(cidade);
        farmacia.setLogradouro("Rua qualquer");
        farmacia.setSite("hfuwehyuf");
        farmacia.setTelefone("9956");
        farmacia.setId(FarmaciaDAO.inserir(farmacia));
        assertEquals(1,farmacia.getId());

        Farmacia farmaciaBuscada = FarmaciaDAO.buscarFarmaciaPorNome(farmacia.getNome());
        assertEquals(farmacia.getId(),farmaciaBuscada.getId());
        assertEquals(farmacia.getNome(),farmaciaBuscada.getNome());        
    }

    @Test
    public void testarExcluir() {
        Limpeza.truncateTabelas();
        Pais pais = new Pais();
        pais.setNome("Brasil");
        pais.setSigla("BR");
        pais.setId(PaisDAO.inserir(pais));
        
        Cidade cidade = new Cidade();
        cidade.setNome("UIWADFI");
        cidade.setPais(pais);
        cidade.setId(CidadeDAO.inserir(cidade));
        
        Farmacia farmacia = new Farmacia();
        farmacia.setNome("DOugras");
        farmacia.setLogradouro("Rua Almeida 22");
        farmacia.setTelefone("3333-2222");
        farmacia.setSite("DOugras");
        farmacia.setCidade(cidade);
        farmacia.setId(FarmaciaDAO.inserir(farmacia));
        FarmaciaDAO.excluir(farmacia.getId());
        assertNull(FarmaciaDAO.buscarFarmaciaPorNome(farmacia.getNome()));
    }
}
