package main;

public class Instrument {
    protected String manufacturer;
    protected int price;

    public Instrument(String manufacturer, int price) {
        this.manufacturer = manufacturer;
        this.price = price;
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

    public void getDetails() {
        System.out.println("Valmistaja: " + manufacturer + ", Hinta: " + price + "e");
    }

}
