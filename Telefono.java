import java.util.Scanner;
import java.util.ArrayList;

public class Telefono{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int opcion;
        boolean seguir=true;

        String nombre;
        String telefono;

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> telefonos = new ArrayList<>();

        nombres.add ("Alan");
        telefonos.add ("5512345678");
        nombres.add ("Irvin");
        telefonos.add ("5598745612");

        System.out.println("Telefono Prendido");

    do{
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Agregar contacto.");
        System.out.println("2. Buscar contacto.");
        System.out.println("3. Editar contacto.");
        System.out.println("4. Eliminar contacto."); 
        System.out.println("5. Apagar telefono.");

        opcion = sc.nextInt();
        
        sc.nextLine(); //Limpiar buffer
        switch (opcion){
            case 1:
                System.out.println("Agregar Contacto");
                //pedir el nombre
                System.out.println("Ingrese el nombre del contacto");
                nombre = sc.nextLine();
                //pedir el numero
                System.out.println("Ingrese el numero del contacto");
                telefono = sc.nextLine();
                //guardar el nombre en la lista de nombres
                nombres.add(nombre);
                //guardar el numero en la lista de telefonos
                telefonos.add(telefono);
                break;
            case 2:
                System.out.println("Buscar Contacto");
                //Pedir el nombre
                System.out.println("Ingrese el nombre del contacto a buscar");
                nombre = sc.nextLine();
                int indiceBuscar= -1;

                for(int i = 0; i < nombres.size(); i++){
                    if(nombre.equals(nombres.get(i))){
                        indiceBuscar = i;
                        break;
                    }
                }
                if(indiceBuscar != -1){
                    System.out.println(nombre + ": " + telefonos.get(indiceBuscar));
                    System.out.println("¿Quieres llamar? (1.Si, 2.No)");
                    int respuestaBuscar = sc.nextInt();
                    if(respuestaBuscar == 1){
                        System.out.println("Llamando...");
                    }
                    else{
                        System.out.println("salir");
                    }
                }
                else{
                    System.out.println("El contacto no existe");
                }
                sc.nextLine();

                break;
            case 3:
                System.out.println("Editar Contacto");
                //pedir el nombre
                System.out.println("Ingrese el nombre del contacto a editar");
                nombre = sc.nextLine();
                int indiceEditar= -1;
                for(int i = 0; i < nombres.size();i++){
                    if(nombre.equals(nombres.get(i))){
                        indiceEditar = i;
                    }
                }
                if(indiceEditar != -1){
                    System.out.println("1. Editar nombre");
                    System.out.println("2. Editar numero");
                    int opcionEditar = sc.nextInt();
                    sc.nextLine();
                    switch(opcionEditar){
                        case 1:
                            System.out.println("Ingrese el nuevo nombre");
                            String nombreNuevo = sc.nextLine();
                            //Editar el nombre
                            nombres.set(indiceEditar,nombreNuevo);
                            System.out.println(nombreNuevo);
                            break;
                        case 2:
                            System.out.println("Ingrese el nuevo numero");
                            String telefonoNuevo = sc.nextLine();
                            //Editar el numero
                            telefonos.set(indiceEditar,telefonoNuevo);
                            break;
                        default:
                            System.out.println("opcion no valida, intente de nuevo");
                    }
                }
                else{
                    System.out.println("El contacto no existe");
                }
                sc.nextLine();

                System.out.println(nombres);
                break;
            case 4:
                System.out.println("Eliminar Contacto");
                //pedir el nombre
                System.out.println("Ingrese el nombre del contacto a eliminar");
                nombre = sc.nextLine();
                //Eliminar el nombre de la lista de contactos
                nombres.remove(nombre);

                int indiceEliminar = -1;
                for(int i = 0; i < nombres.size();i++){
                    if(nombre.equals(nombres.get(i))){
                        indiceEliminar = i;
                    }
                }
                if(indiceEliminar != -1){
                    telefonos.remove(indiceEliminar);
                }
                else{
                    System.out.println("El contacto no existe");
                }

                break;
            case 5:
                seguir=false;
                System.out.println("Apagando telefono...");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");

        }
        System.out.println();
    }
    while(seguir);
    sc.close();
    }
}
