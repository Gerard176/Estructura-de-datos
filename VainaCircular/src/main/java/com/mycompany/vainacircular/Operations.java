/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vainacircular;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2PC13
 */
public class Operations {
    public Nodo inicio;
    public Nodo ultimo;

    public Operations() {
        inicio = null;
        ultimo = null;
       
    }
    
    
    
    public void inicio(String valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        nuevo.setSiguiente(nuevo);
         if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        }else{
            
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
            
        }
    }
    
    public void imprimir(){
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "la lista esta vacia");
            
        }else{
            Nodo temp = inicio;
            boolean salir = false;
            while(salir == false){
                JOptionPane.showMessageDialog(null, "la lista es: "+temp.getValor());
                temp = temp.getSiguiente();
                if (temp == inicio ) {
                   salir = true;
                }
            }
        }
    }
}
