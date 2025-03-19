package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresStatique {
    public static void main(String[] args) {
        // injection de dependance en utilisant l'instanciation statique => "new"
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(); // Injection statique
        System.out.println("l'injection des dépendances : Par instanciation statique");
        metier.setDao(d);
        System.out.println("RES = " + metier.calcul());

    }
}
