//POO
//Grupo #1
//Luis Cordon
//María José Ramírez
public class Emisora{
    private String nombre;
    private double frecuencia;
    private boolean FMAM;

    public Emisora() {
        FMAM = true;
    }

    public Emisora(String nombre, double frecuencia, boolean FMAM) {
        this.nombre = nombre;
        this.frecuencia = frecuencia;
        this.FMAM = FMAM;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return double
     */
    public double getFrecuencia() {
        return this.frecuencia;
    }

    
    /** 
     * @param frecuencia
     */
    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    
    /** 
     * @return boolean
     */
    public boolean isFMAM() {
        return this.FMAM;
    }

    
    /** 
     * @return boolean
     */
    public boolean getFMAM() {
        return this.FMAM;
    }

    
    /** 
     * @param FMAM
     */
    public void setFMAM(boolean FMAM) {
        this.FMAM = FMAM;
    }

    /** 
    * @return String
    */
    public String toString() {
        return "\n" +
            "nombre: " + getNombre() + 
            " \nfrecuencia: " + getFrecuencia() + 
            "\n";
    }

}