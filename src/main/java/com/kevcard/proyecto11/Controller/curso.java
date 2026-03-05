package com.kevcard.proyecto11.Controller;

public class curso {
  private int  id;
  private String nombre;
  private String descripcion;
  private int duracionHoras;
  private boolean activo;

  public curso() {
  }
  public curso(int id, String nombre, String descripcion, int duracionHoras, boolean activo) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.duracionHoras = duracionHoras;
    this.activo = activo;
  }

  public int getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public int getDuracionHoras() {
    return duracionHoras;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setDuracionHoras(int duracionHoras) {
    this.duracionHoras = duracionHoras;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

}

