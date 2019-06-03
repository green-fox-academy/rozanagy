package TennisGame;

public class TennisGame2 implements TennisGame {
  public int pointOfPlayer1 = 0;
  public int pointOfPlayer2 = 0;

  public String resultOfPlayer1 = "";
  public String resultOfPlayer2 = "";
  private String playerName1;
  private String playerName2;

  public TennisGame2(String playerName1, String playerName2) {
    this.playerName1 = playerName1;
    this.playerName2 = playerName2;
  }

  public String getScore() {
    String score = "";
    if (pointOfPlayer1 == pointOfPlayer2 && pointOfPlayer1 < 4) {
      if (pointOfPlayer1 == 0)
        score = "Love";
      if (pointOfPlayer1 == 1)
        score = "Fifteen";
      if (pointOfPlayer1 == 2)
        score = "Thirty";
      if (pointOfPlayer1 == 3)
        score = "Forty";
      score += "-All";
    }
    if (pointOfPlayer1 == pointOfPlayer2 && pointOfPlayer1 > 3)
      score = "Deuce";

    if (pointOfPlayer1 > 0 && pointOfPlayer2 == 0) {
      if (pointOfPlayer1 == 1)
        resultOfPlayer1 = "Fifteen";
      if (pointOfPlayer1 == 2)
        resultOfPlayer1 = "Thirty";
      if (pointOfPlayer1 == 3)
        resultOfPlayer1 = "Forty";

      resultOfPlayer2 = "Love";
      score = resultOfPlayer1 + "-" + resultOfPlayer2;
    }
    if (pointOfPlayer2 > 0 && pointOfPlayer1 == 0) {
      if (pointOfPlayer2 == 1)
        resultOfPlayer2 = "Fifteen";
      if (pointOfPlayer2 == 2)
        resultOfPlayer2 = "Thirty";
      if (pointOfPlayer2 == 3)
        resultOfPlayer2 = "Forty";

      resultOfPlayer1 = "Love";
      score = resultOfPlayer1 + "-" + resultOfPlayer2;
    }

    if (pointOfPlayer1 > pointOfPlayer2 && pointOfPlayer1 < 4) {
      if (pointOfPlayer1 == 2)
        resultOfPlayer1 = "Thirty";
      if (pointOfPlayer1 == 3)
        resultOfPlayer1 = "Forty";
      if (pointOfPlayer2 == 1)
        resultOfPlayer2 = "Fifteen";
      if (pointOfPlayer2 == 2)
        resultOfPlayer2 = "Thirty";
      score = resultOfPlayer1 + "-" + resultOfPlayer2;
    }
    if (pointOfPlayer2 > pointOfPlayer1 && pointOfPlayer2 < 4) {
      if (pointOfPlayer2 == 2)
        resultOfPlayer2 = "Thirty";
      if (pointOfPlayer2 == 3)
        resultOfPlayer2 = "Forty";
      if (pointOfPlayer1 == 1)
        resultOfPlayer1 = "Fifteen";
      if (pointOfPlayer1 == 2)
        resultOfPlayer1 = "Thirty";
      score = resultOfPlayer1 + "-" + resultOfPlayer2;
    }

    if (pointOfPlayer1 > pointOfPlayer2 && pointOfPlayer2 >= 3) {
      score = "Advantage player1";
    }

    if (pointOfPlayer2 > pointOfPlayer1 && pointOfPlayer1 >= 3) {
      score = "Advantage player2";
    }

    if (pointOfPlayer1 >= 4 && pointOfPlayer2 >= 0 && (pointOfPlayer1 - pointOfPlayer2) >= 2) {
      score = "Win for player1";
    }
    if (pointOfPlayer2 >= 4 && pointOfPlayer1 >= 0 && (pointOfPlayer2 - pointOfPlayer1) >= 2) {
      score = "Win for player2";
    }
    return score;
  }

  public void setScoreOfPlayer1(int number) {

    for (int i = 0; i < number; i++) {
      scoreOfPlayer1();
    }

  }

  public void setScoreOfPlayer2(int number) {

    for (int i = 0; i < number; i++) {
      scoreOfPlayer2();
    }

  }

  public void scoreOfPlayer1() {
    pointOfPlayer1++;
  }

  public void scoreOfPlayer2() {
    pointOfPlayer2++;
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1")
      scoreOfPlayer1();
    else
      scoreOfPlayer2();
  }
}
