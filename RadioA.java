public interface RadioA{
    //Radio
    public String cambiarFMAM();
    public double cambiarEmisora();
    public String guardarEmisora();
    public String cargarEmisora();
    //Reproduccion
    public String seleccionarLista();
    public String cambiarCancion();
    public String escucharCancion();
    //Télefono
    public String conectDesconectTelefono();
    public String mostrarContactos();
    public String llamarContactos();
    public String finalizarLlamada();
    public String cambiarSpeaker();
    //Productividad
    public String planificarViajes();
}