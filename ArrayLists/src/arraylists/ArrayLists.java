package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1,"Julieta", 6));
        lista.add(new Persona(2,"Victor", 47));
        lista.add(new Persona(3,"Luisina", 30));
        lista.add(new Persona(4, "Timotea", 1));

        //recorrer por índice
        for(int i = 0; i < lista.size(); i++){
            System.out.println("prueba: " + lista.get(i).toString());
        }

        //recorrer foreach
        for(Persona perso:lista){
            System.out.println("forech: " + perso.getNombre());
        }
    }
}
