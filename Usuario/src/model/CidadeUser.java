
package model;

/**
 *
 * @author Adan_Rocha
 */
public class CidadeUser {

    private PaisUser pais;
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PaisUser getPais() {
        return pais;
    }

    public void setPais(PaisUser pais) {
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
