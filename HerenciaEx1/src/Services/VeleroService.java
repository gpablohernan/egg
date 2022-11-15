package Services;
import Entities.Barco;
import Entities.Velero;
import java.util.Scanner;

public class VeleroService extends BarcoService{

    public Velero crearVelero(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        BarcoService barco = new BarcoService();
        Barco barco1 = barco.crearBarco();
        System.out.println("Ingrese el número de mástiles:");
        int nroMastiles = scanner.nextInt();

        return new Velero(barco1.getMatricula(), barco1.getEslora(), barco1.getAnioFabricacion(), nroMastiles);
    }


    public double moduloVelero(double eslora, int nroMastiles){
        return moduloBarco(eslora)+ (double)nroMastiles;
    }


}
