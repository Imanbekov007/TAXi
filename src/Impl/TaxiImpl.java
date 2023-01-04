package Impl;

import classes.Taxi;
import enums.TaxiTupe;
import serviceImpl.TaxiService;

import java.util.List;
import java.util.Map;

public class TaxiImpl implements TaxiService {
    @Override
    public StringBuilder add(Taxi taxi) {
        return null;
    }

    @Override
    public StringBuilder add(List<Taxi> taxis) {
        return null;
    }

    @Override
    public List<Taxi> findByInitialLetter(String model) {
        return null;
    }

    @Override
    public Map<TaxiTupe, List<Taxi>> grouping() {
        return null;
    }

    @Override
    public List<Taxi> filterByTaxiType(String taxiType) {
        return null;
    }

    @Override
    public void update(Long id) {

    }
}
