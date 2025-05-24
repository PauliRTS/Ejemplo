import java.util.Stack;

public class Pilas{
    public static void main (String[] args){
        //Crear una pila vacia
        Stack<Integer> nums = new Stack<Integer>();
        //Agregar elementos a la pila
        nums.push(3);
        nums.push(2);
        nums.push(4);
        //Lee el ultimo elemento
        System.out.println(nums.peek());
        //Sacar todos los elementos
        while (!nums.isEmpty()){
            System.out.println(nums.pop());
        }
    }
}