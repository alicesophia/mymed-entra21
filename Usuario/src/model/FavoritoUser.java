/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Allan Martins Da Silva
 */
public class FavoritoUser {
    private int id;
    private MedicamentoUser idMedicamento;
    private UsuarioUser idUsuario;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MedicamentoUser getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(MedicamentoUser idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public UsuarioUser getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UsuarioUser idUsuario) {
        this.idUsuario = idUsuario;
    }
}
