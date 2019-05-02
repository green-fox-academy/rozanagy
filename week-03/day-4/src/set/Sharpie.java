package set;

public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie() {
    inkAmount = 100;
  }

  public void use() {
    inkAmount--;
  }

  public static void main(String[] args) {
    Sharpie firstSharpie = new Sharpie();
    firstSharpie.color = "blue";
    firstSharpie.width = 2.3f;
    firstSharpie.use();
    System.out.println(firstSharpie.inkAmount);
    System.out.println(firstSharpie.color);
    System.out.println(firstSharpie.width);
  }
}

