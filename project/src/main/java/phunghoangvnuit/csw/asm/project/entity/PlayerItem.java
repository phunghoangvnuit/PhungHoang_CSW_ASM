package phunghoangvnuit.csw.asm.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "player_item_t")
@IdClass(PlayerItemId.class)  // Composite key class
public class PlayerItem {

    @Id
    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "item_id")
    private Item item;

    @Id
    @ManyToOne
    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
    private Player player;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}