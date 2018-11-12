package com.springboot.controller;

import com.springboot.dao.SellerRepository;
import com.springboot.domain.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {
    @Autowired
    private SellerRepository sellerRepository;

    @RequestMapping("/addseller")
    public String addSeller(Seller seller){
        sellerRepository.save(seller);
        return "success";
    }
}
