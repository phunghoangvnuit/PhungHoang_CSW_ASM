package phunghoangvnuit.csw.asm.project.dto;

import java.math.BigDecimal;

public class PlayerItemInfoDTO {
    private int playerId;
    private String playerName;
    private String playerNational;
    private String itemName;
    private BigDecimal price;
    private String itemTypeName;

    public PlayerItemInfoDTO(int playerId, String playerName, String playerNational, String itemName, BigDecimal price, String itemTypeName) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerNational = playerNational;
        this.itemName = itemName;
        this.price = price;
        this.itemTypeName = itemTypeName;
    }

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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }
}
