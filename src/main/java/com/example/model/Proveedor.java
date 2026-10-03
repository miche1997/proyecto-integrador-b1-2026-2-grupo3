package com.example.model;

public class Proveedor {
  private String idProveedor;
  private String nombreCompleto;
  private String telefono;
  private String contraseña;
 //constructores 

public Proveedor (){
   
}
  public Proveedor(String idProveedor, String contraseña,String nombreCompleto, String telefono) {
    this.idProveedor = idProveedor;
    this.contraseña = contraseña;
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
  public String getContraseña() {
    return contraseña;
  }
  public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
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
  





}
