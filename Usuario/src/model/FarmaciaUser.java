
package model;

/**
 *
 * @author Allan Martins Da Silva
 */
public class FarmaciaUser {
    private int id;
    private CidadeUser cidade;
    private String nome, logradouro, telefone, site;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CidadeUser getCidade() {
        return cidade;
    }

    public void setCidade(CidadeUser cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    
    
    
}
