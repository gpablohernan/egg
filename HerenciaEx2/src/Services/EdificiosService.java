package Services;

import Entities.Edificio;

import java.util.ArrayList;

public class EdificiosService {

    public void mostrarDatos(ArrayList<Edificio> edificios) {
        String tipoEdificio;
        int poliTechados = 0;
        int poliAbiertos = 0;

        for (Edificio edificio : edificios) {
            tipoEdificio = edificio.getClass().getName();  // Entities.Polideportivo - Entities.EdificioDeOficinas
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            System.out.println(edificio);
            if (tipoEdificio.equalsIgnoreCase("Entities.EdificioDeOficinas")) {
                edificio.cantPersonas();
            } else {
                if (edificio.toString().contains("Techado")){
                    poliTechados++;
                } else poliAbiertos++;

            }
        }
        System.out.println("La cantidad de polideportivos abiertos es: " + poliAbiertos +", y la cantidad de techados es: " + poliTechados);
    }

}
