package linkedLists;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<Persona>();

        //Agregar elementos al final de la lista
        lista.add(new Persona(1,"Julieta", 6));
        lista.add(new Persona(2,"Victor", 47));
        lista.add(new Persona(3,"Luisina", 30));
        lista.add(new Persona(4, "Timotea", 1));

        //Agregar elementos al principio de la lista
        lista.add(0, new Persona(5, "Loly", 78));

        //recorrer foreach
        for(Persona perso:lista){
            System.out.println("forech: " + perso.getNombre());
        }
    }
}
