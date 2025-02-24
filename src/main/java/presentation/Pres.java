package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        // injection de dependance en utilisant l'instanciation statique "new"
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());

        // ici notre couche presentation n est pas fermee a la modification
        // donc obligee de modifier le code source donc ce n est pas bon
    }
}
