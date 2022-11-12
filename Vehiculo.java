import java.util.Scanner;
import java.util.ArrayList;
public class Vehiculo{


    public static void main(String[] args){
        Usuario user = new Usuario("", "", "");
        Radiecito radio = new Radiecito();
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Radiecito> radiecito = new ArrayList<Radiecito>();
            
            String nombreuser, iduser, usuariouser ;
            System.out.println("Por favor ingrese su nombre: ");
            nombreuser = scanner.next();
            System.out.println("Por favor ingresa tu id: ");
            iduser = scanner.next();
            System.out.println("Por favor ingrese tu username: ");
            usuariouser = scanner.next();
            user.setNombre(nombreuser);
            user.setUsuario(usuariouser);
            user.setId(iduser);

            int opcion = 0;
            while(opcion !=3){
                System.out.println("Bienvenido a Mercedes Benz" );
                System.out.println("¿Qué deseas hacer el día de hoy?");
                System.out.println("1. Encender/Apagar radiecito");
                System.out.println("2. Probar los modos de un radiecito de un tipo de clase");
                System.out.println("3. Salir ");
                opcion = scanner.nextInt();
                if(opcion ==1){
                    int sel = 0;
                    System.out.println("Por favor elija un modo:" );
                    System.out.println("1. Encender o apagar Radio");
                    System.out.println("2. Subir o bajar volumen");
                    sel = scanner.nextInt();


                if(sel == 1){
                    System.out.println(radio.encender());
                    }
                else if(sel == 2){
                    System.out.println(radio.volumen());}
                }
                if(opcion ==2){
                    int seleccion = 0;

                    System.out.println("Por favor elija un modo:" );
                    System.out.println("1. radiecito -- Características: °Cambiar de FM a AM, o Cambiar emisoras, se cambiará en intervalos de 0.5, o Guardar emisoras. Se podrán guardar hasta 50 estaciones de radiecito, o Cargar emisora");
                    System.out.println("2. Reproduccion---características: o Seleccionar lista de reproducción (se tienen configuradas algunas para prueba), o Cambiar canción (tanto para adelante como para atrás), o Escuchar canción");
                    System.out.println( "3. Telefono --- características: o Conectar/Desconectar teléfono, o Mostrar contactos, o Llamar a contacto, o Finalizar llamada, o Cambiar a speaker o auriculares ");
                    System.out.println("4.Producción: --°Planificar viajes");
                    
                    seleccion = scanner.nextInt();
                if(seleccion == 1){

                    System.out.println("Modo radiecito");

                    System.out.println("Funciones:");
                    System.out.println("¿Interesado en el producto?...Prueba sus funciones:)");
                    
                    System.out.println(radio.cambiarFMAM());
                    System.out.println(radio.cambiarEmisora());
                    System.out.println(radio.guardarEmisora());
                    System.out.println(radio.cargarEmisora());}
                else if(seleccion == 2){
                    System.out.println("Modo Reproducción");

                    System.out.println("Funciones:");
                    System.out.println("¿Interesado en el producto?...Prueba sus funciones:)");

                    System.out.println(radio.seleccionarLista());
                    System.out.println(radio.cambiarCancion());
                    System.out.println(radio.escucharCancion());
                    System.out.println(radio.cargarCanciones());
                }

                else if(seleccion == 3){
                    System.out.println("Modo Telefono");

                    System.out.println("Funciones:");
                    System.out.println("¿Interesado en el producto?...Prueba sus funciones:)");

                    System.out.println(radio.conectDesconectTelefono());
                    System.out.println(radio.agregarContactos());
                    System.out.println(radio.mostrarContactos());
                    System.out.println(radio.llamarContactos());
                    System.out.println(radio.cambiarSpeaker());
                    System.out.println(radio.finalizarLlamada());



                }

                else if(seleccion == 4){
                    System.out.println("Modo Productividad");

                    System.out.println("Funciones:");
                    System.out.println("¿Interesado en el producto?...Prueba sus funciones:)");

                    System.out.println(radio.planificarViajes());
                   


                }
                if(opcion ==3){
                    System.out.println("Hasta pronto :)");
                    break;
                }
                
                        


            
       

    }
}

}
    }
}