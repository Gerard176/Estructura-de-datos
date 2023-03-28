package listasimpleestudiantes;

public class Valores {
     private String nombre;
     private Valores sgt;
     private Valores ant;
     private String codigo;
     private String edad;
     private float nota;

    public Valores getSgt() {
        return sgt;
    }

    public void setSgt(Valores sgt) {
        this.sgt = sgt;
    }

    public Valores getAnt() {
        return ant;
    }

    public void setAnt(Valores ant) {
        this.ant = ant;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
     
     
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
  

   
    
    
}
