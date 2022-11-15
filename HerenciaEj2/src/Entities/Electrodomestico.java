package Entities;

import java.util.Scanner;

public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumoEnergetico; // (letras entre A y F)
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoEnergético, double peso) {
        this.color = color;
        this.consumoEnergetico = consumoEnergético;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergético() {
        return consumoEnergetico;
    }

    public void setConsumoEnergético(char consumoEnergético) {
        this.consumoEnergetico = consumoEnergético;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergético='" + consumoEnergetico + '\'' +
                ", peso=" + peso +
                '}';
    }

    private char comprobarConsumoEnergetico(char letra){
        char []letras = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i<letras.length; i++) {
            if (letras[i] == letra){
                return letra;
            }
        } return 'F';
    };

    private String comprobarColor(String color){
        String []colores = {"blanco", "negro", "rojo", "azul", "gris"};
        for (int i = 0; i<colores.length; i++) {
            if (color.equalsIgnoreCase(colores[i])){
                return color;
            }
        } return "blanco";

    }

    public void crearElectrodomestico(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el color del electrodoméstico:");
        color = comprobarColor(scanner.next());
        System.out.println("Ingrese el consumo energético (letras entre A y F):");
        consumoEnergetico = comprobarConsumoEnergetico(scanner.next().toUpperCase().charAt(0));
        System.out.println("Ingrese el peso del electrodoméstico en kg:");
        peso = scanner.nextDouble();
        precio = 1000d;

    }

    public void precioFinal(){
        char consumo = comprobarConsumoEnergetico(consumoEnergetico);
        switch (consumo){
            case 'A':
                precio += 1000d;
                break;
            case 'B':
                precio += 1000d;
                break;
            case 'C':
                precio += 800d;
                break;
            case 'D':
                precio += 500d;
                break;
            case 'E':
                precio += 300d;
                break;
            case 'F':
                precio += 100d;
                break;
        }
        if (peso <= 19d) {
            precio += 100d;
        } else if (peso >= 20d && peso <= 49d) {
            precio += 500d;
        } else if (peso >= 50d && peso <= 79d) {
            precio += 800d;
        } else if (peso >= 80d) {
            precio += 1000d;
        }

    }
}
