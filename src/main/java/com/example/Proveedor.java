package com.example;

public class Proveedor {
  private String idProveedor;
  private String contraseña;
 //constructores 

public Proveedor (){
   
}
  public Proveedor(String idProveedor, String contraseña) {
    this.idProveedor = idProveedor;
    this.contraseña = contraseña;
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
