package claabstractas;

public class ClaAbstractas {

    public static void main(String[] args){

        Circulo cir = new Circulo(6);
        Cuadrado cua = new Cuadrado(4);

        System.out.println(cir.calcularArea());
        cir.dibujar();
        cir.rotar();

        System.out.println(cua.calcularArea());
        cua.dibujar();
    }
}
