package com.example.model;
import java.util.ArrayList;
import java.util.List;

public class Proveedor {
  private String idProveedor;
  private String nombreCompleto;
  private String telefono;
  private String contrasena;
private List<Producto> listaProductos = new ArrayList<>();
 //constructores 

public Proveedor (){
   
}
  public Proveedor(String idProveedor, String contrasena,String nombreCompleto, String telefono) {
    this.idProveedor = idProveedor;
    this.contrasena = contrasena;
    this.nombreCompleto = nombreCompleto;
    this.telefono = telefono;
    this.listaProductos = new arraylist();
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
  // metodos 
 public boolean agregarProducto(Producto producto) {
        if (producto == null) {
            System.out.println("Error: El producto no puede ser nulo.");
            return false;
        }
        return this.listaProductos.add(producto);
}
 

       public boolean eliminarProducto(String idProducto) {
        if (idProducto == null || idProducto.trim().isEmpty()) {
            System.out.println("Error: El ID del producto no es válido.");
            return false;
        } 
      }