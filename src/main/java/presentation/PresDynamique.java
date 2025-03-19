package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresDynamique {
    public static void main(String[] args) {
        //Injection des dependances par instanciation dynamique
        System.out.println("Injection des dépendances : Par instanciation dynamique");
        try {
            Scanner sc = new Scanner(new File("config.txt"));
            //DaoImpl dao = new DaoImpl();
            String daoClassname = sc.nextLine();
            Class cDao = Class.forName(daoClassname);
            IDao dao = (IDao) cDao.getConstructor().newInstance();
            //pour teste ce objet
            System.out.println(dao.getData());

            //MetierImpl metier = new MetierImpl(dao);
            String metierClassname = sc.nextLine();
            Class cMetier = Class.forName(metierClassname);
            IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

            //metier.setDao(d)
            Method setDao = cMetier.getMethod("setDao", IDao.class);
            setDao.invoke(metier, dao);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
