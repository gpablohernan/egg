package Entities;

import Services.BarcoMotorService;
import Services.BarcoService;
import Services.VeleroService;
import Services.YateDeLujoService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Alquiler {

   public static void alquiler(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String nombre, diaAlquiler, mesAlquiler, anioAlquiler, diaDevolucion, mesDevolucion, anioDevolucion, fechaAlquiler, fechaDevolucion;
        int dni, posAmarre;
        LocalDate fechaAlq;
        LocalDate fechaDevol;
        long diasAlquiler;

        System.out.println("Ingrese su nombre:");
        nombre = scanner.next();
        System.out.println("Ingrese su DNI:");
        dni = scanner.nextInt();
        System.out.println("Ingrese la posición del amarre:");
        posAmarre = scanner.nextInt();
        System.out.println("Indique la fecha de alquiler:\n(primero el día, ej: 05, luego el mes, ej: 09 y luego el año, ej: 2022)");
        diaAlquiler = scanner.next();
        mesAlquiler = scanner.next();
        anioAlquiler = scanner.next();
        System.out.println("Indique la fecha de devolución:\n(primero el día, ej: 05, luego el mes, ej: 09 y luego el año, ej: 2022)");
        diaDevolucion = scanner.next();
        mesDevolucion = scanner.next();
        anioDevolucion = scanner.next();
        double modulo = menu();
        fechaAlquiler = anioAlquiler + "-" + mesAlquiler + "-" + diaAlquiler;
        fechaDevolucion = anioDevolucion + "-" + mesDevolucion + "-" + diaDevolucion;
        fechaAlq = LocalDate.parse(fechaAlquiler, DateTimeFormatter.ISO_LOCAL_DATE);
        fechaDevol = LocalDate.parse(fechaDevolucion, DateTimeFormatter.ISO_LOCAL_DATE);
        diasAlquiler = fechaAlq.until(fechaDevol, ChronoUnit.DAYS);
        double alquiler = modulo * (double) diasAlquiler;
        System.out.println(nombre + " con DNI "+ dni + ", en la posición de amarre " + posAmarre +
                ", por " + diasAlquiler + " días de alquiler, deberá abonar un total de: $" + alquiler);

    }

    public static double menu(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        do {
            System.out.println("Ingrese qué tipo de naviera desea alquilar:\n" +
                    "1 -- Barco \n" +
                    "2 -- Velero \n" +
                    "3 -- Barco a motor \n" +
                    "4 -- Yate de lujo \n");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    BarcoService barco = new BarcoService();
                    Barco barco1 = barco.crearBarco();
                    return barco.moduloBarco(barco1.getEslora());
                case 2:
                    VeleroService velero = new VeleroService();
                    Velero velero1 = velero.crearVelero();
                    return velero.moduloVelero(velero1.getEslora(), velero1.getNroMastiles());
                case 3:
                    BarcoMotorService barcoMotor = new BarcoMotorService();
                    BarcoMotor barcoMotor1 = barcoMotor.crearBarcoMotor();
                    return barcoMotor.moduloBarcoMotor(barcoMotor1.getEslora(), barcoMotor1.getPotenciaCV());
                case 4:
                    YateDeLujoService yateDeLujo = new YateDeLujoService();
                    YateDeLujo yateDeLujo1 = yateDeLujo.crearYateDeLujo();
                    return yateDeLujo.moduloYateDeLujo(yateDeLujo1.getEslora(), yateDeLujo1.getPotenciaCV(), yateDeLujo1.getNroCamarotes());
            }
        } while (opcion <1 || opcion >5);
        return 0;
    }

}
