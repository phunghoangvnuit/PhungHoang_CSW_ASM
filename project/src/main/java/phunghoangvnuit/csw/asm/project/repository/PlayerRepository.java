package phunghoangvnuit.csw.asm.project.repository;

import phunghoangvnuit.csw.asm.project.entity.Player;
import phunghoangvnuit.csw.asm.project.dto.PlayerItemInfoDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {

    @Query("SELECT new phunghoangvnuit.csw.asm.project.dto.PlayerItemInfoDTO(p.playerId, p.playerName, p.playerNational, i.itemName, i.price, it.itemTypeName) " +
            "FROM Player p " +
            "JOIN PlayerItem pi ON p.playerId = pi.player.playerId " +
            "JOIN Item i ON pi.item.itemId = i.itemId " +
            "JOIN ItemType it ON i.itemType.itemTypeId = it.itemTypeId")
    List<PlayerItemInfoDTO> getPlayerItemInfo();
}
