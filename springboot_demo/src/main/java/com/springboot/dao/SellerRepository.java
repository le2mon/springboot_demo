package com.springboot.dao;

import com.springboot.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SellerRepository extends JpaRepository<Seller,Integer>,
        JpaSpecificationExecutor<Seller> {
}
