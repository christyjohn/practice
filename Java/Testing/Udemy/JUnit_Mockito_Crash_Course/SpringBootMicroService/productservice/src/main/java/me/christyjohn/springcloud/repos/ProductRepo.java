package me.christyjohn.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import me.christyjohn.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
