package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXML {
    public static void main(String[] args) {
        // injection des dependances avec Spring: la version XML

        System.out.println("l'injection des dépendances : \n En utilisant le Framework Spring " + " - Version XML");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("RES = "+metier.calcul());
    }

}
