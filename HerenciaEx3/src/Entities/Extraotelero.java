package Entities;

import java.util.Scanner;

public class Extraotelero extends Alojamiento{
    protected String privado;
    protected double cantMetrosCuad;

    public Extraotelero() {
    }

    public Extraotelero(String privado, double cantMetrosCuad) {
        this.privado = privado;
        this.cantMetrosCuad = cantMetrosCuad;
    }

    public Extraotelero(String nombre, String direccion, String localidad, String gerente, String privado, double cantMetrosCuad) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantMetrosCuad = cantMetrosCuad;
    }

    public String getPrivado() {
        return privado;
    }

    public void setPrivado(String privado) {
        this.privado = privado;
    }

    public double getCantMetrosCuad() {
        return cantMetrosCuad;
    }

    public void setCantMetrosCuad(double cantMetrosCuad) {
        this.cantMetrosCuad = cantMetrosCuad;
    }

    @Override
    public String toString() {
        return "Extraotelero{" +
                "privado='" + privado + '\'' +
                ", cantMetrosCuad=" + cantMetrosCuad +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }

    public void crearExtrahotelero(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        super.crearAlojamiento();
        do {
            System.out.println("El alojamiento es privado? (S/N)");
            privado = scanner.next();
        } while (!privado.equalsIgnoreCase("S") && !privado.equalsIgnoreCase("N"));
        if (privado.equalsIgnoreCase("S")){
            privado = "Privado";
        } else privado = "Público";
        System.out.println("Ingrese la cantidad de m² del alojamiento:");
        cantMetrosCuad = scanner.nextDouble();
    }
}
