package Entities;

import java.util.Scanner;

public class CuatroEstrellas extends Hotel{
    protected String gimnasio; // tipo A - tipo B
    protected String restauranteNombre;
    protected int restauranteCapacidad;

    public CuatroEstrellas() {
    }

    public CuatroEstrellas(String gimnasio, String restauranteNombre, int restauranteCapacidad) {
        this.gimnasio = gimnasio;
        this.restauranteNombre = restauranteNombre;
        this.restauranteCapacidad = restauranteCapacidad;
    }

    public CuatroEstrellas(int cantHabitaciones, int nroCamas, int cantPisos, double precioHabitaciones, String gimnasio, String restauranteNombre, int restauranteCapacidad) {
        super(cantHabitaciones, nroCamas, cantPisos, precioHabitaciones);
        this.gimnasio = gimnasio;
        this.restauranteNombre = restauranteNombre;
        this.restauranteCapacidad = restauranteCapacidad;
    }

    public CuatroEstrellas(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, int nroCamas, int cantPisos, double precioHabitaciones, String gimnasio, String restauranteNombre, int restauranteCapacidad) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, nroCamas, cantPisos, precioHabitaciones);
        this.gimnasio = gimnasio;
        this.restauranteNombre = restauranteNombre;
        this.restauranteCapacidad = restauranteCapacidad;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getRestauranteNombre() {
        return restauranteNombre;
    }

    public void setRestauranteNombre(String restauranteNombre) {
        this.restauranteNombre = restauranteNombre;
    }

    public int getRestauranteCapacidad() {
        return restauranteCapacidad;
    }

    public void setRestauranteCapacidad(int restauranteCapacidad) {
        this.restauranteCapacidad = restauranteCapacidad;
    }

    @Override
    public String toString() {
        return "CuatroEstrellas{" +
                "gimnasio='" + gimnasio + '\'' +
                ", restauranteNombre='" + restauranteNombre + '\'' +
                ", restauranteCapacidad=" + restauranteCapacidad +
                ", cantHabitaciones=" + cantHabitaciones +
                ", nroCamas=" + nroCamas +
                ", cantPisos=" + cantPisos +
                ", precioHabitaciones=" + precioHabitaciones +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }

    public void crearCuatroEstrellas(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        super.crearHotel();
        do {
            System.out.println("Ingrese el tipo de gimnasio: (A/B)");
            gimnasio = scanner.next().toUpperCase();
        } while (!gimnasio.equalsIgnoreCase("A") && !gimnasio.equalsIgnoreCase("B"));
        System.out.println("Ingrese el nombre del restaurante:");
        restauranteNombre = scanner.next();
        System.out.println("Ingrese la capacidad del restaurante:");
        restauranteCapacidad = scanner.nextInt();
        precioHabitaciones = precioHabitacion();

    }

    public Double precioHabitacion(){
        Double precioFinal = 50 + (1* nroCamas) + valorAgregadoRestaurante() + valorAgregadoGimnasio();
        return precioFinal;
    }

    public double valorAgregadoRestaurante(){
        double valorAgregadoRest;
        if (restauranteCapacidad > 30){
            valorAgregadoRest = 10;
        } else if (restauranteCapacidad > 50) {
            valorAgregadoRest = 50;
        } else valorAgregadoRest = 30;
        return valorAgregadoRest;
    }

    public double valorAgregadoGimnasio(){
        double valorAgregadoGym;
        if (gimnasio.equalsIgnoreCase("A")){
            valorAgregadoGym = 50;
        } else valorAgregadoGym = 30;
        return valorAgregadoGym;
    }

}
