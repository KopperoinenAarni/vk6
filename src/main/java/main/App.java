package main;
import java.util.ArrayList;
import java.util.Scanner;

 

public class App 
{
    public static void main( String[] args )
    {

        ArrayList<Instrument> instruments = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Lisää soitin");
            System.out.println("2) Listaa soittimet");
            System.out.println("3) Viritä kielisoittimet");
            System.out.println("4) Soita rumpuja");
            System.out.println("0) Lopeta ohjelma");

            if (sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {
                    case 1:
                        System.out.println("Minkä soittimen haluat lisätä? 1) Kitara, 2) Viulu, 3) Rummut");
                        String setInstrumentType = sc.nextLine();
                        System.out.println("Anna valmistajan nimi: ");
                        String setManufacturer = sc.nextLine();
                        System.out.println("Anna hinta euroina: ");
                        int setPrice = Integer.parseInt(sc.nextLine());

                        if (setInstrumentType.equals("1")) {
                            Guitar guitar = new Guitar(setManufacturer, setPrice, 6);
                            instruments.add(guitar);
                        } else if (setInstrumentType.equals("2")) {
                            Violin violin = new Violin(setManufacturer, setPrice, 4);
                            instruments.add(violin);
                        } else if (setInstrumentType.equals("3")) {
                            Drum drum = new Drum(setManufacturer, setPrice);
                            instruments.add(drum);
                        } else {
                            System.out.println("Virheellinen soitintyyppi!");
                            break;
                        }

                        System.out.println("Soitin lisätty listaan");
                        break;

                    case 2:
                        for (Instrument instrument : Instrument.getInstruments()) {
                            System.out.println(Instrument.getDetails)
                        }
                    break;


                    case 3:
                        for (Instrument instrument : Instrument.getInstruments()) {
                            if (instrument instanceof StringInstrument) {
                                ((StringInstrument) instrument).tune(instrument);
                            }
                        }
                        break;



                    case 4:
                        for (Instrument instrument : Instrument.getInstruments()) {
                            if (instrument instanceof Drum) {
                                ((Drum) instrument).playBeat();
                            }
                        }
                        break;

                    case 0:
                        exit = true;

                        System.out.println("Kiitos ohjelman käytöstä.");
                        break;

                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
        sc.close();
    }
}
