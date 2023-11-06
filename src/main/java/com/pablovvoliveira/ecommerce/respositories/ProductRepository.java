package com.pablovvoliveira.ecommerce.respositories;

import com.pablovvoliveira.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
