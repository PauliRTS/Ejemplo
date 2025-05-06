import java.util.Scanner;

//PREHUNTA 9 PRACTICA 3 DESARROLLO
public class SaldoAmigos{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el saldo disponible: ");
        double saldoActualizado = sc.nextDouble();

         System.out.print("Ingresa la cantidad a retirar: ");
        double cantidadARetirar = sc.nextDouble();

        saldoActualizado = saldoActualizado - cantidadARetirar;
        
        double cantidadParaCadaAmigo = saldoActualizado / 3;

        boolean puedeComprarTicket = cantidadParaCadaAmigo >= 250;

        System.out.println("Le di a cada amigo " + cantidadParaCadaAmigo);


        sc.close();
    }
}
