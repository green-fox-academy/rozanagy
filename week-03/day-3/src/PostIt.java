
public class PostIt {
  String backgroundColor;
  String text;
  String textColor;

  public PostIt(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  public static void main(String[] args) {
    PostIt firstPostIt = new PostIt("orange", "Idea 1", "blue");
    System.out.println(firstPostIt.backgroundColor + "," + firstPostIt.text + "," + firstPostIt.textColor);
    PostIt secondPostIt = new PostIt("pink", "Awesome", "black");
    System.out.println(secondPostIt.backgroundColor + "," + secondPostIt.text + "," + secondPostIt.textColor);
    PostIt thirdPostIt = new PostIt("yellow", "Superb", "green");
    System.out.println(thirdPostIt.backgroundColor + "," + thirdPostIt.text + "," + thirdPostIt.textColor);
  }
}
/* Create a PostIt class that has
a backgroundColor
a text on it
a textColor
Create a few example post-it objects:
an orange with blue text: "Idea 1"
a pink with black text: "Awesome"
a yellow with green text: "Superb!" */

