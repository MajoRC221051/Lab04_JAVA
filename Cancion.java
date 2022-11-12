public class Cancion{
    private String nombre;
    private float duracion;
    private String autor;
    private String genero;

    public Cancion() {
    }

    public Cancion(String nombre, float duracion, String autor, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.autor = autor;
        this.genero = genero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDuracion() {
        return this.duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return this.genero;
    }

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