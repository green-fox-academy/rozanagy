package charSequence;

public class Main extends Gnirts {
  public static void main(String[] args) {

    Gnirts testName = new Gnirts("lightbulb");

    System.out.println(testName.length());
    System.out.println(testName.charAt(3));
    System.out.println(testName.subSequence(3, 5));

    Shifter myShifter = new Shifter("waterbottle", 3);

    System.out.println(myShifter.charAt(1));


  }
}
