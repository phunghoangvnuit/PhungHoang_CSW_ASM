package phunghoangvnuit.csw.asm.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import phunghoangvnuit.csw.asm.project.dto.PlayerItemInfoDTO;
import phunghoangvnuit.csw.asm.project.entity.Player;
import phunghoangvnuit.csw.asm.project.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/playerinfo")
    public List<PlayerItemInfoDTO> getPlayerItemInfo() {
        return playerService.getPlayerItemInfo();
    }

    @PostMapping("/player")
    public ResponseEntity<Map<String, String>> addPlayer(@RequestBody Player playerRequest) {
        playerService.savePlayer(playerRequest);

        Map<String, String> response = new HashMap<>();
        response.put("Status", "True");
        response.put("ErrorCode", "200");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
