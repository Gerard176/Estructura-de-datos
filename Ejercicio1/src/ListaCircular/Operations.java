/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaCircular;
    
import javax.swing.JOptionPane;

public class Operations {

    Nodo cab;
    Nodo col;
    Nodo aux;
    Nodo refere;
    String equipo1 = "<html>";
    String equipo2 = "<html>";
    int i=0;
    boolean derecha = true;

    public Operations() {
        cab = null;
        col = null;
        
    }

    public void insertar(String dato) {
        Nodo temp = cab;
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        nuevo.setSgt(nuevo);
//        nuevo.setAnt(nuevo);
        if (cab == null) {
            cab = nuevo;
            cab.setSgt(cab);
        } else {
            while (temp.getSgt() != cab) {
                temp = temp.getSgt();
            }
            temp.setSgt(nuevo);
            nuevo.setAnt(aux);
            nuevo.setSgt(cab);
            col = nuevo;
            aux = nuevo;
            cab.setAnt(col);
        }

        
    }
    public void Escoger(String nombre){

        Nodo aux = cab;
        Nodo tem = cab;
        boolean aux2 = false;

        if (cab.getDato().equals(nombre)) {
            System.out.println("si esta");
            refere = cab;
            aux2 = true;
        }else{
            while (aux != col) {
                aux = aux.getSgt();
                if (aux.getDato().equals(nombre)) {
                    System.out.println("si esta");
                    refere = aux;
                    aux2 = true;
                    break;
                }
            }
            do{
              tem = tem.getSgt();
              if(tem.getDato().equals(nombre)){
                break;
              }
            }while(tem!=cab);
        }
        if (aux2 == false) {
            System.out.println("no se encontro");
        } else {
            int numero = tirarDado();
            JOptionPane.showMessageDialog(null, "el numero del dado es "+numero);
            aux = tem;
            if (derecha == true) {
                System.out.println(numero);
                for (int i = 0; i <numero; i++) {
                    System.out.println(aux.getDato());
                    aux = aux.getSgt();
                }
                equipo1 += aux.getDato()+"<p>";
                System.out.println(" equipo 1 "+equipo1+"\n");
                delete(aux.getDato());
                derecha = false;
            } else {
                System.out.println(numero);
                for (int i = 0; i <numero; i++) {
                    System.out.println(aux.getDato());
                    aux = aux.getAnt();
                }
                equipo2 += aux.getDato()+"<p>";
                System.out.println(" equipo 2 "+equipo2+"\n");
                delete(aux.getDato());
                derecha = true;
            }
            refere = aux.getSgt();

        }
         System.out.println("aaaaaaaaaa: "+tem.getDato());
    }
    

    public void delete(String name) {
     
        Nodo aux2 = cab;
        boolean encontrar = false;
        if (cab == null) {
            System.out.println("la lista esta vacia");
        } else if (cab.getDato().equals(name)) {
            cab = cab.getSgt();
            cab.setAnt(col);
            col.setSgt(cab);
        } else {
            Nodo aux = null;
            do {
                aux = aux2;
                aux2 = aux2.getSgt();
                if (aux2.getDato().equals(name)) {
                    encontrar = true;
                    break;
                }
                if (aux2 == cab || aux2 == col) {
                    break;
                }
              
            } while (!aux2.getDato().equals(name));
            
            if (encontrar == true) {
                aux.setSgt(aux2.getSgt());
                aux2.getSgt().setAnt(aux);
//                aux2.setAnt(aux.getSgt());
                
            } else {
                System.out.println("no se encontro la persona a eliminar");
            }
        }
    }

    public int tirarDado() {
        int dado = (int) Math.round(Math.random() * 5) + 1;
        return dado;
    }

    public void imprimir() {
        Nodo temp = cab;
        if (temp == null) {
            JOptionPane.showMessageDialog(null, "la lista esta vacia");

        }

       do{
            System.out.println(temp.getDato());
            temp = temp.getSgt();
        }  while (temp != cab);
//        System.out.println(temp.getDato());
    }
}