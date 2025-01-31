package im.iconic.too.repository;

import im.iconic.too.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository
        extends JpaRepository<Catalog, Long> {

    @Query("SELECT c FROM Catalog c WHERE c.unitaDisponibili = 0")
    List<Catalog> soldOut();

    @Query("SELECT c FROM Catalog c WHERE c.unitaDisponibili < :soglia")
    List<Catalog> findLowAvailability(@Param("soglia") int soglia);

    @Query("SELECT c FROM Catalog c WHERE c.marca = :marca")
    List<Catalog> findCompanies(@Param("marca") String marca);
}
