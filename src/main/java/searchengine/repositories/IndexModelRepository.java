package searchengine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import searchengine.model.IndexModel;

@Repository
public interface IndexModelRepository extends JpaRepository<IndexModel, Integer> {
    IndexModel findByLemma_idAndPage_Id (Integer lemmaId, Integer PageId);
}
