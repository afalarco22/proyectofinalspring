package com.example.viaticosonline.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "viajes")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "destino", length = 150)
    private String destino;

    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fechaInicio")
    private String fechaInicio;
    @Column(name = "fechaFin")
    private String fechaFin;

    @Column(name = "gastoPasajes")
    private Double gastoPasajes;
    @Column(name = "gastoTransporte")
    private Double gastoTransporte;
    @Column(name = "gastosAlimentacion")
    private Double gastosAlimentacion;

    @ManyToOne(optional = false)  // se establece la relación entre las tablas
    @JoinColumn(name = "fl_viaje", referencedColumnName = "id")
    @JsonBackReference
    private Empleado empleado;

    public Viaje() {
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getGastoPasajes() {
        return gastoPasajes;
    }

    public void setGastoPasajes(Double gastoPasajes) {
        this.gastoPasajes = gastoPasajes;
    }

    public Double getGastoTransporte() {
        return gastoTransporte;
    }

    public void setGastoTransporte(Double gastoTransporte) {
        this.gastoTransporte = gastoTransporte;
    }

    public Double getGastosAlimentacion() {
        return gastosAlimentacion;
    }

    public void setGastosAlimentacion(Double gastosAlimentacion) {
        this.gastosAlimentacion = gastosAlimentacion;
    }
}
