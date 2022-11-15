import Entities.Circulo;
import Entities.Rectangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Ingrese el radio del círculo:");
        circulo.setRadio(scanner.nextDouble());
        System.out.println("Ingrese la base del rectángulo:");
        rectangulo.setBase(scanner.nextDouble());
        System.out.println("Ingrese la altura del rectángulo:");
        rectangulo.setAltura(scanner.nextDouble());

        System.out.println("El área del círculo es: " + circulo.area());
        System.out.println("El perímetro del círtulo es: " + circulo.perimetro());
        System.out.println("El área del rectángulo es: " + rectangulo.area());
        System.out.println("El perímetro del rectángulo es: " + rectangulo.perimetro());
    }
}