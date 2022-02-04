
package model;

/**
 *
 * @author Adan_Rocha
 */
public class Cidade {

    private Pais pais;
    private int id;
    private String nome;

    public String toString(){
        return nome;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
