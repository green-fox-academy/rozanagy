package main.java.music;

public class Violin extends StringedInstruments {

  public Violin() {
    this.instrumentName = "Violin";
    this.numberOfStrings = 4;

  }

  @Override
  public String sound() {
    return "Screech";
  }
}
