package Entities;

import java.util.Scanner;

public class Camping extends Extraotelero{
    private int capacidadMaxCarpas;
    private int cantBaniosDisponibles;
    private String poseeRestaurante; // Sí - No

    public Camping() {
    }

    public Camping(int capacidadMaxCarpas, int cantBaniosDisponibles, String poseeRestaurante) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBaniosDisponibles = cantBaniosDisponibles;
        this.poseeRestaurante = poseeRestaurante;
    }

    public Camping(String privado, double cantMetrosCuad, int capacidadMaxCarpas, int cantBaniosDisponibles, String poseeRestaurante) {
        super(privado, cantMetrosCuad);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBaniosDisponibles = cantBaniosDisponibles;
        this.poseeRestaurante = poseeRestaurante;
    }

    public Camping(String nombre, String direccion, String localidad, String gerente, String privado, double cantMetrosCuad, int capacidadMaxCarpas, int cantBaniosDisponibles, String poseeRestaurante) {
        super(nombre, direccion, localidad, gerente, privado, cantMetrosCuad);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBaniosDisponibles = cantBaniosDisponibles;
        this.poseeRestaurante = poseeRestaurante;
    }

    public int getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(int capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public int getCantBaniosDisponibles() {
        return cantBaniosDisponibles;
    }

    public void setCantBaniosDisponibles(int cantBaniosDisponibles) {
        this.cantBaniosDisponibles = cantBaniosDisponibles;
    }

    public String getPoseeRestaurante() {
        return poseeRestaurante;
    }

    public void setPoseeRestaurante(String poseeRestaurante) {
        this.poseeRestaurante = poseeRestaurante;
    }

    @Override
    public String toString() {
        return "Camping{" +
                "capacidadMaxCarpas=" + capacidadMaxCarpas +
                ", cantBaniosDisponibles=" + cantBaniosDisponibles +
                ", poseeRestaurante='" + poseeRestaurante + '\'' +
                ", privado='" + privado + '\'' +
                ", cantMetrosCuad=" + cantMetrosCuad +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }

    public void crearCamping(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        super.crearExtrahotelero();
        System.out.println("Ingrese la capacidad máxima de carpas:");
        capacidadMaxCarpas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de baños disponibles:");
        cantBaniosDisponibles = scanner.nextInt();
        do {
            System.out.println("El alojamiento posee restaurante? (S/N)");
            poseeRestaurante = scanner.next();
        } while (!poseeRestaurante.equalsIgnoreCase("S") && !poseeRestaurante.equalsIgnoreCase("N"));
        if (poseeRestaurante.equalsIgnoreCase("S")){
            poseeRestaurante = "Sí";
        } else poseeRestaurante = "No";
    }
}
