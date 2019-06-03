package main.java.music;

public class ElectricGuitar extends StringedInstruments {

  public ElectricGuitar() {
    this.instrumentName = "Electric Guitar";
    this.numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfNewStrings) {
    this.instrumentName = "Electric Guitar";
    this.numberOfStrings = numberOfNewStrings;

  }


  @Override
  public String sound() {
    return "Twang";
  }
}

