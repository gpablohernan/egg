package Entities;

import java.util.Comparator;
import java.util.Scanner;

public class Hotel extends Alojamiento{

    protected int cantHabitaciones;
    protected int nroCamas;
    protected int cantPisos;
    protected Double precioHabitaciones;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int nroCamas, int cantPisos, Double precioHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, int nroCamas, int cantPisos, Double precioHabitaciones) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(int nroCamas) {
        this.nroCamas = nroCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "cantHabitaciones=" + cantHabitaciones +
                ", nroCamas=" + nroCamas +
                ", cantPisos=" + cantPisos +
                ", precioHabitaciones=" + precioHabitaciones +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }

    public void crearHotel(){
        super.crearAlojamiento();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el la cantidad de habitaciones del hotel:");
        cantHabitaciones = scanner.nextInt();
        System.out.println("Ingrese la el número de camas del hotel:");
        nroCamas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de písos del hotel:");
        cantPisos = scanner.nextInt();
        precioHabitaciones = 0d;

    }


}
