package com.springboot.domain;

import javax.persistence.*;

@Entity
@Table(name = "seller")
public class Seller {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String sellerName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", sellerName='" + sellerName + '\'' +
                '}';
    }
}
