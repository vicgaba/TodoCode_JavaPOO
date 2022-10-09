package pilas;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Pila vacía: " + pila);
        System.out.println("Está vacía? " + pila.isEmpty());

        //Agregar

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //Recorrido
        for(Integer pilita : pila){
            System.out.println(pilita);
        }

        //Mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Está vacía? " + pila.isEmpty());

        //Eliminar el último elemento que entró
        pila.pop();
        System.out.println("Está el 2= " + pila.search(2));
        //System.out.println("Último agregado: " + pila.lastElement());
        System.out.println("Último agregado: " + pila.peek());
    }
}
