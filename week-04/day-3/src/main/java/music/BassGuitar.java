package main.java.music;

public class BassGuitar extends StringedInstruments {

    public BassGuitar() {
        this.instrumentName = "Bass Guitar";
        this.numberOfStrings = 4;

    }

    public BassGuitar(int numberOfNewStrings) {
        this.numberOfStrings = numberOfNewStrings;
        this.instrumentName = "Bass Guitar";

    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
