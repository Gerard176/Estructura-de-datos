/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaNodo;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Opera {

  private Nodo cabeza;
  private Nodo cola;
  private static int indice;

  public Opera() {
    this.cabeza = null;
    indice++;
  }

  public boolean rectificar(String valor) {

    if (cabeza != null) {
      Nodo nodoParcial = buscarCodigo(valor);
      if (nodoParcial != null) {
        return false;
      }
    }

    return true;
  }

  public void add(Estudiante valor) {

    if (rectificar(valor.getCodigo())) {
      Nodo actual = new Nodo();
      actual.setEnlace(null);
      actual.setNombre(valor);

      if (cabeza == null) {
        cabeza = actual;
      } else {
        Nodo tem = cabeza;
        while (tem.getEnlace() != null) {
          tem = tem.getEnlace();
        }
        tem.setEnlace(actual);
      }
    }else{
      System.out.println("el codigo esta repetido");
    }

  }

  public void ganaron() {
    int c = 0;
    Nodo tem = cabeza;
    while (tem != null) {
      if (tem.getNombre().getNota() >= 3.0) {
        c++;
      }
      tem = tem.getEnlace();
    }
    System.out.println(c);
  }

  public Nodo buscar(String nombre) {
    Nodo ver = cabeza;
    while (ver != null) {
      if (ver.getNombre().getNombre().equalsIgnoreCase(nombre)) {
        return ver;
      }
      ver = ver.getEnlace();
    }

    return null;
  }
  

  public void buscarNombre(String nombre) {

    Nodo nodoActual = buscar(nombre);
    if (nodoActual != null) {
      if (nodoActual != cabeza) {
        anterior(nodoActual);
      }
      Nodo a = nodoActual.getEnlace();
      if (a != null) {
        System.out.println(a.getNombre());
      }
    } else {
      System.out.println("no esta");
    }

  }

  public void anterior(Nodo anterior) {
    Nodo ver = cabeza;
    int con = 0;
    while (ver != null) {
      if (anterior.getNombre().getNombre().equals(ver.getNombre().getNombre())) {
        break;
      }
      con++;
      ver = ver.getEnlace();
    }
    int c = 0;
    Nodo ver1 = cabeza;
    while (ver1 != null) {
      if (c == (con - 1)) {
        System.out.println(ver1.getNombre());
        break;
      }
      c++;
      ver1 = ver1.getEnlace();
    }


  }

  public Nodo buscarCodigo(String codigo) {
    Nodo ver = cabeza;
    while (ver != null) {
      if (ver.getNombre().getCodigo().equalsIgnoreCase(codigo)) {
        return ver;
      }
      ver = ver.getEnlace();
    }

    return null;
  }

  public void modCodigo(String codigo) {
    Nodo nodoActual = buscarCodigo(codigo);

    if (nodoActual != null) {
      nodoActual.getNombre().setNombre("maria");
    }
  }

  public void delete(String nombre) {
    Nodo nodoBuscado = buscar(nombre);
    Nodo eli = cabeza;
    Nodo anterior = null;
    if (nodoBuscado != null) {
      while (eli != null && eli != nodoBuscado) {
        anterior = eli;
        eli = eli.getEnlace();
      }

      if (anterior == null) {
        nodoBuscado = eli.getEnlace();
      } else {
        anterior.setEnlace(eli.getEnlace());
      }
    }
    eli = null;
  }

  public void ordenar() {

  }

  public void controlEdad() {
    Nodo tem = cabeza;
    String mayores = "", menores = "";
    int may = 0, men = 0;
    while (tem != null) {
      if (tem.getNombre().getEdad() >= 18) {
        mayores += tem.getNombre() + "\n";
        may++;
      } else {
        menores += tem.getNombre() + "\n";
        men++;
      }
      tem = tem.getEnlace();
    }
  }

  public void controlMateria() {

    Nodo tem = cabeza;
    String perdieron = "", ganaron = "";
    int perd = 0, gan = 0;
    while (tem != null) {
      if (tem.getNombre().getNota() >= 3.0) {
        ganaron += tem.getNombre() + "\n";
        gan++;
      } else {
        perdieron += tem.getNombre() + "\n";
        perd++;
      }
      tem = tem.getEnlace();
    }

  }

  public void ver() {
    Nodo ver = cabeza;
    String mensaje = "nombre  |  codigo  |  codigo  |  edad  |  nota\n";
    while (ver != null) {
      mensaje += ver.getNombre() + "\n";
      ver = ver.getEnlace();
    }
    JOptionPane.showMessageDialog(null, mensaje);
  }

}
