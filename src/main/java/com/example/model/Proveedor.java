package com.example.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.Productos;

public class Proveedor {
  private String idProveedor;
  private String nombreCompleto;
  private String telefono;
  private String contrasena;
  private LocalDateTime fechaCreacionCuenta;
private List<Productos> listaProductos = new ArrayList<>(); //constructores completo
   
  public Proveedor(String idProveedor, String contrasena,String nombreCompleto, String telefono, LocalDateTime fechaCreacionCuenta) {
    this.idProveedor = idProveedor;
    this.contrasena = contrasena;
    this.nombreCompleto = nombreCompleto;
    this.telefono = telefono;
    this.fechaCreacionCuenta = fechaCreacionCuenta;
  }
  // constructor sin id
  public Proveedor(String contrasena,String nombreCompleto, String telefono, LocalDateTime fechaCreacionCuenta) {
    this(null, contrasena, nombreCompleto, telefono, fechaCreacionCuenta);
  }
 // constructor vacío
  public Proveedor() {
    this.fechaCreacionCuenta = LocalDateTime.now();
  }
 // getters  and setters 
  public String getIdProveedor() {
    return idProveedor;
  }
  public void setIdProveedor(String idProveedor) {
    this.idProveedor = idProveedor;
  }
  public String getContrasena() {
    return contrasena;
  }
  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }
  public String getNombreCompleto() {
    return nombreCompleto;
  }
  public void setNombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
  }
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
  public LocalDateTime getFechaCreacionCuenta() {
    return fechaCreacionCuenta;
  }
  public void setFechaCreacionCuenta(LocalDateTime fechaCreacionCuenta) {
    this.fechaCreacionCuenta = fechaCreacionCuenta;
  }
@Override 
public String toString(){
  return "Proveedor [idProveedor=" + idProveedor + ", nombreCompleto=" + nombreCompleto + ", telefono=" + telefono + "]";
}
// metodos 
   public boolean agregarProducto(Productos producto) {
        if (producto == null) {
            return false;
        }
}
public boolean eliminarProducto(String idProducto) {
        if (idProducto == null) {
            return false;
        }
        return this.listaProductos.removeIf(p -> p.getIdProveedor().equalsIgnoreCase(idProducto));
    }
  }