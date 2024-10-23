package phunghoangvnuit.csw.asm.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import phunghoangvnuit.csw.asm.project.entity.PlayerItem;
import phunghoangvnuit.csw.asm.project.service.PlayerItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/playerbuyitem")
public class PlayerItemController {

    @Autowired
    private PlayerItemService playerItemService;

    @PostMapping
    public ResponseEntity<Map<String, String>> savePlayerItem(@RequestBody PlayerItem playerItemRequest) {
        playerItemService.savePlayerItem(playerItemRequest);

        Map<String, String> response = new HashMap<>();
        response.put("Status", "True");
        response.put("ErrorCode", "200");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
