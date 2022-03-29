package me.christyjohn.catalogue.repository;

import me.christyjohn.catalogue.entity.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogueRepository extends JpaRepository<Catalogue, Long> {
    Catalogue findByCatalogueId(Long catalogueId);
}
