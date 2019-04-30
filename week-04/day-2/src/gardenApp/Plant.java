package gardenApp;

public class Plant {
  String color;
  String type;
  int waterAmount;
  double currentWaterAmount;
  double waterAbsorption;

  public Plant(String color, String type, int waterAmount, double waterAbsorption) {
    this.color = color;
    this.type = type;
    this.waterAmount = waterAmount;
    this.currentWaterAmount = 4;
    this.waterAbsorption = waterAbsorption;
  }

  public Plant() {

  }

  public boolean needWatering() {
    System.out.println("The " + color + " " + type + " needs water.");
    return currentWaterAmount < waterAmount;
  }
}







