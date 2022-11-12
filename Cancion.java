//POO
//Grupo #1
//Luis Cordon
//María José Ramírez

public class Cancion{
    private String nombre;
    private String duracion;
    private String autor;
    private String genero;

    public Cancion() {
    }

    public Cancion(String nombre, String duracion, String autor, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.autor = autor;
        this.genero = genero;
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
     * @return String
     */
    public String getDuracion() {
        return this.duracion;
    }

    
    /** 
     * @param duracion
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    
    /** 
     * @return String
     */
    public String getAutor() {
        return this.autor;
    }

    
    /** 
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    /** 
     * @return String
     */
    public String getGenero() {
        return this.genero;
    }

    
    /** 
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /** 
    * @return String
    */
    public String toString() {
        return "\n" +
            "nombre: " + getNombre() + 
            " \nduración: " + getDuracion() + 
            " \nautor: " + getAutor() + 
            " \ngénero: " + getGenero() + 
            "\n";
    }

}