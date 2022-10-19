package Servicios;
import Entidad.Revolver;

public class RevolverService {

    public void llenarRevolver(Revolver revolver) {
        int posActual = (int) (Math.random() * 6 + 1);
        int posAgua = (int) (Math.random() * 6 + 1);
        revolver.setPosicionActual(posActual);
        revolver.setPosicionAgua(posAgua);

    }

    public boolean mojar(Revolver revolver) {
        if (revolver.getPosicionActual() == revolver.getPosicionAgua()) {
            return true;
        } else return false;
    }

    public void siguienteChorro(Revolver revolver) {
        int aux = revolver.getPosicionActual();
        if (revolver.getPosicionActual() != 6) {
            aux++;
            revolver.setPosicionActual(aux);
        } else revolver.setPosicionActual(1);
    }

    public void toString(Revolver revolver){
        revolver.toString();
    }
}