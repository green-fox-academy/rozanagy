package TennisGame;

import java.util.HashMap;
import java.util.Map;


public class TennisGame1 implements TennisGame {

  private static final String EVEN_SUFFIX = "-All";
  private static final int DEUCE_DELIMITER = 4;
  private static final Map<Integer, String> SCORE_MAP;

  static {
    SCORE_MAP = new HashMap<>();
    SCORE_MAP.put(0, "Love");
    SCORE_MAP.put(1, "Fifteen");
    SCORE_MAP.put(2, "Thirty");
    SCORE_MAP.put(3, "Forty");
  }

  private int maxScoreOfPlayerName1;
  private int maxScoreOfPlayerName2;
  private final String playerName1;
  private final String playerName2;

  public TennisGame1(String playerName1, String playerName2) {
    this.playerName1 = playerName1;
    this.playerName2 = playerName2;
  }


  public void wonPoint(String playerName) {
    if (playerName == this.playerName1) {
      maxScoreOfPlayerName1 += 1;
    } else {
      maxScoreOfPlayerName2 += 1;
    }
  }

  public String getScore() {
    String score;
    if (maxScoreOfPlayerName1 == maxScoreOfPlayerName2) {
      score = getScoreForEven();
    } else if (maxScoreOfPlayerName1 >= DEUCE_DELIMITER || maxScoreOfPlayerName2 >= DEUCE_DELIMITER) {
      score = getScoreForGamePoint();
    } else {
      score = mapScore(maxScoreOfPlayerName1) + "-" + mapScore(maxScoreOfPlayerName2);
    }
    return score;
  }

  private String mapScore(int tempScore) {
    return SCORE_MAP.get(tempScore);
  }

  private String getScoreForGamePoint() {
    String score;
    int minusResult = maxScoreOfPlayerName1 - maxScoreOfPlayerName2;
    if (minusResult == 1) {
      score = "Advantage " + playerName1;
    } else if (minusResult == -1) {
      score = "Advantage " + playerName2;
    } else if (minusResult >= 2) {
      score = "Win for " + playerName1;
    } else {
      score = "Win for " + playerName2;
    }
    return score;
  }

  private String getScoreForEven() {
    String score;
    if (maxScoreOfPlayerName1 < DEUCE_DELIMITER) {
      score = SCORE_MAP.get(maxScoreOfPlayerName1) + EVEN_SUFFIX;
    } else {
      score = "Deuce";
    }
    return score;
  }
}