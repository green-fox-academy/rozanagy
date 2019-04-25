package main.java.music;

public abstract class StringedInstruments extends Instrument{

    int numberOfStrings;


    @Override
    public void play() {
        System.out.println(instrumentName + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
    }

    public String sound() {
        return "";

    }
}
