package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        // injection de dependance en utilisant l'instanciation statique "new"
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(); // Injection dynamique
        metier.setDao(d);
        System.out.println(metier.calcul());
        System.out.println("test");

    }
}
