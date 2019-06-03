package charSequence;

public class Shifter implements CharSequence {

  String string;
  int number;

  public Shifter(String string, int number) {
    this.string = string;
    this.number = number;
  }

  public Shifter() {

  }


  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index + number);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
