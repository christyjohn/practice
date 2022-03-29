package me.christyjohn.catalogue.controller;

import lombok.extern.slf4j.Slf4j;
import me.christyjohn.catalogue.entity.Catalogue;
import me.christyjohn.catalogue.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalogues")
@Slf4j
public class CatalogueController {

    @Autowired
    private CatalogueService catalogueService;

    @PostMapping("/")
    public Catalogue saveCatalogue(@RequestBody Catalogue catalogue) {
        log.info("Inside saveCatalogue method of CatalogueController.");
        return catalogueService.saveCatalogue(catalogue);
    }

    @GetMapping("{id}")
    public Catalogue findCatalogueById(@PathVariable("id") Long catalogueId) {
        log.info("Inside findCatalogueById method of CatalogueController.");
        return catalogueService.findCatalogueById(catalogueId);
    }
}
