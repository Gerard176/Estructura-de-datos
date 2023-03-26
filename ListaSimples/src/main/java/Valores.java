public class Valores {
     private String valor;
     private Valores sgt;
     private Valores ant;
     private String documento;
     private String edad;
     private int turno;

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

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
     
     
    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }
    
  

   
    
    
}
