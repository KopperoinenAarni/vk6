package main;

public class Guitar extends StringInstrument {
    private int numberOfStrings = 6;


    public Guitar(String manufacturer, int price, int numberOfStrings) {
        super(manufacturer, price, numberOfStrings);
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
