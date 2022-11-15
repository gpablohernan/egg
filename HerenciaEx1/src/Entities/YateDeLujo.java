package Entities;

public class YateDeLujo extends BarcoMotor{

    private int nroCamarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    public YateDeLujo(double potenciaCV, int nroCamarotes) {
        super(potenciaCV);
        this.nroCamarotes = nroCamarotes;
    }

    public YateDeLujo(int matricula, double eslora, int anioFabricacion, double potenciaCV, int nroCamarotes) {
        super(matricula, eslora, anioFabricacion, potenciaCV);
        this.nroCamarotes = nroCamarotes;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public String toString() {
        return "YateDeLujo{" +
                "nroCamarotes=" + nroCamarotes +
                ", potenciaCV=" + potenciaCV +
                ", matricula=" + matricula +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}
