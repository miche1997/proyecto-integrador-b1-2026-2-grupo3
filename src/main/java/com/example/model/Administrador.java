package com.example;

public class Administrador {
 private String usuario_administrador;
 private  String contrasena;
// constructores 

public Administrador (){

}
 public Administrador(String usuario_administrador, String contrasena) {
    this.usuario_administrador = usuario_administrador;
    this.contrasena = contrasena;
 }
// getter and setters 
 public String getUsuario_administrador() {
    return usuario_administrador;
 }
 public void setUsuario_administrador(String usuario_administrador) {
    this.usuario_administrador = usuario_administrador;
 }
 public String getContrasena() {
    return contrasena;
 }
 public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
 }





}
