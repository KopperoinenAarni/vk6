package main;

public class Violin extends StringInstrument {
    private final int numberOfStrings = 4;

    public Violin(String manufacturer, int price) {
        super(manufacturer, price, 4);
    }
    
    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
