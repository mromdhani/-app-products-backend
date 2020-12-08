package be.businesstraining.rest;

import be.businesstraining.domain.Product;
import be.businesstraining.repository.ProductsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
@CrossOrigin(origins = "*")
public class ProductsResource {

    private ProductsRepository productsRepository;

    public ProductsResource(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productsRepository.findAll());
    }
}
