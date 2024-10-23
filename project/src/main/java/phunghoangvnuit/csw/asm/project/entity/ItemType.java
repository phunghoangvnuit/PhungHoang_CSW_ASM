package phunghoangvnuit.csw.asm.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "item_type_t")
public class ItemType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_type_id")
    private int itemTypeId;

    @Column(name = "item_type_name", length = 50)
    private String itemTypeName;

    public int getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(int itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }
}
