package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao") // Annotation de Spring
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de donnee");
        double temp= 25;
        return temp;
    }
}
