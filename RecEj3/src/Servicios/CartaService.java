package Servicios;
import Entidad.Carta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CartaService {

    public ArrayList<Carta> crearMazo(){
        ArrayList<Carta> mazo = new ArrayList<>();

        for (int i=1; i<=12; i++){
            if (i == 8 || i == 9) continue;
            else {
                Carta cartaE = new Carta();
                cartaE.setNumero(i);
                cartaE.setPalo("espadas");
                mazo.add(cartaE);
                Carta cartaB = new Carta();
                cartaB.setNumero(i);
                cartaB.setPalo("bastos");
                mazo.add(cartaB);
                Carta cartaO = new Carta();
                cartaO.setNumero(i);
                cartaO.setPalo("oros");
                mazo.add(cartaO);
                Carta cartaC = new Carta();
                cartaC.setNumero(i);
                cartaC.setPalo("copas");
                mazo.add(cartaC);
            }
        }
        return mazo;
    }

    public void barajar(ArrayList<Carta> mazo){
        Random mezclar = new Random();
        Collections.shuffle(mazo, mezclar);
    }
    public void siguienteCarta(ArrayList<Carta> mazo, ArrayList<Carta> descartadas){
        if (mazo.size() == 0) {
            System.out.println("El mazo está vacío");
        } else {
            System.out.println(mazo.get(0));
            descartadas.add(mazo.remove(0));
        }
    }

    public void cartasDisponibles(ArrayList<Carta> mazo){
        System.out.println("Cantidad de cartas: " + mazo.size());
    }

    public void darCartas(int cant, ArrayList<Carta> mazo, ArrayList<Carta> descartadas){
        if(cant > mazo.size()){
            System.out.println("La cantidad de cartas ingresadas excede a la cantidad de cartas en el mazo");
        } else {
            for (int i = 0; i<cant; i++){
                descartadas.add(mazo.remove(0));
            }
        }
    }

    public void cartasMonton(ArrayList<Carta> descartadas){
        if (descartadas.size() == 0){
            System.out.println("Todavía no ha salido ninguna carta.");
            } else mostrarBaraja(descartadas);
    }
    public void mostrarBaraja(ArrayList<Carta> mazo){
        System.out.println(mazo);
    }
}
