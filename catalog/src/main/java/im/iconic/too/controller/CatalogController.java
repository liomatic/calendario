package im.iconic.too.controller;

import im.iconic.too.model.Catalog;
import im.iconic.too.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogRepository catalogRepository;

    @GetMapping("/all")
    public List<Catalog> getCatalog() {
        return catalogRepository.findAll();
    }

}
