//POO
//Grupo #1
//Luis Cordon
//María José Ramírez

//Interface

public interface RadioA{

    public String encender();
    public String  volumen();
    //Radio
    public String cambiarFMAM();
    public double cambiarEmisora();
    public String guardarEmisora();
    public String cargarEmisora();
    //Reproduccion
    public String seleccionarLista();
    public String cambiarCancion();
    public String escucharCancion();
    public String cargarCanciones();

    //Télefono
    public String conectDesconectTelefono();
    public String mostrarContactos();
    public String llamarContactos();
    public String finalizarLlamada();
    public String cambiarSpeaker();
    public String agregarContactos();
    //Productividad
    public String planificarViajes();
}