package main;

public class Guitar extends StringInstrument {
    private final int numberOfStrings = 6;

    public Guitar(String manufacturer, int price) {
        super(manufacturer, price, 6);
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
