package com.example.viaticosonline.entidades;

import jakarta.persistence.*;

@Entity // paquete opensource
@Table(name="empleados" ) // nombre de la tabla

public class Empleado {

    @Id // identifica la llave primaria en la tabla, da atributos adicionales al campo
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // autoincremental al campo
    @Column(name="id") // nombre de la columna
    private Integer id;
    @Column(name = "documento")
    private String documento;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "contacto")
    private String contacto;
    @Column(name = "tipoEmpleado")
    private String tipoEmpleado;
    @Column(name = "salario")
    private Double salario;

    public Empleado() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
