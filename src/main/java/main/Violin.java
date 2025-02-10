package main;

public class Violin extends StringInstrument {
    private int numberOfStrings = 4;


    public Violin(String manufacturer, int price, int numberOfStrings) {
        super(manufacturer, price, numberOfStrings);
    }
    
    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
