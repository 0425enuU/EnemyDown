package plugin.enemydown.data;

import lombok.Getter;
import lombok.Setter;

/**
 * EnemyDownのゲームを実行する際のスコア情報を扱うオブジェクト。
 * プレイヤー名、合計点数、日時などの情報を持つ。
 */

public class PlayerScore {

  private String playerName;
  private int score;

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
