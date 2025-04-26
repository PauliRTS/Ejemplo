import java.util.Scanner;

public class Contrasenia2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int intentosMax = 2;
        String passwordSys = "1234";
        boolean seguir = true;
        int bloqueMax = 3;
        int bloque = 0;

        System.out.println("Ingresa la contraseña");
        String password = sc.nextLine();
        int intentos = 1;

        while( bloqueMax > bloque && !passwordSys.equals(password)){
            
            System.out.println("Contraseña incorrecta, Ingresa la contraseña nuevamente");
            password = sc.nextLine();
            intentos++;

            if(intentos > intentosMax){
                System.out.println("Maximo numero de intentos, espera unos segundos");
                intentos = 0;
                bloque++;
                intentosMax--;
            }
        }
            if(password.equals(passwordSys)){
                    System.out.println("Contraseña Correcta, Telefono Desbloqueado");
                }
            else{
                    System.out.println("Telefono Bloqueado");
                }
        sc.close();
    }
}