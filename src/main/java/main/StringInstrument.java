package main;

public class StringInstrument extends Instrument {
    protected int numberOfStrings;

    public StringInstrument(String manufacturer, int price) {
        super(manufacturer, price);
    }

    public void tune(Instrument instrument) {
        System.out.println(instrument.getManufacturer() + " viritettiin " + numberOfStrings + " kieltä!");
    }


}
