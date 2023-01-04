package enums;

import java.math.BigDecimal;

public enum TaxiTupe {
    STANDARD(new BigDecimal(150),new BigDecimal(20)),
    COMFORT(new BigDecimal(500),new BigDecimal(50)),
    BUSINESS(new BigDecimal(1000),new BigDecimal(100));
    private BigDecimal priceForLanding;
    private BigDecimal pricePerKM;

    TaxiTupe(BigDecimal priceForLanding, BigDecimal pricePerKM) {
        this.priceForLanding = priceForLanding;
        this.pricePerKM = pricePerKM;
    }

    @Override
    public String toString() {
        return "TaxiTupe{" +
                "priceForLanding=" + priceForLanding +
                ", pricePerKM=" + pricePerKM +
                '}';
    }

    public BigDecimal getPriceForLanding() {

        return priceForLanding;
    }

    public void setPriceForLanding(BigDecimal priceForLanding) {
        this.priceForLanding = priceForLanding;
    }

    public BigDecimal getPricePerKM() {
        return pricePerKM;
    }

    public void setPricePerKM(BigDecimal pricePerKM) {
        this.pricePerKM = pricePerKM;
    }

}
