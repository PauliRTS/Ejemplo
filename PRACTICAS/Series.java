
//PREGUNTA 2 PRACTICA 4
public class Series{
    public static void main (String[] args){

        int numero = 1;

        int a = 0;
        int b = 1;


        System.out.println("Serie Numeros impares positivos:");
        for(int i=1; i<15; i++){

            
            System.out.print(numero + " ");
            numero += 2;
        }
        System.out.println("");
        
        System.out.println("Serie de Fibonacci:");
        for(int i=1; i<15; i++){

            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

    }
}
