public class TodoPrint {
  public static void main(String[] args) {
    String todoText = "My todo:\n- Buy milk\n- Download games\n- Diablo";
    String line1 = todoText.substring(0, 9);
    String line2 = todoText.substring(9, 20);
    String line3 = todoText.substring(20, 37);
    String line4 = todoText.substring(37);
    char a = ' ';
    String b = "     ";
    System.out.println(line1 + a + line2 + a + line3 + b + line4);
  }
}


// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo