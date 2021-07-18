package me.christyjohn.springcloud;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import me.christyjohn.springcloud.controllers.ProductRestController;
import me.christyjohn.springcloud.dto.Coupon;
import me.christyjohn.springcloud.model.Product;
import me.christyjohn.springcloud.repos.ProductRepo;

@SpringBootTest
class ProductserviceApplicationTests {
	
	private static final String COUPON_CODE = "SUPERSALE";

	private static final String COUPON_SERVICE_URL = "http://localhost:9001/couponapi/coupons/";

	@Mock
	private RestTemplate restTemplate;
	
	@Mock
	private ProductRepo repo;
	
	@InjectMocks
	private ProductRestController controller;

	@Test
	void contextLoads() {
		Coupon coupon = new Coupon();
		coupon.setCode(COUPON_CODE);
		coupon.setDiscount(new BigDecimal(10));

		Product product = new Product();
		product.setCouponCode(COUPON_CODE);
		product.setPrice(new BigDecimal(100));
		
		controller.setCouponServiceURL(COUPON_SERVICE_URL);
		
		when(restTemplate.getForObject(COUPON_SERVICE_URL +
				COUPON_CODE, Coupon.class)).thenReturn(coupon);
		when(repo.save(product)).thenReturn(product);
		
		Product productCreated = controller.create(product);
		verify(restTemplate).getForObject(COUPON_SERVICE_URL +
				COUPON_CODE, Coupon.class);
		verify(repo).save(product);
		
		assertNotNull(productCreated);
		assertEquals(COUPON_CODE, productCreated.getCouponCode());
	}

}
