import java.util.Queue;
import java.util.LinkedList;

public class Nombres{
    public static void main (String[] args){
        Queue<String> usuarios = new LinkedList<>();
        usuarios.add("Alan");
        usuarios.add("Irvin");
        usuarios.add("Brenda");
        usuarios.add("Sara");
        usuarios.add("Gisela");
        
        System.out.println("El nombre a eliminar es: " + usuarios.remove() );
        System.out.println("El nombre a eliminar es: " + usuarios.remove() );
        System.out.println("El nombre a eliminar es: " + usuarios.remove() );

        System.out.println("El proximo nombre a eliminar es: " + usuarios.element() );
    }
}