//PREGUNTA 6 PRACTICA 5

import java.util.Scanner;

public class Semana { 
    public static void main(String[] args) { 
        Scanner semana = new Scanner (System.in);
        
        int dia;

        System.out.println("Introduce un numero del 1 al 7 para conocer el dia de la semana.");
        dia = semana.nextInt();

        switch(dia){
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("NUMERO NO VALIDO");
        }

        semana.close();
    } 
} 