package farm;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Animal dog = new Animal();
    Animal cat = new Animal();
    Animal cow = new Animal();
    Animal pig = new Animal();
    Animal horse = new Animal();
    Animal chicken = new Animal();

    ArrayList<Animal> listOfAnimals = new ArrayList<>();

    listOfAnimals.add(dog);
    listOfAnimals.add(cat);
    listOfAnimals.add(cow);
    listOfAnimals.add(pig);

    Farm farm = new Farm();

    farm.breed();
    farm.slaughter();












  }
}

