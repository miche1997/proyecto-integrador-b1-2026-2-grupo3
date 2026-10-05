package com.example.model;

import java.time.LocalDateTime;

public class Cupones {
    private Long id; // autogenerado por la BD
    private String codigo;
    private double porcentaje; // descuento
    private int usos; // cantidad de usos permitidos
    private String estado; // activo / inactivo
    private LocalDateTime fechaCreacion;

    // Constructor completo
    public Cupones(Long id, String codigo, double porcentaje, int usos, String estado, LocalDateTime fechaCreacion) {
        this.id = id;
        this.codigo = codigo;
        this.porcentaje = porcentaje;
        this.usos = usos;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
    }

    // Constructor sin ID

    public Cupones(String codigo, double porcentaje, int usos, String estado, LocalDateTime fechaCreacion) {
        this(null, codigo, porcentaje, usos, estado, fechaCreacion);
    }

    // Constructor vacío

    public Cupones() {
        this.fechaCreacion = LocalDateTime.now();
    }

    // Getters y setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getPorcentaje() {
        return porcentaje;
    }
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    public int getUsos() {
        return usos;
    }
    public void setUsos(int usos) {
        this.usos = usos;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Cupon [id=" + id + ", codigo=" + codigo + ", porcentaje=" + porcentaje + "%, usos=" + usos + ", estado=" + estado + "]";
    }
}
