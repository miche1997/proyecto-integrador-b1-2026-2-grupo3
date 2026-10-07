package com.example;

import java.time.LocalDateTime;

import com.example.model.Proveedor;

public class Productos extends Proveedor {
   
    private String idProducto;
    private String nombreProducto; 
    private double Precio;
    private String marca;
    private int stock;
    private boolean activo;
    private String descripcion;
    private LocalDateTime fechaPublicacion;


    // constructores

    public Productos(String idProducto, String nombreProducto, double precio, String marca, int stock, boolean activo,
            String descripcion) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        Precio = precio;
        this.marca = marca;
        this.stock = stock;
        this.activo = activo;
        this.descripcion = descripcion;
    }
    public Productos(String idProveedor, String contrasena, String nombreCompleto, String telefono, String idProducto,
            String nombreProducto, double precio, String marca, int stock, boolean activo, String descripcion) {
        super(idProveedor, contrasena, nombreCompleto, telefono);
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        Precio = precio;
        this.marca = marca;
        this.stock = stock;
        this.activo = activo;
        this.descripcion = descripcion;
    }
     public Productos (){
        this.fechaPublicacion = LocalDateTime.now();
    }
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
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













    

 }










