
//PREGUNTA 1 PRACTICA 4
public class Pedido { 
    public static void main(String[] args) { 

        double costoArticulo = 30.99; 
        boolean listoEnviar = false; 

        if(costoArticulo > 24.00){
            System.out.println("El valor del articulo es alto");
        }

        if(listoEnviar){
            System.out.println("ENVIADO");
        }
        else
        {
            System.out.println("PEDIDO NO LISTO");
        }
    } 
} 