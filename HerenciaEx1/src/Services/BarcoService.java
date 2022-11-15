package Services;
import Entities.Barco;
import java.util.Scanner;

public class BarcoService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public Barco crearBarco(){
        int matricula;
        double eslora;
        int anioFabricacion;
        System.out.println("Ingrese la matrícula:");
        matricula = scanner.nextInt();
        System.out.println("Ingrese la eslora en metros:");
        eslora = scanner.nextDouble();
        System.out.println("Ingrese el año de fabricación:");
        anioFabricacion = scanner.nextInt();

        return new Barco(matricula, eslora, anioFabricacion);
    }

    public double moduloBarco(double eslora){
        return eslora * 10;
    }


}
