package claabstractas;

public class Circulo implements Figura, Rotable, Dibujable{

    private double radio;

    public Circulo(){

    }

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * radio * radio;
    }

    @Override
    public void rotar() {
        System.out.println("Hola estoy rotando un círculo");
    }

    @Override
    public void dibujar() {
        System.out.println(("Hola estoy dibujando un círculo"));
    }
}
