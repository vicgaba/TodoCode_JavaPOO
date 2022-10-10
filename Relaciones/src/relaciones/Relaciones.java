package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {

        //Auto auto = new Auto(1L,"VW", "Gol", [new Propietario(1L,"Victor", "Gabardini")]);
        Auto auto1 = new Auto();
        auto1.setId(1L);
        auto1.setMarca("VW");
        auto1.setModelo("Gol");

        List<Propietario> listaPropietarios = new ArrayList<Propietario>();

        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();

        prop1.setId(1L);
        prop1.setNombre("Victor");
        prop1.setApellido("Gabardini");

        prop2.setId(2L);
        prop2.setNombre("Julieta");
        prop2.setApellido("Gabardini Meyer");

        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);

        auto1.setListaPropietarios(listaPropietarios);

        System.out.println("El auto " + auto1.getMarca() + " " + auto1.getModelo() + " tiene como propietarios a: "
            + auto1.getListaPropietarios().toString());

    }
}
