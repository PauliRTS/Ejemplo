public class Quicksort{
    public static void main (String[] args){

        int[] a={8,2,4,10,9,5,-2,7,6,0,1,11};

        imprimirArreglo(a);
        quicksort(a,0,a.length-1);
        imprimirArreglo(a);

    }

    public static int separar(int[]arreglo, int inicio, int iPivote){
        
        int valorPivote = arreglo[iPivote];
        int i = inicio;
        
        for( int j= i; j < iPivote; j++){
            if(arreglo[j] < valorPivote){
                cambiar(arreglo,i,j);
                i++;
            }

        }

        cambiar(arreglo,i,iPivote);
        return i;
    }
    
    public static void quicksort(int[] arreglo, int inicio, int iPivote){
        
        if(inicio<iPivote){

        int mitad = separar(arreglo,inicio,iPivote);
        
        quicksort(arreglo,inicio,mitad-1);
        quicksort(arreglo,mitad+1,iPivote);

        }
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