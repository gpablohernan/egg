package Entities;

import java.util.Scanner;

public class CincoEstrellas extends CuatroEstrellas{
    private int cantSalonesConferencia;
    private int cantSuites;
    private int cantLimosinas;

    public CincoEstrellas() {
    }

    public CincoEstrellas(int cantSalonesConferencia, int cantSuites, int cantLimosinas) {
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public CincoEstrellas(String gimnasio, String restauranteNombre, int restauranteCapacidad, int cantSalonesConferencia, int cantSuites, int cantLimosinas) {
        super(gimnasio, restauranteNombre, restauranteCapacidad);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public CincoEstrellas(int cantHabitaciones, int nroCamas, int cantPisos, double precioHabitaciones, String gimnasio, String restauranteNombre, int restauranteCapacidad, int cantSalonesConferencia, int cantSuites, int cantLimosinas) {
        super(cantHabitaciones, nroCamas, cantPisos, precioHabitaciones, gimnasio, restauranteNombre, restauranteCapacidad);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public CincoEstrellas(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, int nroCamas, int cantPisos, double precioHabitaciones, String gimnasio, String restauranteNombre, int restauranteCapacidad, int cantSalonesConferencia, int cantSuites, int cantLimosinas) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, nroCamas, cantPisos, precioHabitaciones, gimnasio, restauranteNombre, restauranteCapacidad);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(int cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "CincoEstrellas{" +
                "cantSalonesConferencia=" + cantSalonesConferencia +
                ", cantSuites=" + cantSuites +
                ", cantLimosinas=" + cantLimosinas +
                ", gimnasio='" + gimnasio + '\'' +
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

    public void crearCincoEstrellas(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        super.crearCuatroEstrellas();
        System.out.println("Ingrese la cantidad de salones de conferencia del hotel:");
        cantSalonesConferencia = scanner.nextInt();
        System.out.println("Ingrese la cantidad de suites del hotel:");
        cantSuites = scanner.nextInt();
        System.out.println("Ingrese la cantidad de limosinas que posee el hotel:");
        cantLimosinas = scanner.nextInt();
        precioHabitaciones = precioHabitacion();
    }

    public Double precioHabitacion(){
        return super.precioHabitacion() + valorAgregadoLimosinas();
    }

    public double valorAgregadoLimosinas(){
        return 15d * (double) cantLimosinas;
    }
}
