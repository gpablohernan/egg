package Entities;

public class Polideportivo extends Edificio{

    private String nombre;
    private String tipoInstalacion; // Techado/Abierto

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalacion) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo {" +
                "nombre='" + nombre + '\'' +
                ", tipoInstalacion='" + tipoInstalacion + '\'' +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", largo=" + largo +
                '}';
    }

    @Override
    public void calcularSuperficie() {
        double superficie = ancho * largo;
        System.out.println("La superficie del polideportivo es: " + superficie + "m²");
    }

    @Override
    public void calcularVolumen() {
        double volumen = ancho * alto * largo;
        System.out.println("El volumen del polideportivo es: " + volumen + "m³");
    }

    @Override
    public void cantPersonas() {

    }


}
