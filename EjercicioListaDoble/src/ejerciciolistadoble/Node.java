/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciolistadoble;

/**
 *
 * @author MAELDUSA
 */
public class Node {
    private Node Siguiente;
    private Node Anterior;
    private String nombre;
    private int edad;
    private double nota;

    public Node getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Node Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Node getAnterior() {
        return Anterior;
    }

    public void setAnterior(Node Anterior) {
        this.Anterior = Anterior;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Node{" + "Siguiente=" + Siguiente + ", Anterior=" + Anterior + ", nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + '}';
    }
    
    
    
}
