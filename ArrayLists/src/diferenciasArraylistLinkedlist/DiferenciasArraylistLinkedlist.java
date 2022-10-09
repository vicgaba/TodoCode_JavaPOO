package diferenciasArraylistLinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DiferenciasArraylistLinkedlist {
    public static void main(String[] args) {
        List<Persona> listaArray = new ArrayList<Persona>();

        listaArray.add(new Persona(1,"Julieta", 6));
        listaArray.add(new Persona(2,"Victor", 47));
        listaArray.add(new Persona(3,"Luisina", 30));
        listaArray.add(new Persona(4, "Timotea", 1));

        LinkedList<Persona> listaLinked = new LinkedList<Persona>();

        listaLinked.add(new Persona(1,"Julieta", 6));
        listaLinked.add(new Persona(2,"Victor", 47));
        listaLinked.add(new Persona(3,"Luisina", 30));
        listaLinked.add(new Persona(4, "Timotea", 1));

        //Remove en ArrayList
        listaArray.remove(3);

        //Remove en LinkedList
        String nombreBorrar ="Luisina";
        for(Persona persona2 : listaLinked) {
            if(persona2.getNombre().equals(nombreBorrar)){
                listaLinked.remove(persona2);
                break; //corto la recorrida para que se reacomoden los punteros de la lista
            }
        }

        System.out.println("Luego de eliminar \n");
        System.out.println("-------Array List --------");
        //recorrer foreach
        for(Persona perso:listaArray){
            System.out.println("forech: " + perso.getNombre());
        }

        System.out.println("-------Linked List --------");
        for(Persona perso2 : listaLinked){
            System.out.println(perso2.getNombre());
        }

        //Tamaño de la lista
        System.out.println("Tamaño de la lista ");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaArray.size());

        //Obtener primer y último objeto
        System.out.println("----Primer y último objeto----(solo linked lists)");
        System.out.println("Primer objeto: " + listaLinked.getFirst().toString());
        System.out.println("Último objeto: " + listaLinked.getLast().toString());

        //Borrar toda la lista
        System.out.println("------Borrando listas -------");
        listaArray.clear();
        listaLinked.clear();

        //Comprobar si las listas están vacías
        System.out.println("---------Está vacía la lista?---------");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());

    }
}
