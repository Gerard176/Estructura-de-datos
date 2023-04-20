/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciolistadoble;

import javax.swing.JOptionPane;

/**
 *
 * @author MAELDUSA
 */
public class Operations {
    
    Node cabeza;
    Node cola;
    
    public void insertarInicio(String nombre,int edad,double nota){
        Node nuevo = new Node();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setNota(nota);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        }else{
            cabeza.setSiguiente(nuevo);
            nuevo.setAnterior(cabeza);
            cabeza = nuevo;
            
        }
    }
    public void insertarFinal(String nombre,int edad,double nota){
        
    }
    
    public void imprimir(boolean enSentidoNormal){
        
        if (enSentidoNormal) {
            Node actual = cabeza;
            while (actual != null) {
                JOptionPane.showMessageDialog(null, "Datos del estudiante\n"
                        + "Nombre: "+actual.getNombre()+"\n"
                        + "edad: "+actual.getEdad()+"\n"
                        + "Nota definitiva: "+actual.getNota()+"\n");
                actual = actual.getAnterior();
            }
        } else {
            Node actual = cola;
            while (actual != null) {
                JOptionPane.showMessageDialog(null, "Datos del estudiante\n"
                        + "Nombre: "+actual.getNombre()+"\n"
                        + "edad: "+actual.getEdad()+"\n"
                        + "Nota definitiva: "+actual.getNota()+"\n");
                actual = actual.getSiguiente();
            }
        }
    }
}
