//EJERCICIO 8 PRACTICA 9

import java.util.Stack; //a importa las clases necesarios para contruir una pila

public class Camisas{
    public static void main (String[] args){
        //Crear una pila llamada camisas 
        Stack<String> camisas = new Stack<String>();
        //Agregar 3 camisas
        camisas.push("CamisaRoja");
        camisas.push("CamisaAmarilla");
        camisas.push("CamisaAzul");
        //Imprime la ultima agregada
        System.out.println("La ultima camisa agregada es: " + camisas.peek());

        //bucle para sacar la camisa mienstras la pila no esta vacia
        System.out.println("Sacando camisas de la pila: ");
        while (!camisas.isEmpty()){
            String camisaSacada = camisas.pop();
            System.out.println("Se saco: " + camisaSacada);
        }
    }
}