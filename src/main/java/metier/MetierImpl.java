package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier") // remplace : <bean id="metier" class="metier.MetierImpl">
public class MetierImpl implements IMetier {

    @Autowired  // cela signifie injecte et cela a une relation avec l injection des dependances avec le framework spring Version annotations
    private IDao dao;
    // Constructor

    public MetierImpl() {
    }
    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 23;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
