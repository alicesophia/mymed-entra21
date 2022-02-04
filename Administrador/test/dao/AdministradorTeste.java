package dao;

import database.Limpeza;
import model.Administrador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Allan Martins Da Silva
 */
public class AdministradorTeste {
    @Test
    public void testarCriacao() {
        Limpeza.truncateTabelas();
        Administrador admin = new Administrador();
        admin.setNome("Dougras");
        admin.setUsuario("AllanMilGRAU");
        admin.setSenha("allanzinhoMilGrau");
        admin.setId(AdministradorDAO.inserir(admin));
        assertEquals(1,admin.getId());
    }

   @Test
    public void testarAlterar() {
        Limpeza.truncateTabelas();
        Administrador admin = new Administrador();
        admin.setNome("Dougras");
        admin.setUsuario("AllanMilGRAU");
        admin.setSenha("allanzinhoMilGrau");
        admin.setId(AdministradorDAO.inserir(admin));
        //assertEquals(1,admin.getId());

        admin.setNome("Allan Martins Da Silva");
        admin.setUsuario("Triloco");
        admin.setSenha("allanzinhoMilGrau");
        AdministradorDAO.alterar(admin);
        
        Administrador AdminAlterado = AdministradorDAO.buscarAdminPorId(admin.getId());
        assertEquals(admin.getId(),AdminAlterado.getId());   
        assertEquals(admin.getNome(),AdminAlterado.getNome());
        assertEquals(admin.getUsuario(),AdminAlterado.getUsuario());
        assertEquals(admin.getSenha(),AdminAlterado.getSenha());

    }
    @Test
    public void testarBuscarAdminPorNome() {
        Limpeza.truncateTabelas();
        Administrador admin = new Administrador();
        admin.setNome("Boston");
        admin.setUsuario("AllanMilGRAU");
        admin.setSenha("allanzinhoMilGrau");
        admin.setId(AdministradorDAO.inserir(admin));
        assertEquals(1,admin.getId());

        Administrador adminBuscado = AdministradorDAO.buscarAdminPorNome(admin.getNome());
        assertEquals(admin.getId(),adminBuscado.getId());
        assertEquals(admin.getNome(),adminBuscado.getNome());
    }
    @Test
    public void testarBuscarAdminPorId() {
        Limpeza.truncateTabelas();
        Administrador admin = new Administrador();
        admin.setNome("Jubileu");
        admin.setUsuario("Allan");
        admin.setSenha("allanzinho");
        admin.setId(AdministradorDAO.inserir(admin));
        assertEquals(1,admin.getId());

        Administrador adminBuscado = AdministradorDAO.buscarAdminPorId(admin.getId());
        assertEquals(admin.getId(),adminBuscado.getId());
        assertEquals(admin.getNome(),adminBuscado.getNome());
    }

    @Test
    public void testarExcluir() {
        Limpeza.truncateTabelas();
        Administrador admin = new Administrador();
        admin.setNome("DOugras");
        admin.setId(AdministradorDAO.inserir(admin));
        AdministradorDAO.excluir(admin.getId());
        assertNull(AdministradorDAO.buscarAdminPorNome(admin.getNome()));
    }
}
