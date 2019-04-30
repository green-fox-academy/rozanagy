package gardenApp;

public class Tree extends Plant {

  public Tree(String color) {
    super(color, "Tree", 10, 0.4);
  }


  @Override
  public boolean needWatering() {
    this.waterAmount = 10;
    return super.needWatering();
  }
}
