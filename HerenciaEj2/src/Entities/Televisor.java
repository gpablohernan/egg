package Entities;

import java.util.Scanner;

public class Televisor extends Electrodomestico{
    private double resolucion; // en pulgadas
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(String color, char consumoEnergético, double peso, double resolucion, boolean sintonizadorTDT) {
        super(color, consumoEnergético, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "sintonizadorTDT=" + sintonizadorTDT +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }

    public void crearTelevisor(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String resp;
        sintonizadorTDT= false;
        crearElectrodomestico();
        System.out.println("Ingrese la cantidad de pulgadas del TV:");
        resolucion = scanner.nextDouble();
        do {
            System.out.println("El televisor tiene sintonizador TDT? (S/N)");
            resp = scanner.next().toUpperCase();
        } while (!resp.equals("S") && !resp.equals("N"));
        if (resp.equals("S")) sintonizadorTDT = true;
        precioFinal();

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40d){
            precio = precio * .3 + precio;
        }
        if (sintonizadorTDT) precio += 500;
    }
}
