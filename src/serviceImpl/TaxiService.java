package serviceImpl;

import classes.Taxi;
import enums.TaxiTupe;

import java.util.List;
import java.util.Map;

public interface TaxiService {
    StringBuilder add(Taxi taxi);

    StringBuilder add(List<Taxi> taxis);

    List<Taxi> findByInitialLetter(String model);

    Map<TaxiTupe, List<Taxi>> grouping();

    List<Taxi> filterByTaxiType(String taxiType);

    void update(Long id);
}
