public class Quicksort{
    public static void main (String[] args){

        int[] a={8,2,4,10,9,5,-2,7,6};

        imprimirArreglo(a);
        separar(a,8);
        imprimirArreglo(a);

    }

    public static void separar(int[]arreglo, int iPivote){
        
        int valorPivote = arreglo[iPivote];
        int i = 0;
        
        for( int j= i; j < arreglo.length; j++){
            if(arreglo[j] < valorPivote){
                cambiar(arreglo,i,j);
                i++;
            }

        }

        cambiar(arreglo,i,iPivote);

    }
    
    public static void cambiar(int[] arreglo, int i, int j){

        int temp=arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;

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