package model;

/**
 *
 * @author Mario Schwabe Filho
 */
public class MedicamentoInternacional {
    
    private int id;
    private Pais paisOrigem, paisDestino;
    private Medicamento medicamentoOrigem, medicamentoDestino;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pais getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(Pais paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public Pais getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(Pais paisDestino) {
        this.paisDestino = paisDestino;
    }

    public Medicamento getMedicamentoOrigem() {
        return medicamentoOrigem;
    }

    public void setMedicamentoOrigem(Medicamento medicamentoOrigem) {
        this.medicamentoOrigem = medicamentoOrigem;
    }

    public Medicamento getMedicamentoDestino() {
        return medicamentoDestino;
    }

    public void setMedicamentoDestino(Medicamento medicamentoDestino) {
        this.medicamentoDestino = medicamentoDestino;
    }

    
    
}
