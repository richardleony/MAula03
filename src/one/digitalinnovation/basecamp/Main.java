package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        //Quadrilátero
        System.out.println("Exercício quadrilátero");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Área do retâgulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do quadrado:" + areaTrapezio);

    }
}