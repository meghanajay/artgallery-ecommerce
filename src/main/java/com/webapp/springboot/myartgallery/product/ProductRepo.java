package com.webapp.springboot.myartgallery.product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<ProductInfo, Integer> {

}
