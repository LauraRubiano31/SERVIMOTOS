package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(length = 20)
    private String nombre;
    @Column(length = 20)
    private String tipoDocumento;
    @Column(length = 20)
    private String numeroDocumento;
    @Column(length = 30)
    private String Direccion;
    @Column(length = 30)
    private String Email;
    @Column(length = 20)
    private String numeroCelular;
    @Column(length = 20)
    private String numeroTelefono;
    @Column(length = 20)
    private String Barrio;
    @Column(length = 20)
    private String estado;
    @Column(length = 20)
    private String contraseña;
    @Column(name = "Rol_idRolFK", nullable = false)
    private int RolFK;

    @OneToMany(mappedBy = "usuarios")
    private List<Motocicleta>motocicletas;

    public Usuario(){
    }

    public Usuario(int idUsuario, String nombre, String tipoDocumento, String numeroDocumento, String direccion,
            String email, String numeroCelular, String numeroTelefono, String barrio, String estado, String contraseña,
            int rolFK) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        Direccion = direccion;
        Email = email;
        this.numeroCelular = numeroCelular;
        this.numeroTelefono = numeroTelefono;
        Barrio = barrio;
        this.estado = estado;
        this.contraseña = contraseña;
        RolFK = rolFK;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String barrio) {
        Barrio = barrio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getRolFK() {
        return RolFK;
    }

    public void setRolFK(int rolFK) {
        RolFK = rolFK;
    }

    
}
