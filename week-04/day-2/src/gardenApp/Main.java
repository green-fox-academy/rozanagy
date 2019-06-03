package gardenApp;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    Flower yellowFlower = new Flower("yellow");
    Flower blueFlower = new Flower("blue");
    Tree purpleTree = new Tree("purple");
    Tree orangeTree = new Tree("orange");

    garden.addFlower(yellowFlower);
    garden.addFlower(blueFlower);
    garden.addTree(purpleTree);
    garden.addTree(orangeTree);

    yellowFlower.needWatering();
    blueFlower.needWatering();
    purpleTree.needWatering();
    orangeTree.needWatering();


  }
}
