
public class Burbuja{
    public static void main (String[] args){

       int[] a = {6,7,5,2,4,3,1};

        for(int j=1; j < a.length ;j++){
        
            for(int i=0; i < a.length-j ;i++){
                if (a[i]>a[i+1]){
                    int temp = a [i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }

                    imprimirArreglo(a);
                }
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