package Entities;

public class BarcoMotor extends Barco{

    protected double potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(int matricula, double eslora, int anioFabricacion, double potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" +
                "potenciaCV=" + potenciaCV +
                ", matricula=" + matricula +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}
