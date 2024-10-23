package phunghoangvnuit.csw.asm.project.repository;

import phunghoangvnuit.csw.asm.project.entity.PlayerItem;
import phunghoangvnuit.csw.asm.project.entity.PlayerItemId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerItemRepository extends JpaRepository<PlayerItem, PlayerItemId> {
}
