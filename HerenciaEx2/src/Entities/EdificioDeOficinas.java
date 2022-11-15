package Entities;

public class EdificioDeOficinas extends Edificio{

    private int nroOficinas;
    private int cantPersonasPorOficina;
    private int nroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nroOficinas, int cantPersonasPorOficina, int nroPisos) {
        this.nroOficinas = nroOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.nroPisos = nroPisos;
    }

    public EdificioDeOficinas(double ancho, double alto, double largo, int nroOficinas, int cantPersonasPorOficina, int nroPisos) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.nroPisos = nroPisos;
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getCantPersonasPorOficina() {
        return cantPersonasPorOficina;
    }

    public void setCantPersonasPorOficina(int cantPersonasPorOficina) {
        this.cantPersonasPorOficina = cantPersonasPorOficina;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }

    @Override
    public String toString() {
        return "Edificio de oficinas {" +
                "nroOficinas=" + nroOficinas +
                ", cantPersonasPorOficina=" + cantPersonasPorOficina +
                ", nroPisos=" + nroPisos +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", largo=" + largo +
                '}';
    }

    @Override
    public void calcularSuperficie() {
        double superficie = ancho * largo;
        System.out.println("La superficie del edificio de oficinas es: " + superficie + "m²");
    }

    @Override
    public void calcularVolumen() {
        double volumen = ancho * alto * largo;
        System.out.println("El volumen del edificio de oficinas es: " + volumen + "m³");
    }

    @Override
    public void cantPersonas(){
        int cantPersonasPiso = nroOficinas * cantPersonasPorOficina;
        int cantPersonasEdificio =  cantPersonasPiso * nroPisos;
        System.out.println("En un piso entrarían " + cantPersonasPiso + " personas, y en todo el edificio entrarían " + cantPersonasEdificio + " personas");
    }
}
