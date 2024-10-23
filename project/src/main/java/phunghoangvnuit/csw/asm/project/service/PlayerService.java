package phunghoangvnuit.csw.asm.project.service;

import phunghoangvnuit.csw.asm.project.dto.PlayerItemInfoDTO;
import phunghoangvnuit.csw.asm.project.entity.Player;
import phunghoangvnuit.csw.asm.project.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public void savePlayer(Player player) {
        playerRepository.save(player);
    }

    public List<PlayerItemInfoDTO> getPlayerItemInfo() {
        return playerRepository.getPlayerItemInfo();
    }
}
