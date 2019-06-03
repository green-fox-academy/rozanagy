package set;

import java.util.ArrayList;

public class SharpieSet {
  ArrayList<Sharpie> SharpieSet;


  public SharpieSet() {
    this.SharpieSet = new ArrayList<>();
  }

  public void add(Sharpie sharpie) {
    SharpieSet.add(sharpie);
  }

  public int countUsable() {
    int usableSharpieCounter = 0;
    for (int i = 0; i < SharpieSet.size(); i++) {
      if (SharpieSet.get(i).inkAmount > 0) {
        usableSharpieCounter++;
      }
    }
    return usableSharpieCounter;
  }

  public void removeTrash() {
    for (int i = 0; i < SharpieSet.size(); i++) {
      if (SharpieSet.get(i).inkAmount == 0) {
        SharpieSet.remove(i);
      }
    }
  }
}
/*Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
countUsable() -> sharpie is usable if it has ink in it
removeTrash() -> removes all unusable sharpies*/