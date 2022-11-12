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

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFrecuencia() {
        return this.frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public boolean isFMAM() {
        return this.FMAM;
    }

    public boolean getFMAM() {
        return this.FMAM;
    }

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