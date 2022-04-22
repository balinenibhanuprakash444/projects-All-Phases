package com.project.SportyShoes.jdbc;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.SportyShoes.entity.Product;
public interface ProductRepositoryextendsJpaRepository<Product, Long> {

}
