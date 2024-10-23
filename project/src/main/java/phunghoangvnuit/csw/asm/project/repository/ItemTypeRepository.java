package phunghoangvnuit.csw.asm.project.repository;

import phunghoangvnuit.csw.asm.project.entity.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemTypeRepository extends JpaRepository<ItemType, Integer> {
}
