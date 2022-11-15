package Entities;

public class Velero extends Barco{

    private int nroMastiles;

    public Velero() {
    }

    public Velero(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    public Velero(int matricula, double eslora, int anioFabricacion, int nroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.nroMastiles = nroMastiles;
    }

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "nroMastiles=" + nroMastiles +
                ", matricula=" + matricula +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}
