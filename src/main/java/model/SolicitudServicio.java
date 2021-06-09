package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicituddeservicio")
public class SolicitudServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSolicitudServicio")
    private int idSolicitudServicio;

    @Column(name = "fechaSolicitudServicio")
    private LocalDate fechaSolicitudServicio;

    @Column(name = "horaSolcitudServicio")
    private LocalTime horaSolicitudServicio;

    @Column(name = "descripcionDelProblema")
    private String descripcionProblema;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "idUsuario")
    private Usuario idUsuario;



    //relacion muchos a muchos entre solcitud de servico y estado
    @JoinTable(
        name = "solicituddeservicioestado",
        joinColumns = @JoinColumn(name = "idSolicitudServicio"),
        inverseJoinColumns = @JoinColumn(name="idEstado")
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Estado> estado;
   


    public SolicitudServicio() {
    }

    public SolicitudServicio(int idSolicitudServicio, LocalDate fechaSolicitudServicio, LocalTime horaSolicitudServicio,
            String descripcionProblema) {
        this.idSolicitudServicio = idSolicitudServicio;
        this.fechaSolicitudServicio = fechaSolicitudServicio;
        this.horaSolicitudServicio = horaSolicitudServicio;
        this.descripcionProblema = descripcionProblema;
    }

    public int getIdSolicitudServicio() {
        return idSolicitudServicio;
    }

    public void setIdSolicitudServicio(int idSolicitudServicio) {
        this.idSolicitudServicio = idSolicitudServicio;
    }

    public LocalDate getFechaSolicitudServicio() {
        return fechaSolicitudServicio;
    }

    public void setFechaSolicitudServicio(LocalDate fechaSolicitudServicio) {
        this.fechaSolicitudServicio = fechaSolicitudServicio;
    }

    public LocalTime getHoraSolicitudServicio() {
        return horaSolicitudServicio;
    }

    public void setHoraSolicitudServicio(LocalTime horaSolicitudServicio) {
        this.horaSolicitudServicio = horaSolicitudServicio;
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

}
