public class Usuario {
    private String nombre;
    private String id;
    private String usuario;


    public Usuario(String nombre, String id, String usuario) {
        this.nombre = nombre;
        this.id = id;
        this.usuario = usuario;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", id='" + getId() + "'" +
            ", usuario='" + getUsuario() + "'" +
            "}";
    }

    
}

