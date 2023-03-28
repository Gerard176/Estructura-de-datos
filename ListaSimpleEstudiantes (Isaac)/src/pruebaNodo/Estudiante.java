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
public class Estudiante {
  private String nombre, codigo;
  private int edad;
  private double nota;

  public Estudiante(String nombre, String codigo, int edad, double nota) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.edad = edad;
    this.nota = nota;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public double getNota() {
    return nota;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }

  @Override
  public String toString() {
    return  nombre + " | " + codigo +  " | "+ edad +  " | "+ nota;
  }
  
  
}
