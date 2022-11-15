package Services;

import Entities.Electrodomestico;
import java.util.ArrayList;

public class ElectrodomesticoService {


    public void sumaElectrodomestico(ArrayList<Electrodomestico> Electrodomesticos){
        double totalLavadoras = 0d;
        double totalTelevisores = 0d;
        double totalElectrodomesticos;
        String producto;

        for (Electrodomestico electro: Electrodomesticos) {
            producto = electro.toString().substring(0, 9);
            System.out.println(producto + " $" + electro.getPrecio());
            if (producto.equalsIgnoreCase("televisor")){
                totalTelevisores += electro.getPrecio();
            } else {
                totalLavadoras += electro.getPrecio();
            }

        }
        totalElectrodomesticos = totalLavadoras + totalTelevisores;
        System.out.println("El precio total de Lavadoras es $" + totalLavadoras);
        System.out.println("El precio total de Televisores es $" + totalTelevisores);
        System.out.println("El precio total de todos los electrodomésticos es $" + totalElectrodomesticos);
    }
}