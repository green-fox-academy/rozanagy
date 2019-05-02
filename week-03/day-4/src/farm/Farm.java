package farm;

import java.util.ArrayList;


public class Farm {

  ArrayList<Animal> listOfAnimals;
  int slots;

  public Farm() {
    this.listOfAnimals = new ArrayList<>();
  }


  public void breed() {
    if(listOfAnimals.size() < slots) {
      listOfAnimals.add(new Animal());
    }

  }

  public void slaughter() {
    int indexOfAnimal = 0;
    for(int i = 0; i < listOfAnimals.size(); i++) {
      if(listOfAnimals.get(i).hungerValue > listOfAnimals.get(i + 1).hungerValue) {
        indexOfAnimal = i;
      } else {
        indexOfAnimal = i+ 1;
      }
    }
    listOfAnimals.remove(indexOfAnimal);
  }

}
/*Create a Farm class
it has list of Animals
it has slots which defines the number of free places for animals
breed() -> creates a new animal if there's place for it
slaughter() -> removes the least hungry animal*/
