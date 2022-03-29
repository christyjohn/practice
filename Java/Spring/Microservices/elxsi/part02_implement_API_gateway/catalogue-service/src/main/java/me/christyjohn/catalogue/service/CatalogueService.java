package me.christyjohn.catalogue.service;

import lombok.extern.slf4j.Slf4j;
import me.christyjohn.catalogue.entity.Catalogue;
import me.christyjohn.catalogue.repository.CatalogueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CatalogueService {

    @Autowired
    private CatalogueRepository catalogueRepository;

    public Catalogue saveCatalogue(Catalogue catalogue) {
        log.info("Inside saveCatalogue method of CatalogueService.");
        return catalogueRepository.save(catalogue);
    }

    public Catalogue findCatalogueById(Long catalogueId) {
        log.info("Inside findCatalogueById method of CatalogueService.");
        return catalogueRepository.findByCatalogueId(catalogueId);
    }
}
