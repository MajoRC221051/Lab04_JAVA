//POO
// Grupo 1
//Luis Cordon
//María José Ramírez
//Interface

import java.util.ArrayList;
import java.util.Scanner;
public class Radiecito implements RadioA{
    Scanner teclado = new Scanner(System.in);
    private ArrayList<Emisora> emisoras;
    private ArrayList<Cancion> canciones;
    private ArrayList<Contacto> contactos;

    public Radiecito(){
        emisoras = new ArrayList<Emisora>();
        canciones = new ArrayList<Cancion>();
        contactos = new ArrayList<Contacto>();
    }

    
    /** 
     * @param nombre
     * @param frecuencia
     * @param FMAM
     */
    public void agregarEmisora(String nombre, long frecuencia, boolean FMAM){
        emisoras.add(new Emisora(nombre, frecuencia, FMAM));
    }

    
    /** 
     * @param nombre
     * @param duracion
     * @param autor
     * @param genero
     */
    public void agregarCancion(String nombre, String duracion, String autor, String genero){

        canciones.add(new Cancion(nombre, duracion, autor, genero));
    }

    
    /** 
     * @param nombre
     * @param numero
     * @param CDT
     * @param SA
     */
    public void agregarContacto(String nombre, long numero, boolean CDT, boolean SA){
      
   


        contactos.add(new Contacto(nombre, numero, CDT, SA));
    }

    Scanner s = new Scanner(System.in);
    
    /** 
     * @return String
     */
    //Radio
    public String cambiarFMAM(){
        String fMAM = "";
        System.out.println("¿Cuál es el modo del radio: ");
        fMAM = s.next();
        if (fMAM == "FM"){
            fMAM = "Modo FM"; 
        }
        else if (fMAM == "AM"){
           fMAM  = "Modo AM";
        }
        else{
            System.out.println("Este modo no está disponible");
        }
        return fMAM;
    }

    
    /** 
     * @return double
     */
    public double cambiarEmisora(){
        double frecuencia = 0;
        System.out.println("Ingrese la emisora y automaticamente cambiaremos de frecuencia: ");
        frecuencia = s.nextLong();
        s.nextLine();
        return frecuencia + 0.5;
    }

    
    /** 
     * @return String
     */
    public String encender(){
        String encendido = "";
        System.out.println("¿Cuál es el modo del Radio (1. Encendido, 2. Apagado)");
        encendido = s.next();
        if (encendido == "1"){
            return "Encendido"; 
        }
        else if (encendido == "2"){
          return "Apagado";
           

        }
       
        return encendido;
    }

    
    /** 
     * @return String
     */
    public String volumen(){
        String barra = "";
        System.out.println("¿Desea aumentar el volumen (1. Sí, 2. No)");
        barra = s.next();
        if (barra == "1"){
            return "Volumen aumentado"; 
        }
        else if (barra == "2"){
          return "Volumen disminuido";
        }
        
        return barra;
    }

    
    /** 
     * @return String
     */
    public String guardarEmisora(){
        boolean FMAM = false;
        double frecuencia = 0;
        String nombre = "";

        System.out.println("Ingrese el nombre de la emisora: ");
        nombre = s.next();
        s.nextLine();
        System.out.println("Ingrese la frecuencia de la emisora: ");
        frecuencia = s.nextDouble();
        s.nextLine();
        if (FMAM == true){
            FMAM = false; 
        }
        else if (FMAM == false){
            FMAM = true;
        }
    


        emisoras.add(new Emisora(nombre, frecuencia, FMAM));
        return ("Se ha agregado correctamente tu emisora");
    }

    
    /** 
     * @return String
     */
    public String cargarCanciones(){
        String result = "Canciones \n======================\n";
        for (Cancion canciones : canciones){ 
            result = result + canciones.toString();
        }
        return result+"\n======================\n";
    }
    
