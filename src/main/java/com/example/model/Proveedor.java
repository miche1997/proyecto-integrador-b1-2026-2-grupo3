package com.example.model;

public class Proveedor {
  private String idProveedor;
  private String nombreCompleto;
  private String telefono;
  private String contrasena;
 //constructores 

public Proveedor (){
   
}
  public Proveedor(String idProveedor, String contrasena,String nombreCompleto, String telefono) {
    this.idProveedor = idProveedor;
    this.contrasena = contrasena;
    this.nombreCompleto = nombreCompleto;
    this.telefono = telefono;
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
@override 
public String toString(){
  return "Proveedor [idProveedor=" + idProveedor + ", nombreCompleto=" + nombreCompleto + ", telefono=" + telefono + "]";
}


}
