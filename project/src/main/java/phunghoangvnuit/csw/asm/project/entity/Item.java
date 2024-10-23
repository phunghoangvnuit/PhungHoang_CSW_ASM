package phunghoangvnuit.csw.asm.project.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "item_t")
public class Item {

    @Id
    @Column(name = "item_id", length = 10)
    private String itemId;

    @Column(name = "item_name", length = 120)
    private String itemName;

    @ManyToOne
    @JoinColumn(name = "item_type_id", referencedColumnName = "item_type_id")
    private ItemType itemType;

    @Column(name = "price", precision = 21, scale = 6)
    private BigDecimal price;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
