/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaNodo;

/**
 *
 * @author ASUS
 */
public class Nodo {
  private Estudiante nombre;
  private Nodo enlace;

  public Estudiante getNombre() {
    return nombre;
  }

  public void setNombre(Estudiante nombre) {
    this.nombre = nombre;
  }

  public Nodo getEnlace() {
    return enlace;
  }

  public void setEnlace(Nodo enlace) {
    this.enlace = enlace;
  }
  
}
