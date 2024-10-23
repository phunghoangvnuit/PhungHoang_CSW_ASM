package phunghoangvnuit.csw.asm.project.entity;

import java.io.Serializable;
import java.util.Objects;

public class PlayerItemId implements Serializable {

    private String item;
    private int player;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerItemId that = (PlayerItemId) o;
        return player == that.player && Objects.equals(item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, player);
    }
}
