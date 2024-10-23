package phunghoangvnuit.csw.asm.project.repository;

import phunghoangvnuit.csw.asm.project.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
}
