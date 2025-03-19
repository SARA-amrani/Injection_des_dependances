package extension;

import dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        double temperature= 77;
        return temperature;
    }
}
