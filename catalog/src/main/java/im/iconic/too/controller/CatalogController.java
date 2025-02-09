package im.iconic.too.controller;

import im.iconic.too.model.Catalog;
import im.iconic.too.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogRepository catalogRepository;

    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<List<Catalog>> getCatalog() {
        return ResponseEntity.ok(catalogRepository.findAll());
    }

    @PostMapping(value = "/add", produces = "application/json")
    public ResponseEntity<Catalog> addCatalog(Catalog catalog) {
        return ResponseEntity.ok(catalogRepository.save(catalog));
    }

}
