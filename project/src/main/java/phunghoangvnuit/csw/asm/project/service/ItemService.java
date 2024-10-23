package phunghoangvnuit.csw.asm.project.service;

import phunghoangvnuit.csw.asm.project.entity.Item;
import phunghoangvnuit.csw.asm.project.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }
}
