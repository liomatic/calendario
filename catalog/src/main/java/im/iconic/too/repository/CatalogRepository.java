package im.iconic.too.repository;

import im.iconic.too.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository
        extends JpaRepository<Catalog, Long> {


}
