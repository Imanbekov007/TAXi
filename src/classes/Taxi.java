package classes;

import enums.TaxiTupe;

import java.time.LocalDate;

public class Taxi {
    private Long id;
    private String model;
    private String number;
    private String color;
    private LocalDate year;
    private TaxiTupe taxiTupe;

    public Taxi(Long id, String model, String number, String color, LocalDate year, TaxiTupe taxiTupe) {
        this.id = id;
        this.model = model;
        this.number = number;
        this.color = color;
        this.year = year;
        this.taxiTupe = taxiTupe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public TaxiTupe getTaxiTupe() {
        return taxiTupe;
    }

    public void setTaxiTupe(TaxiTupe taxiTupe) {
        this.taxiTupe = taxiTupe;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", taxiTupe=" + taxiTupe +
                '}';
    }
}
