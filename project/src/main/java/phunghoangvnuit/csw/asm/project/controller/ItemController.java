package phunghoangvnuit.csw.asm.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import phunghoangvnuit.csw.asm.project.entity.Item;
import phunghoangvnuit.csw.asm.project.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<Map<String, String>> addItem(@RequestBody Item itemRequest) {
        itemService.saveItem(itemRequest);

        Map<String, String> response = new HashMap<>();
        response.put("Status", "True");
        response.put("ErrorCode", "200");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
