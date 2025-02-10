package main;

import java.util.ArrayList;

public class Instrument {
    protected String manufacturer;
    protected int price;
    private static ArrayList<Instrument> instruments;



    public Instrument(String manufacturer, int price) {
        this.manufacturer = manufacturer;
        this.price = price;
        instruments.add(this);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static ArrayList<Instrument> getInstruments() {
        return instruments;
    }

}
