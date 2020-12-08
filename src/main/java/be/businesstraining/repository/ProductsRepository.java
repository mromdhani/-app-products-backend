package be.businesstraining.repository;

import be.businesstraining.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository  extends JpaRepository<Product, Long> {
}
