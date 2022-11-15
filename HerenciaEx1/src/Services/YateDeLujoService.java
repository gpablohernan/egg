package Services;
import Entities.BarcoMotor;
import Entities.YateDeLujo;
import java.util.Scanner;

public class YateDeLujoService extends BarcoMotorService{

    public YateDeLujo crearYateDeLujo(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        BarcoMotorService barcoMotor = new BarcoMotorService();
        BarcoMotor barcoMotor1 = barcoMotor.crearBarcoMotor();
        System.out.println("Ingrese el número de camarotes:");
        int nroCamarotes = scanner.nextInt();

       return new YateDeLujo(barcoMotor1.getMatricula(), barcoMotor1.getEslora(), barcoMotor1.getAnioFabricacion(), barcoMotor1.getPotenciaCV(), nroCamarotes);
    }


    public double moduloYateDeLujo(double eslora, double potenciaCV, int nroCamarotes){
        return moduloBarcoMotor(eslora, potenciaCV)+(double)nroCamarotes;
    }

}
