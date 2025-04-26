import java.util.Scanner;

public class Contrasenia {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int intentosMax = 3;
        String passwordSys = "7778";
        boolean seguir = true;
        int bloqueMax = 3;
        int bloque = 0;

        while( bloqueMax > bloque && seguir){
            int intentos = 1;
            
            System.out.println("Ingresa la contraseña");
            String password = sc.nextLine();

            while(!passwordSys.equals(password) && intentos < intentosMax){
                System.out.println("Contraseña incorrecta, intentelo nuevamente");
                password = sc.nextLine();
                intentos++;
            }

            if(!passwordSys.equals(password)){
                seguir = true;
                if(intentosMax != 1){
                    System.out.println("Maximo numero de intentos, espera unos segundos");
                }
                else{
                    System.out.println("Telefono Bloqueado");
                }
                 bloque++;
                 intentosMax--;
            }
            else{
                seguir = false;
                System.out.println("Contraseña Correcta");
            } 
        }
        sc.close();
    }
}