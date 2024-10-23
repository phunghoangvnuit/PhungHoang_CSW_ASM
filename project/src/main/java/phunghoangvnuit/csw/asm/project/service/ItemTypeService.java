package phunghoangvnuit.csw.asm.project.service;

import phunghoangvnuit.csw.asm.project.entity.ItemType;
import phunghoangvnuit.csw.asm.project.repository.ItemTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemTypeService {

    @Autowired
    private ItemTypeRepository itemTypeRepository;

    public List<ItemType> getAllItemTypes() {
        return itemTypeRepository.findAll();
    }

    public ItemType saveItemType(ItemType itemType) {
        return itemTypeRepository.save(itemType);
    }
}
