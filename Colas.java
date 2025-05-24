import java.util.Queue;
import java.util.LinkedList;

public class Colas{
    public static void main (String[] args){
        Queue<String> cadenas = new LinkedList<>();
        cadenas.add("Hola");
        cadenas.add("Mundo");
        cadenas.add("en");
        cadenas.add("java");

        cadenas.remove();
        cadenas.remove();
        System.out.println("Siguiente: " + cadenas.element());
    }
}