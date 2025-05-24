//EJERCICIO 9 PRACTICA 7

import java.util.ArrayList;

public class RecibeMascotas {
    // Atributos de la clase
    private String nombrePerro;
    private int edad;
    private String raza;
    private String tamaño;
    private String nombreDueño;

    // Constructor
    public RecibeMascotas(String nombrePerro, int edad, String raza, String tamaño, String nombreDueño) {
        this.nombrePerro = nombrePerro;
        this.edad = edad;
        this.raza = raza;
        this.tamaño = tamaño;
        this.nombreDueño = nombreDueño;
    }

    // Método main
    public static void main(String[] args) {
        // i. Crear un arreglo dinámico de tipo de la clase
        ArrayList<RecibeMascotas> mascotas = new ArrayList<>();

        // ii. Hacer una instancia para crear un objeto de tipo de la clase
        // iii. Asignar valores a los atributos
        RecibeMascotas mascota1 = new RecibeMascotas("Max", 3, "Labrador", "Grande", "Juan Pérez");
        RecibeMascotas mascota2 = new RecibeMascotas("Luna", 5, "Chihuahua", "Pequeño", "María García");

        // iv. Agregar el objeto creado al arreglo
        mascotas.add(mascota1);
        mascotas.add(mascota2);

        // v. Imprimir la cantidad de perros
        System.out.println("Perros actuales en la estética: " + mascotas.size());
        
        System.out.println("\nDetalles de las mascotas:");
        for (RecibeMascotas mascota : mascotas) {
            System.out.println("Nombre: " + mascota.nombrePerro + 
                             ", Dueño: " + mascota.nombreDueño +
                             ", Raza: " + mascota.raza +
                             ", Edad: " + mascota.edad +
                             ", Tamaño: " + mascota.tamaño);
        }
    }
}