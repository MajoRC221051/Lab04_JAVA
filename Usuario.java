//POO
//Grupo #1
//Luis Cordon
//María José Ramírez

public class Usuario {
    private String nombre;
    private String id;
    private String usuario;


    public Usuario(String nombre, String id, String usuario) {
        this.nombre = nombre;
        this.id = id;
        this.usuario = usuario;
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
    public String getId() {
        return this.id;
    }

    
    /** 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    
    /** 
     * @return String
     */
    public String getUsuario() {
        return this.usuario;
    }

    
    /** 
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", id='" + getId() + "'" +
            ", usuario='" + getUsuario() + "'" +
            "}";
    }

    
}

