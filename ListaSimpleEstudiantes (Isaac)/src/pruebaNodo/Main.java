/*
Realizar un programa en java que implemente una lista simple enlazada para almacenar los siguientes datos. En cada nodo debe quedar almacenado: Codigo, Nombre, edad, nota definitiva de un
estudiante, una vez creada la lista realizar las siguientes funcionalidades( no se pueden repetir estudiantes con el mismo codigo)
•	Buscar por nombre a una persona y decir si está o no en la lista. Si la persona esta decir cual persona esta adelante y cual está detrás. 
•	Contar cuantas personas ganaron la materia
•	Permitir buscar una persona por cogido y cambiar el nombre de la persona
•	Eliminar una persona en la lista
•	Ordenar todos los nombres de acuerdo con la edad de mayor a menor.
•	Decir cuanta persona hay mayores de edad y cuantos menores de edad
•	Decir cuántos ganaron y cuantos perdieron la materia.
 */
package pruebaNodo;

/**
 *
 * @author ASUS
 */
public class Main {

  public static void main(String[] args) {
    Opera o = new Opera();
    Estudiante asa = new Estudiante("carlos", "14", 20, 4.5);
    Estudiante asa1 = new Estudiante("mangel", "15", 12, 1.5);
    Estudiante asa2 = new Estudiante("casa", "54", 61, 4.0);
    Estudiante asa3 = new Estudiante("der", "35", 21, 5.0);
    o.add(asa);
    o.add(asa1);
    o.add(asa1);
    o.add(asa2);
    o.add(asa3);

    o.buscarNombre("casa");
//    o.ganaron();
//    o.modCodigo("245");
//    o.delete("der");
//    o.controlEdad();
    o.ver();    
  }
}
