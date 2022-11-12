//POO
//Grupo #1
//Luis Cordon
//María José Ramírez

public class Contacto{
    private String nombre;
    private long numero;
    private boolean CDT;
    private boolean SA;

    public Contacto() {
        CDT = true;
        SA = true;
    }

    public Contacto(String nombre, long numero, boolean CDT, boolean SA) {
        this.nombre = nombre;
        this.numero = numero;
        this.CDT = CDT;
        this.SA = SA;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }


    
    /** 
     * @return long
     */
    public long getNumero() {
        return this.numero;
    }


    
    /** 
     * @return boolean
     */
    public boolean getCDT() {
        return this.CDT;
    }


    
    /** 
     * @return boolean
     */
    public boolean getSA() {
        return this.SA;
    }
    
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }

    /**
     * @return boolean return the CDT
     */
    public boolean isCDT() {
        return CDT;
    }

    /**
     * @param CDT the CDT to set
     */
    public void setCDT(boolean CDT) {
        this.CDT = CDT;
    }

    /**
     * @return boolean return the SA
     */
    public boolean isSA() {
        return SA;
    }

    /**
     * @param SA the SA to set
     */
    public void setSA(boolean SA) {
        this.SA = SA;
    }

    /** 
    * @return String
    */
    public String toString() {
        return "\n" +
            "nombre: " + getNombre() + 
            " \nnumero: " + getNumero() + 
            "\n";
    }

}