import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        Contacto contacto = new Contacto("Brenda", "bre@correo.com",new ArrayList<>(Arrays.asList("5512345678", "5598745612")));
        //contacto.mostrarInformacion();

        ArrayList<Contacto> contactos = new ArrayList<>(); 
        contactos.add(contacto);

        GestorAgenda gestoragenda = new GestorAgenda(contactos);
        String nombre;
        boolean seguir = true;

        do{
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Agregar contacto.");
            System.out.println("2. Buscar contacto.");
            System.out.println("3. Editar contacto.");
            System.out.println("4. Eliminar contacto."); 
            System.out.println("5. Llamar contacto.");
            System.out.println("6. Apagar telefono.");

           int opcion = sc.nextInt();
        
            sc.nextLine(); //Limpiar buffer

            
            switch(opcion){

            case 1:
                gestoragenda.agregarContacto(sc);
                
            break;
            case 2:
                nombre = sc.nextLine();
                gestoragenda.buscarContacto(nombre, gestoragenda.contactos);

            break;
            case 3:
                nombre = sc.nextLine();
                gestoragenda.editarContacto(nombre, sc);
            break;
            case 4:
                nombre = sc.nextLine();
                gestoragenda.eliminarContacto(nombre);
            break;
            case 5:
                nombre = sc.nextLine();
                gestoragenda.llamarContacto(nombre, sc);
            break;
            case 6:
                seguir=false;
                System.out.println("Apagando telefono...");
                break;
            default: 
            System.out.println("Opción no válida. Intente nuevamente.");
             }
             sc.nextLine();
            System.out.println();
        }
        while(seguir);
       
    }
}


class GestorAgenda {

    ArrayList<Contacto> contactos;

    

    public static int buscarContacto(String nombreIngresado, ArrayList<Contacto> contactos){

                int indiceContacto= -1;

                for(int i = 0; i < contactos.size(); i++){
                    if(contactos.get(i).nombre.equals(nombreIngresado)){
                        indiceContacto = i;


                        break;
                    }
                    System.out.println(contactos.get(indiceContacto).numeros);
                    }
    return indiceContacto;
    }

    public void eliminarContacto(String nombreIngresado){
        int indiceBuscar = buscarContacto(nombreIngresado, contactos);
        contactos.remove(indiceBuscar);
        System.out.println("Contacto Eliminado");
    }

    public void editarContacto(String nombreIngresado, Scanner sc){
        int indiceBuscar = buscarContacto(nombreIngresado, contactos);

        System.out.println(indiceBuscar);
        
        if(indiceBuscar != -1){
                    System.out.println("1. Editar nombre");
                    System.out.println("2. Editar numero");
                    int opcionEditar = sc.nextInt();
                    sc.nextLine();
                    switch(opcionEditar){
                        case 1:
                            System.out.println("Ingrese el nuevo nombre");
                            String nombreNuevo = sc.nextLine();
                            //Editar el nombre
                            contactos.get(indiceBuscar).nombre = nombreNuevo;
                            System.out.println(nombreNuevo);
                            break;
                        case 2:
                            contactos.get(indiceBuscar).mostrarInformacion();
                            System.out.println("Elige un numero.");
                            int indiceEditar = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ingrese el nuevo numero");
                            String telefonoNuevo = sc.nextLine();
                            contactos.get(indiceBuscar).numeros.set(indiceEditar,telefonoNuevo);
                            break;
                        default:
                            System.out.println("opcion no valida, intente de nuevo");
                        }
                    }
    }


   public void agregarContacto(Scanner sc){

    System.out.println("Ingrese el nombre del contacto.");
    String nombre = sc.nextLine();
    System.out.println("Ingrese su correo.");
    String correo = sc.nextLine();
    System.out.println("Ingrese su numero de telefono");
    String numero = sc.nextLine();
    Contacto contacto = new Contacto(nombre, correo ,new ArrayList<>(Arrays.asList(numero)));
    System.out.println("Desea agregar otro numero de telefono a este contacto?");
    String respuesta = sc.nextLine();
    while(respuesta.equals("si")){
        System.out.println("Ingrese su numero de telefono");
        numero = sc.nextLine();
        contacto.numeros.add(numero);

        System.out.println("Desea agregar otro numero de telefono a este contacto?");
        respuesta = sc.nextLine();
    }
   }

   public void llamarContacto(String nombreIngresado, Scanner sc){
    int indiceBuscar = buscarContacto(nombreIngresado, contactos);
    contactos.get(indiceBuscar).mostrarInformacion();
    System.out.println("Elige un numero.");
    int indiceLlamar = sc.nextInt();
    sc.nextLine();
    System.out.println("Llamando a " + nombreIngresado);
    System.out.println(contactos.get(indiceBuscar).numeros.get(indiceLlamar));
    
   }

    public GestorAgenda(ArrayList<Contacto> contactos){
        this.contactos = contactos;
    }
}

class Contacto{
    //Atributos .- Datos asociados al objeto que lo definen y caracterizan

    //Nombre String
    String nombre;
    //Numero o numeros de telefono Lista de Strings
    ArrayList<String> numeros = new ArrayList<>();
    //correo String
    String correo;

    //Metodos.- Funciones que se asocian a cada uno de los objetos para
    //realizar diversas tareas.

    //Mostrar la informacion

    public void mostrarInformacion(){
        System.out.println(nombre);
        for(int i = 0; i < numeros.size(); i++){
            System.out.println("Numero " + (i+1) + ".- " + numeros.get(i));
        }
        System.out.println(correo);
    }
    //Constructor de la clase
public Contacto(String nombre, String correo, ArrayList<String> numeros){
    this.nombre = nombre;
    this.correo = correo;
    this.numeros = numeros;

}
}

