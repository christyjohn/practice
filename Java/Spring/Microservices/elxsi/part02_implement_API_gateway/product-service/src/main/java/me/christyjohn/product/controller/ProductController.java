package me.christyjohn.product.controller;

import lombok.extern.slf4j.Slf4j;
import me.christyjohn.product.VO.ResponseTemplateVO;
import me.christyjohn.product.entity.Product;
import me.christyjohn.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product) {
        log.info("Inside saveProduct method of ProductController");
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getProductWithCatalogue(@PathVariable("id") Long productId) {
        log.info("Inside getProductWithCatalogue method of ProductController");
        return productService.getProductWithCatalogue(productId);
    }
}
