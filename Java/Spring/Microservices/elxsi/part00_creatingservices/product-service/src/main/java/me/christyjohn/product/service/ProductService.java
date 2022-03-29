package me.christyjohn.product.service;

import lombok.extern.slf4j.Slf4j;
import me.christyjohn.product.VO.Catalogue;
import me.christyjohn.product.VO.ResponseTemplateVO;
import me.christyjohn.product.entity.Product;
import me.christyjohn.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Product saveProduct(Product product) {
        log.info("Inside saveProduct method of ProductService");
        return productRepository.save(product);
    }

    public ResponseTemplateVO getProductWithCatalogue(Long productId) {
        log.info("Inside getProductWithCatalogue method of ProductService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Product product = productRepository.findByProductId(productId);

        Catalogue catalogue =
                restTemplate.getForObject("http://localhost:9001/catalogues/" + product.getCatalogueId()
                        , Catalogue.class);

        vo.setProduct(product);
        vo.setCatalogue(catalogue);

        return vo;
    }
}
