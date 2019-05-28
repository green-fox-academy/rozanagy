package TennisGame;

public class TennisGame1 implements TennisGame {

  private int maxScoreOfPlayerName1 = 0;
  private int maxScoreOfPlayerName2 = 0;
  private String playerName1;
  private String playerName2;

  public TennisGame1(String playerName1, String playerName2) {
    this.playerName1 = playerName1;
    this.playerName2 = playerName2;
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1")
      maxScoreOfPlayerName1 += 1;
    else
      maxScoreOfPlayerName2 += 1;
  }

  public String getScore() {
    String score = "";
    int tempScore= 0;
    if (maxScoreOfPlayerName1==maxScoreOfPlayerName2)
    {
      switch (maxScoreOfPlayerName1)
      {
        case 0:
          score = "Love-All";
          break;
        case 1:
          score = "Fifteen-All";
          break;
        case 2:
          score = "Thirty-All";
          break;
        case 3:
          score = "Forty-All";
          break;
        default:
          score = "Deuce";
          break;

      }
    }
    else if (maxScoreOfPlayerName1>=4 || maxScoreOfPlayerName2>=4)
    {
      int minusResult = maxScoreOfPlayerName1-maxScoreOfPlayerName2;
      if (minusResult==1) score ="Advantage player1";
      else if (minusResult ==-1) score ="Advantage player2";
      else if (minusResult>=2) score = "Win for player1";
      else score ="Win for player2";
    }
    else
    {
      for (int i=1; i<3; i++)
      {
        if (i==1) tempScore = maxScoreOfPlayerName1;
        else { score+="-"; tempScore = maxScoreOfPlayerName2;}
        switch(tempScore)
        {
          case 0:
            score+="Love";
            break;
          case 1:
            score+="Fifteen";
            break;
          case 2:
            score+="Thirty";
            break;
          case 3:
            score+="Forty";
            break;
        }
      }
    }
    return score;
  }
}