package com.cleverfishsoftware.spring.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleverfishsoftware.spring.data.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
