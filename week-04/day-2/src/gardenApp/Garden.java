package gardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Tree> trees;
  List<Flower> flowers;
  int numberOfWatering;

  public Garden() {
    this.trees = new ArrayList<>();
    this.flowers = new ArrayList<>();
    this.numberOfWatering = 40;
  }

  public void addFlower(Flower flower) {
    flowers.add(flower);
  }

  public void addTree(Tree tree) {
    trees.add(tree);
  }

  public void doWatering() {
    for (int i = 0; i < flowers.size(); i++) {
      for (int j = 0; j < trees.size(); j++) {
        if (flowers.get(i).needWatering()) {

        }
      }

    }
  }
}