    /** 
     * @return String
     */
    // *en proceso*
    public String cargarEmisora(){
        String result = "EMISORAS \n======================\n";
        for (Emisora emisora : emisoras){ 
            result = result + emisora.toString();
        }
        return result+"\n======================\n";
    }

    
    /** 
     * @return String
     */
    public String escucharCancion(){
        String nombre = "";
        String duracion = "";
        String autor = "";
        String genero = "";

        System.out.println("Ingrese el nombre de la canción: ");
        nombre = s.next();
        s.nextLine();
        System.out.println("Ingrese la duración de la canción: ");
        duracion = s.next();
        s.nextLine();
        System.out.println("Ingrese el nombre del autor: ");
        autor = s.next();
        System.out.println("Ingrese el género: ");
        genero = s.next();

        canciones.add(new Cancion(nombre, duracion, autor, genero));
        return ("Se ha agregado correctamente tu canción");
    
    }
    
    /** 
     * @return String
     */
    //Reproduccion
    public String seleccionarLista(){
        String x;
        x = "hola";
        int tipoEmisora;
        System.out.println("¿Qué lista desea seleccionar?");
        System.out.println("1: Not today, 2: Mr. Blue Sky, 3: Bitter Sweet Symphony");
        tipoEmisora = teclado.nextInt();
        switch(tipoEmisora){
            case 1:
                x = "Not Today";
                break;
            case 2:
                x = "Mr. Blue Sky";
                break;
            case 3:
                x = "Bitter Sweet Symphony";
                break;
        }
        return "Se ha seleccionado "+x;
    }

    
    /** 
     * @return String
     */
    // *en proceso*
    public String cambiarCancion(){
        String x;
        x = "hola";
        int tipoEmisora;
        System.out.println("¿Hacia dónde quiere cambiar?");
        System.out.println("1: Atrás, 2: Adelante");
        tipoEmisora = teclado.nextInt();
        switch(tipoEmisora){
            case 1:
                x = "Se ha cambiado hacia atrás";
                break;
            case 2:
                x = "Se ha cambiado hacia adelante";
                break;
        }
        return x;
    }

    
    /** 
     * @return String
     */
    // *en proceso*
   

    
    /** 
     * @return String
     */
    //Télefono
    public String conectDesconectTelefono(){
        String cDT = "";
        System.out.println("¿Cuál es el modo del telefono: 1. Desconectado, 2. Conectado ");
        cDT = s.next();
        if (cDT == "1"){
            cDT = "Desconectado"; 
        }
        else if (cDT == "AM"){
           cDT  = "Conectado";
        }
        return cDT;
    }

    
    /** 
     * @return String
     */
    public String agregarContactos(){
        
        String nombre = "";
        long numero = 0;
        boolean CDT = false;
        boolean SA = false;

        System.out.println("Ingrese el nombre del contacto: ");
        nombre = s.next();
        s.nextLine();
        System.out.println("Ingrese el no. del contacto: ");
        numero = s.nextLong();
        s.nextLine();
        CDT = false;
        SA = false;

        contactos.add(new Contacto(nombre, numero, CDT, SA));
        return ("Se ha agregado correctamente el contacto");
    }
    
    /** 
     * @return String
     */
    public String mostrarContactos(){
        String result = "CONTACTOS\n======================\n";
        for (Contacto contactos : contactos){ 
            result = result + contactos.toString();
        }
        return result+"\n======================\n";
    }

    
    /** 
     * @return String
     */
    // *en proceso*
    public String llamarContactos(){
        String llamada;
        System.out.println("¿a quién desea llamar?");
        llamada = teclado.nextLine();
        return "Llamando a "+llamada;
    }

    
    /** 
     * @return String
     */
    // *en proceso*
    public String finalizarLlamada(){
        return "se ha finalizado la llamada";
    }

    
    /** 
     * @return String
     */
    public String cambiarSpeaker(){
        String SA = "";
        System.out.println("¿Cuál es el modo del speaker (1. Encendido, 2. Apagado)");
        SA = s.next();
        if (SA == "1"){
            return "Encendido"; 
        }
        else if (SA == "Apagado"){
           return "Modo AM";
        }
        return SA;
    }
    

    
    /** 
     * @return String
     */
    //Productividad
    // *en proceso*
    public String planificarViajes(){
        String viaje;
        System.out.println("¿hacia dónde quiere viajar?");
        viaje = teclado.nextLine();
        return "planificando viaje a "+viaje;
    }    

}