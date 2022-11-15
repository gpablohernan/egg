import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;
import Services.ElectrodomesticoService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Lavadora lavadora1 = new Lavadora();
        Lavadora lavadora2 = new Lavadora();
        Televisor televisor1 = new Televisor();
        Televisor televisor2 = new Televisor();
        ArrayList<Electrodomestico>Electrodomesticos = new ArrayList<>();
        ElectrodomesticoService electrodomesticoService = new ElectrodomesticoService();


        lavadora1.crearLavadora();
        lavadora2.crearLavadora();
        televisor1.crearTelevisor();
        televisor2.crearTelevisor();

        Electrodomesticos.add(lavadora1);
        Electrodomesticos.add(lavadora2);
        Electrodomesticos.add(televisor1);
        Electrodomesticos.add(televisor2);

        System.out.println(lavadora1);
        System.out.println(lavadora2);
        System.out.println(televisor1);
        System.out.println(televisor2);

        electrodomesticoService.sumaElectrodomestico(Electrodomesticos);



    }
}