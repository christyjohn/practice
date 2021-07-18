package me.christyjohn.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import me.christyjohn.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
