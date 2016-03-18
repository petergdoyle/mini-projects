package com.cleverfishsoftware.spring.mvc.service;

import java.util.List;

import com.cleverfishsoftware.spring.mvc.exception.ShopNotFound;
import com.cleverfishsoftware.spring.data.model.Shop;

public interface ShopService {
	
	public Shop create(Shop shop);
	public Shop delete(int id) throws ShopNotFound;
	public List<Shop> findAll();
	public Shop update(Shop shop) throws ShopNotFound;
	public Shop findById(int id);

}
