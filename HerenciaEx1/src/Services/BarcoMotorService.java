package Services;

import Entities.Barco;
import Entities.BarcoMotor;
import java.util.Scanner;

public class BarcoMotorService extends BarcoService{

    public BarcoMotor crearBarcoMotor(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        BarcoService barco = new BarcoService();
        Barco barco1 = barco.crearBarco();
        System.out.println("Ingrese la potencia en CV:");
        double potenciaCV = scanner.nextDouble();

        return new BarcoMotor(barco1.getMatricula(), barco1.getEslora(), barco1.getAnioFabricacion(), potenciaCV);
    }

    public double moduloBarcoMotor(double eslora, double potenciaCV){
        return (moduloBarco(eslora))+ potenciaCV;
    }

}
