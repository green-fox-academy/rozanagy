public class Person {

  String name; //the name of the person
  int age; // the age of the person (whole number)
  String gender; // the gender of the person (male / female)

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }


  public void introduce() {
    System.out.println("Hi, I'm " + name + " , a " + age + " year old " + gender + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }


}
