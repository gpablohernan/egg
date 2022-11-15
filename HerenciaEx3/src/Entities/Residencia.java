package Entities;

import java.util.Scanner;

public class Residencia extends Extraotelero{
    private int cantHabitaciones;
    private String descuentoAGremio; // Sí - No
    private String poseeCampoDeportivo; // Sí - No

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, String descuentoAGremio, String poseeCampodeportivo) {
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoAGremio = descuentoAGremio;
        this.poseeCampoDeportivo = poseeCampodeportivo;
    }

    public Residencia(String privado, double cantMetrosCuad, int cantHabitaciones, String descuentoAGremio, String poseeCampodeportivo) {
        super(privado, cantMetrosCuad);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoAGremio = descuentoAGremio;
        this.poseeCampoDeportivo = poseeCampodeportivo;
    }

    public Residencia(String nombre, String direccion, String localidad, String gerente, String privado, double cantMetrosCuad, int cantHabitaciones, String descuentoAGremio, String poseeCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, cantMetrosCuad);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoAGremio = descuentoAGremio;
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public String getDescuentoAGremio() {
        return descuentoAGremio;
    }

    public void setDescuentoAGremio(String descuentoAGremio) {
        this.descuentoAGremio = descuentoAGremio;
    }

    public String GetPoseeCampoDeportivo() {
        return poseeCampoDeportivo;
    }

    public void setPoseeCampodeportivo(String poseeCampoDeportivo) {
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" +
                "cantHabitaciones=" + cantHabitaciones +
                ", descuentoAGremio='" + descuentoAGremio + '\'' +
                ", poseeCampodeportivo='" + poseeCampoDeportivo + '\'' +
                ", privado='" + privado + '\'' +
                ", cantMetrosCuad=" + cantMetrosCuad +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }

    public void crearResidencia(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        super.crearExtrahotelero();
        System.out.println("Ingrese la capacidad de habitaciones:");
        cantHabitaciones = scanner.nextInt();
        do {
            System.out.println("El alojamiento posee descuento al gremio? (S/N)");
            descuentoAGremio = scanner.next();
        } while (!descuentoAGremio.equalsIgnoreCase("S") && !descuentoAGremio.equalsIgnoreCase("N"));
        if (descuentoAGremio.equalsIgnoreCase("S")){
            descuentoAGremio = "Sí";
        } else descuentoAGremio = "No";
        do {
            System.out.println("El alojamiento posee descuento campo deportivo? (S/N)");
            poseeCampoDeportivo = scanner.next();
        } while (!poseeCampoDeportivo.equalsIgnoreCase("S") && !poseeCampoDeportivo.equalsIgnoreCase("N"));
        if (poseeCampoDeportivo.equalsIgnoreCase("S")){
            poseeCampoDeportivo = "Sí";
        } else poseeCampoDeportivo = "No";
    }
}
