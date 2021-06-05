package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Linea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLinea;
    @Column(length = 20)
    private String nombreLinea;
    @Column(name = "Marca_idMarcaFK", nullable = false)
    private int MarcaFK;

    @ManyToOne
    @JoinColumn(name = "MarcaFK", insertable = false, updatable = false)
    private Marca marca;

    public Linea(){
    }

    public Linea(int idLinea, String nombreLinea, int MarcaFK) {
        this.idLinea = idLinea;
        this.nombreLinea = nombreLinea;
        this.MarcaFK = MarcaFK;
    }

    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public String getNombreLinea() {
        return nombreLinea;
    }

    public void setNombreLinea(String nombreLinea) {
        this.nombreLinea = nombreLinea;
    }

    public int getMarcaFK() {
        return MarcaFK;
    }

    public void setMarcaFK(int MarcaFK) {
        this.MarcaFK = MarcaFK;
    }

    
}
