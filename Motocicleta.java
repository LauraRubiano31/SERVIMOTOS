package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Motocicleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMotocicleta;
    @Column(length = 20)
    private String placaMotocicleta;
    @Column(length = 20)
    private String colorMotocicleta;
    @Column(name = "Marca_idMarcaFK", nullable = false)
    private int MarcaFK;
    @Column(name = "Categoria_idCategoriaFK", nullable = false)
    private int CategoriaFK;
    @Column(name = "Usuario_idUsuarioFK", nullable = false)
    private int UsuarioFK;

    @ManyToOne
    @JoinColumn(name = "MarcaFK", insertable = false, updatable = false)
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "CategoriaFK", insertable = false, updatable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "UsuarioFK", insertable = false, updatable = false)
    private Usuario usuarios;


    public Motocicleta(){
    }

    public Motocicleta(int idMotocicleta, String placaMotocicleta, String colorMotocicleta, int marcaFK,
            int categoriaFK, int usuarioFK) {
        this.idMotocicleta = idMotocicleta;
        this.placaMotocicleta = placaMotocicleta;
        this.colorMotocicleta = colorMotocicleta;
        MarcaFK = marcaFK;
        CategoriaFK = categoriaFK;
        UsuarioFK = usuarioFK;
    }

    public int getIdMotocicleta() {
        return idMotocicleta;
    }

    public void setIdMotocicleta(int idMotocicleta) {
        this.idMotocicleta = idMotocicleta;
    }

    public String getPlacaMotocicleta() {
        return placaMotocicleta;
    }

    public void setPlacaMotocicleta(String placaMotocicleta) {
        this.placaMotocicleta = placaMotocicleta;
    }

    public String getColorMotocicleta() {
        return colorMotocicleta;
    }

    public void setColorMotocicleta(String colorMotocicleta) {
        this.colorMotocicleta = colorMotocicleta;
    }

    public int getMarcaFK() {
        return MarcaFK;
    }

    public void setMarcaFK(int marcaFK) {
        MarcaFK = marcaFK;
    }

    public int getCategoriaFK() {
        return CategoriaFK;
    }

    public void setCategoriaFK(int categoriaFK) {
        CategoriaFK = categoriaFK;
    }

    public int getUsuarioFK() {
        return UsuarioFK;
    }

    public void setUsuarioFK(int usuarioFK) {
        UsuarioFK = usuarioFK;
    }

    
    
}
