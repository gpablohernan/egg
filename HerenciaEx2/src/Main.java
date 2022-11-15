import Entities.Edificio;
import Entities.EdificioDeOficinas;
import Entities.Polideportivo;
import Services.EdificioDeOficinasService;
import Services.PolideportivoService;
import Services.EdificiosService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();
        PolideportivoService polideportivo = new PolideportivoService();
        Polideportivo polideportivo1 = polideportivo.CrearPolideportivo();
        Polideportivo polideportivo2 = polideportivo.CrearPolideportivo();
        EdificioDeOficinasService edificioDeOficinas = new EdificioDeOficinasService();
        EdificioDeOficinas edificioDeOficinas1 = edificioDeOficinas.crearEdificioDeOficinas();
        EdificioDeOficinas edificioDeOficinas2 = edificioDeOficinas.crearEdificioDeOficinas();
        EdificiosService edificiosService = new EdificiosService();

        edificios.add(polideportivo1);
        edificios.add(polideportivo2);
        edificios.add(edificioDeOficinas1);
        edificios.add(edificioDeOficinas2);

        edificiosService.mostrarDatos(edificios);
    }


}