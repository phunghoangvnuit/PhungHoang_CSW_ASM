package phunghoangvnuit.csw.asm.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "player_t")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private int playerId;

    @Column(name = "player_name", length = 120)
    private String playerName;

    @Column(name = "player_national", length = 50)
    private String playerNational;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerNational() {
        return playerNational;
    }

    public void setPlayerNational(String playerNational) {
        this.playerNational = playerNational;
    }
}
