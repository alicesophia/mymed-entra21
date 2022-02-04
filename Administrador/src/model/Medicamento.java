package model;

import java.util.ArrayList;

/**
 *
 * @author Allan Martins Da Silva
 */
public class Medicamento {

    private int id;
    private Pais pais;
    private String nome, paraQServe, contraIndicacoes, armazenamento;
    private float preco;
    
    public String toString() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParaQServe() {
        return paraQServe;
    }

    public void setParaQServe(String paraQServe) {
        this.paraQServe = paraQServe;
    }

    public String getContraIndicacoes() {
        return contraIndicacoes;
    }

    public void setContraIndicacoes(String contraIndicacoes) {
        this.contraIndicacoes = contraIndicacoes;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
