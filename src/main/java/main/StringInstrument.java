package main;

public class StringInstrument extends Instrument {
    protected int numberOfStrings;

    public StringInstrument(String manufacturer, int price) {
        super(manufacturer, price);
    }

    public void tune() {
        System.out.println(this.manufacturer + " viritettiin " + numberOfStrings + " kieltä!");
    }

}
