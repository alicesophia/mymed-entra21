package dao;

import database.Limpeza;
import model.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Allan Martins Da Silva
 */
public class UsuarioTeste {
    @Test
    public void testarCriacao() {
        Limpeza.truncateTabelas();
        Usuario user = new Usuario();
        user.setNome("Dougras");
        user.setUsuario("AllanMilGRAU");
        user.setSenha("allanzinhoMilGrau");
        user.setEmail("allanzinhoMilGrauArrobanoisEtop.com");
        user.setId(UsuarioDAO.inserir(user));
        assertEquals(1,user.getId());
    }

    @Test
    public void testarAlterar() {
        Limpeza.truncateTabelas();
        Usuario user = new Usuario();
        user.setNome("Dougras");
        user.setUsuario("AllanMilGRAU");
        user.setSenha("allanzinhoMilGrau");
        user.setId(UsuarioDAO.inserir(user));
        assertEquals(1,user.getId());

        user.setNome("Allan Martins Da Silva");
        user.setUsuario("Triloco");
        user.setSenha("allanzinhoMilGrau");
        user.setEmail("allanzinhoMilGrau@rolezeiros.com");
        user.setId(UsuarioDAO.alterar(user));

        assertNotEquals(0,user.getId());
    }
    
        @Test
    public void testarBuscarUsuarioPorNome() {
        Limpeza.truncateTabelas();
        Usuario user = new Usuario();
        user.setNome("Boston");
        user.setUsuario("Allan");
        user.setSenha("Allan123");
        user.setEmail("fgwyawgu@.com");
        user.setId(UsuarioDAO.inserir(user));
        assertEquals("Boston",user.getNome());

        Usuario usuarioBuscado = UsuarioDAO.buscarUsuarioPorNome(user.getNome());
        assertEquals(usuarioBuscado.getId(), user.getId());
        assertEquals(usuarioBuscado.getNome(), user.getNome());        
    }

    @Test
    public void testarExcluir() {
        Limpeza.truncateTabelas();
        Usuario user = new Usuario();
        user.setNome("Boston");
        user.setUsuario("Allan");
        user.setSenha("Allan123");
        user.setEmail("fgwyawgu@.com");
        user.setId(UsuarioDAO.inserir(user));
        UsuarioDAO.excluir(user.getId());
        assertNull(UsuarioDAO.buscarUsuarioPorNome(user.getNome()));
    }
}
