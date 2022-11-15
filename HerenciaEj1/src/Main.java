import Entities.Animal;
import Entities.Gato;
import Entities.Perro;
import Entities.Caballo;

public class Main {
    public static void main(String[] args) {

        Animal perro1 = new Perro("Stich", "Carnívoro", 15, "Doberman");
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chiwawa");
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");

        perro1.alimentarse();
        perro2.alimentarse();
        gato1.alimentarse();
        caballo1.alimentarse();
    }
}