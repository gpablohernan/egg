package Utilities;

import Entities.Hotel;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<Hotel> ordenarPrecioDesc = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel o1, Hotel o2) {
            return o2.getPrecioHabitaciones().compareTo(o1.getPrecioHabitaciones());
        }
    };
}
