package Exercise10;

public class Fox {
  private String name;
  private String color;
  private int age;

  public Fox(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
//Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
//
//Write a Stream Expression to find the foxes with green color!
//Write a Stream Expression to find the foxes with green color, and age less than 5 years!
//Write a Stream Expression to find the frequency of foxes by color!
