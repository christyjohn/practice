package me.christyjohn.springcloud;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import me.christyjohn.springcloud.controllers.CouponRestController;
import me.christyjohn.springcloud.model.Coupon;
import me.christyjohn.springcloud.repos.CouponRepo;

@SpringBootTest
public class CouponserviceApplicationTests {
	
	private static final String SUPERSALE = "SUPERSALE";

	@Mock
	private CouponRepo repo;

	@InjectMocks
	private CouponRestController controller;

	@Test
	public void testCreate() {
		Coupon coupon =new Coupon();
		coupon.setCode(SUPERSALE);
		when(repo.save(coupon)).thenReturn(coupon);
		Coupon couponCreated = controller.create(coupon);
		verify(repo).save(coupon);
		assertNotNull(couponCreated);
		assertEquals(SUPERSALE,coupon.getCode());
	}

}
