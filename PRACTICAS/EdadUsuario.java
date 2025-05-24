//EJERCICIO 5 PRACTICA 8 

import java.util.Scanner; // a. Importar la clase Scanner

public class EdadUsuario {
    public static void main(String[] args) {
        // b. Crear objeto Scanner llamado 'datos'
        Scanner datos = new Scanner(System.in);
        
        // c. Crear variables nombre y edad
        String nombre;
        int edad;
        
        // d. Leer nombre completo
        System.out.println("Ingresa tu nombre completo:");
        nombre = datos.nextLine();
        
        // e. Leer edad
        System.out.println("Ingresa tu edad:");
        edad = datos.nextInt();
        
        // f. y g. Condicional para mayor/menor de edad
        if (edad > 18) {
            System.out.printf("Tu nombre es " + nombre + " tienes " + edad + " años y eres mayor de edad.\n");
        } else {
            System.out.printf("Tu nombre es " + nombre + " tienes " + edad + " años y eres menor de edad.\n");
        }
        
        // h. Mostrar número de caracteres del nombre
        System.out.printf("Tu nombre tiene " + nombre.length() + " caracteres. \n" );
        
        // Cerrar el Scanner
        datos.close();
    }
}