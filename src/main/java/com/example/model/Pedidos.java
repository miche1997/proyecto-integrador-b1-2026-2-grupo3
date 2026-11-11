package com.example.model;

public class Pedidos {
  Long id_Pedido;
  int numeroPedido;
  String fechaPedido;
  int numeroproducto;
// metodos setters getters y constructores
  public Pedidos(Long id_Pedido, int numeroPedido, String fechaPedido, int numeroproducto) {
    this.id_Pedido = id_Pedido;
    this.numeroPedido = numeroPedido;
    this.fechaPedido = fechaPedido;
    this.numeroproducto = numeroproducto;
  }
  public Long getId_Pedido() {
    return id_Pedido;
  }
  public void setId_Pedido(Long id_Pedido) {
    this.id_Pedido = id_Pedido;
  }
  public int getNumeroPedido() {
    return numeroPedido;
  }
  public void setNumeroPedido(int numeroPedido) {
    this.numeroPedido = numeroPedido;
  }
  public String getFechaPedido() {
    return fechaPedido;
  }
  public void setFechaPedido(String fechaPedido) {
    this.fechaPedido = fechaPedido;
  }
  public int getNumeroproducto() {
    return numeroproducto;
  }
  public void setNumeroproducto(int numeroproducto) {
    this.numeroproducto = numeroproducto;
  }
  @Override
  public String toString() {
    return "Pedidos [id_Pedido=" + id_Pedido + ", numeroPedido=" + numeroPedido + ", fechaPedido=" + fechaPedido
            + ", numeroproducto=" + numeroproducto + ", getId_Pedido()=" + getId_Pedido() + ", getNumeroPedido()="
            + getNumeroPedido() + ", getFechaPedido()=" + getFechaPedido() + ", getNumeroproducto()="
            + getNumeroproducto() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
            + super.toString() + "]";
  }
 














}





















