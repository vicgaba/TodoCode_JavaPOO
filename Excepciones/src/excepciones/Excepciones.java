package excepciones;

public class Excepciones {

    public static void main(String[] args) {

        try {
            int resultado = 3 / 0;
        }
        catch (Exception miExcecpcion) {
            System.out.println("la chingaste con el 0");
        }

        int edades [] = {1,2,3,4};

        try {
            System.out.println("La edad de la posición 4 es: " + edades[4]);
        }
        catch (Exception IndexOutOfBondsException) {
            System.out.println("Saliste de la cantidad de índices del vector");
        }
    }
}
