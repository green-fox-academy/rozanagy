package TennisGame;


public class TennisGame3 implements TennisGame {

  private int pointOfPlayer2;
  private int pointOfPlayer1;
  private String playerName1;
  private String playerName2;

  public TennisGame3(String playerName1, String playerName2) {
    this.playerName1 = playerName1;
    this.playerName2 = playerName2;
  }

  public String getScore() {
    String s;
    if (pointOfPlayer1 < 4 && pointOfPlayer2 < 4) {
      String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
      s = p[pointOfPlayer1];
      return (pointOfPlayer1 == pointOfPlayer2) ? s + "-All" : s + "-" + p[pointOfPlayer2];
    } else {
      if (pointOfPlayer1 == pointOfPlayer2)
        return "Deuce";
      s = pointOfPlayer1 > pointOfPlayer2 ? playerName1 : playerName2;
      return ((pointOfPlayer1-pointOfPlayer2)*(pointOfPlayer1-pointOfPlayer2) == 1) ? "Advantage " + s : "Win for " + s;
    }
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1")
      this.pointOfPlayer1 += 1;
    else
      this.pointOfPlayer2 += 1;

  }

}