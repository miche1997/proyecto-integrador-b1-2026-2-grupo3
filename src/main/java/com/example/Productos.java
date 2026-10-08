package com.example;

import java.time.LocalDateTime;

public class Productos {
    private String idProducto;
    private String idProveedor; // proveedor dueño del producto (llave foránea en la BD)
    private String nombreProducto;
    private double precio;
    private String marca;
    private int stock;
    private boolean activo;
    private String descripcion;
    private LocalDateTime fechaPublicacion;

    // Constructor completo
    public Productos(String idProducto, String idProveedor, String nombreProducto, double precio, String marca,
            int stock, boolean activo, String descripcion, LocalDateTime fechaPublicacion) {
        this.idProducto = idProducto;
        this.idProveedor = idProveedor;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.marca = marca;
        this.stock = stock;
        this.activo = activo;
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;
    }

    // Constructor sin ID
    // (para insertar productos nuevos)
    public Productos(String idProveedor, String nombreProducto, double precio, String marca, int stock,
            boolean activo, String descripcion, LocalDateTime fechaPublicacion) {
        this(null, idProveedor, nombreProducto, precio, marca, stock, activo, descripcion, fechaPublicacion);
    }

    // Constructor vacío
    public Productos() {
        this.fechaPublicacion = LocalDateTime.now();
        this.activo = true; // por defecto
    }

    // Getters y setters
    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Productos [idProducto=" + idProducto + ", idProveedor=" + idProveedor + ", nombreProducto="
                + nombreProducto + ", precio=" + precio + ", marca=" + marca + ", stock=" + stock + ", activo="
                + activo + ", descripcion=" + descripcion + ", fechaPublicacion=" + fechaPublicacion + "]";
    }
}
