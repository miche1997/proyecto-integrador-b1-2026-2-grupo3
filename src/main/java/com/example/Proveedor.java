package com.example;

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
  





}
