package phunghoangvnuit.csw.asm.project.service;

import phunghoangvnuit.csw.asm.project.entity.PlayerItem;
import phunghoangvnuit.csw.asm.project.repository.PlayerItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerItemService {

    @Autowired
    private PlayerItemRepository playerItemRepository;

    public List<PlayerItem> getAllPlayerItems() {
        return playerItemRepository.findAll();
    }

    public PlayerItem savePlayerItem(PlayerItem playerItem) {
        return playerItemRepository.save(playerItem);
    }
}
