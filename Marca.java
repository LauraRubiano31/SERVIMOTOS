package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMarca;
    @Column(length = 20)
    private String nombreMarca;

    @OneToMany(mappedBy = "marca")
    private List<Linea>lineas;

    @OneToMany(mappedBy = "marca")
    private List<Motocicleta>motocicletas;

    public Marca(){
    }

    public Marca(int idMarca, String nombreMarca) {
        this.idMarca = idMarca;
        this.nombreMarca = nombreMarca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    
    
}
