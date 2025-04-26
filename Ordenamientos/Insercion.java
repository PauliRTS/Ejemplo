public class Insercion{
    public static void main (String[] args){
       
        int[] a={7,5,3,2,4,0};

        int temp;
        imprimirArreglo(a);

        for(int key = 1; key< a.length; key++){

            int valorKey = a[key];
            int j = key-1;

            System.out.println("valor de la clave: " + valorKey);
            System.out.println("Clave: " + key);
            System.out.println("valor a[" + j + "] =" + a[j]);
            System.out.println("J : " + j);
            System.out.println(valorKey < a[j]);


            while(j >= 0 && valorKey < a[j]){

                a[j+1] = a[j];
                j--;
            }
            a[j+1] = valorKey;
             imprimirArreglo(a);
             System.out.println("--------------------------");
        }
    }

public static void imprimirArreglo(int[] arreglo){
    for (int i=0; i < arreglo.length; i++){
        if(i != arreglo.length-1){
            System.out.print(arreglo[i] + " , ");
        }
        else{
            System.out.print(arreglo[i]);
        }
        
    }
    System.out.println();
    
}
}
 