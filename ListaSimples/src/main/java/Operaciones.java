
import javax.swing.JOptionPane;


public class Operaciones {
    
    Valores cab;
    
    
    Operaciones(){
    cab=null;
    
    }
    
    public void insertarInicio(String valor,String documento,String edad,int turno){
        Valores nuevo= new Valores();
        nuevo.setValor(valor);
        nuevo.setDocumento(documento);
        nuevo.setEdad(edad);
        nuevo.setTurno(turno);
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
            if (temp.getDocumento().equals(documento)) {
                temp.setValor(JOptionPane.showInputDialog(null,"Escriba el nuevo nombre del cliente"));
                temp.setDocumento(JOptionPane.showInputDialog(null,"Escriba el nuevo documento del cliente"));
                temp.setEdad(JOptionPane.showInputDialog(null,"Escriba la nueva edad del cliente"));
                
                break;
               
            }
            temp=temp.getSgt();
        }
    }
    public void acomodarTurnos(){
          Valores temporal=cab;
          int turno = 0;
          while(temporal!=null){
              turno++;
              temporal.setTurno(turno);
              temporal=temporal.getSgt();
          }
    }
    public void eliminarPrimerNodo() {
    if (cab != null) {
        Valores nodoEliminado = cab;
        JOptionPane.showMessageDialog(null,"Siguiente: turno "+nodoEliminado.getTurno());
        cab = cab.getSgt();
        nodoEliminado = null;
       
    }else{
        JOptionPane.showMessageDialog(null,"La cola esta vacia ");
    }
    
    
    }
    public void buscar(String documento){
        Valores temp = cab;
        while(temp!= null){
            if (temp.getDocumento().equals(documento)) {
                JOptionPane.showMessageDialog(null,"Datos del cliente \n"
                        + "nombre: "+temp.getValor()+"\n"
                      + "documento: "+temp.getDocumento()+"\n"
                      + "edad: "+temp.getEdad()+"\n"
                      + "turno: "+temp.getTurno());
                break;
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
               JOptionPane.showMessageDialog(null,"Primer cliente de la cola \n"
                        + "nombre: "+temp.getValor()+"\n"
                      + "documento: "+temp.getDocumento()+"\n"
                      + "edad: "+temp.getEdad()+"\n"
                      + "turno: "+temp.getTurno());
          while (temp!=null) {
              if (temp.getSgt()== null) {
                 JOptionPane.showMessageDialog(null,"Ultimo cliente de la cola \n"
                        + "nombre: "+temp.getValor()+"\n"
                      + "documento: "+temp.getDocumento()+"\n"
                      + "edad: "+temp.getEdad()+"\n"
                      + "turno: "+temp.getTurno()); 
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

    
    public void insertarFinal(String valor,String documento,String edad,int turno){
        Valores tem = cab;
        Valores nuevo = new Valores();
        nuevo.setValor(valor);
        nuevo.setDocumento(documento);
        nuevo.setEdad(edad);
        nuevo.setTurno(turno);
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
          
              JOptionPane.showMessageDialog(null,"nombre: "+temporal.getValor()+"\n"
                      + "documento: "+temporal.getDocumento()+"\n"
                      + "edad: "+temporal.getEdad()+"\n"
                      + "turno: "+temporal.getTurno());
          
              temporal=temporal.getSgt();
          }
          
    
    
         
         
    }
    
    
    
}
