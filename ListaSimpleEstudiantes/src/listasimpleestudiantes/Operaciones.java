package listasimpleestudiantes;


import javax.swing.JOptionPane;


public class Operaciones {
    
    Valores cab;
    Valores col;
    
    Operaciones(){
    cab = null;
    col = null;
    
    }
    
    public void insertarInicio(String valor,String documento,String edad,int turno){
        Valores nuevo= new Valores();
        nuevo.setNombre(valor);
        nuevo.setCodigo(documento);
        nuevo.setEdad(edad);
        nuevo.setNota(turno);
        nuevo.setSgt(null);
        if(cab == null){
            cab=nuevo;
                          }
        else{
            
           nuevo.setSgt(cab);
           cab=nuevo;
               
        }
        
    }
    public void modificar(String documento){
        Valores temp = cab;
        
        while(temp!= null){
            if (temp.getCodigo().equals(documento)) {
                temp.setNombre(JOptionPane.showInputDialog(null,"Escriba el nuevo nombre del cliente"));
                break;
               
            }
            temp=temp.getSgt();
        }
    }
    public void aprobados(){
        int aprob = 0;
        int desap = 0;
        Valores temporal=cab;
          while(temporal!=null){
              if (temporal.getNota()>= 3.0 && temporal.getNota()<=5.0  ) {
                  aprob++;
              }else if(temporal.getNota()< 3.0){
                  desap++;
              }
              temporal=temporal.getSgt();
          }
        JOptionPane.showMessageDialog(null, "La cantidad de estudiantes aprobados es: "+aprob +"\n"
                + "La cantidad de estudiantes desaprobados es: "+desap);
    }
    public void verificarCodigos(){
          Valores temporal=cab;
          String cod = "";
          while(temporal!=null){
              cod = temporal.getCodigo();
              
              temporal=temporal.getSgt();
              if (cod) {
                  
              }
          }
    }
    public void eliminarPrimerNodo() {
    if (cab != null) {
        Valores nodoEliminado = cab;
        JOptionPane.showMessageDialog(null,"Siguiente: turno "+nodoEliminado.getNota());
        cab = cab.getSgt();
        nodoEliminado = null;
       
    }else{
        JOptionPane.showMessageDialog(null,"La cola esta vacia ");
    }
    
    
    }
    public void buscar(String nombre){
        Valores temp = cab;
        while(temp!= null){
            if (temp.getNombre().equals(nombre)) {
                JOptionPane.showMessageDialog(null,"Datos del estudiante \n"
                      + "nombre: "+temp.getNombre()+"\n"
                      + "documento: "+temp.getCodigo()+"\n"
                      + "edad: "+temp.getEdad()+"\n"
                      + "Nota: "+temp.getNota()+"\n"
                      + "Antes del estudiante: "+temp.getSgt().getNombre());
                
            }else if(temp == null && !temp.getNombre().equals(nombre)){
                           JOptionPane.showMessageDialog(null, "No se encontro el estudiante");
 
            }
            temp=temp.getSgt();
        }
    }
    public int conteo(){
        int c = 0;
        Valores temp = cab;
        while (temp!=null) {            
            c++;
            temp=temp.getSgt();
        }
        
        
        return c;
        
    }
    public void primeryUltimo(){
      
       Valores temp = cab;
               JOptionPane.showMessageDialog(null,"Primer Estudiante de la cola \n"
                       + "nombre: "+temp.getNombre()+"\n"
                      + "documento: "+temp.getCodigo()+"\n"
                      + "edad: "+temp.getEdad()+"\n"
                      + "Nota: "+temp.getNota());
          while (temp!=null) {
              if (temp.getSgt()== null) {
                 JOptionPane.showMessageDialog(null,"Ultimo Estudiante de la cola \n"
                        + "nombre: "+temp.getNombre()+"\n"
                      + "documento: "+temp.getCodigo()+"\n"
                      + "edad: "+temp.getEdad()+"\n"
                      + "Nota: "+temp.getNota()); 
              }
            temp = temp.getSgt();
        }
      
           
       }
//        if (temp == null) {
//            JOptionPane.showMessageDialog(null,"Ultimo cliente de la cola \n"
//                      + "nombre: "+temp.getValor()+"\n"
//                      + "documento: "+temp.getDocumento()+"\n"
//                      + "edad: "+temp.getEdad()+"\n"
//                      + "turno: "+temp.getTurno());
//        }
               
    
//    public void atenderCliente(){
//        Valores nodoActual = cab;
//        Valores nodoAnterior = null;
//        int turno = 1;
//    while (nodoActual != null) {
//        if (nodoActual.getTurno() == turno) {
//            if (nodoAnterior == null) {
//                nodoActual.setSgt(cab);
//            } else {
//                nodoAnterior; = nodoActual.siguiente;
//            }
//            
//            nodoActual = null;
//            return;
//        }
//        
//        nodoAnterior = nodoActual;
//        nodoActual = nodoActual.siguiente;
//    }
//    }

    
    public void insertarFinal(String valor,String documento,String edad,float nota){
        Valores tem = cab;
        Valores nuevo = new Valores();
        nuevo.setNombre(valor);
        nuevo.setCodigo(documento);
        nuevo.setEdad(edad);
        nuevo.setNota(nota);
        nuevo.setSgt(null);
        
        if (cab == null) {
            cab = nuevo;
        }else{
            while(tem.getSgt()!=null){
                tem = tem.getSgt();
            }
            tem.setSgt(nuevo);
        }
    }
    
    
    
    public void imprimir(){
    
          Valores temporal=cab;
          if (temporal == null) {
            JOptionPane.showMessageDialog(null,"la cola está vacia");
        }
          while(temporal!=null){
          
              JOptionPane.showMessageDialog(null,"nombre: "+temporal.getNombre()+"\n"
                      + "documento: "+temporal.getCodigo()+"\n"
                      + "edad: "+temporal.getEdad()+"\n"
                      + "Nota: "+temporal.getNota()+"\n");
          
              temporal=temporal.getSgt();
              
          }
          
    
    
         
         
    }
    
    
    
}
