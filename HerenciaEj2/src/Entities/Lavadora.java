package Entities;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(String color, char consumoEnergético, double peso, double carga) {
        super(color, consumoEnergético, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora {" +
                "carga=" + carga +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }

    public void crearLavadora(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora en kg:");
        carga = scanner.nextDouble();
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30d){
            precio += 500;
        }

    }
}
